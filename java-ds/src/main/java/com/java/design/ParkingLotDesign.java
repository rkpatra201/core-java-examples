package com.java.design;

import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.ConcurrentHashMap;

/**
 * any way car can go for/exit from parking
 * multilevel parking
 * no car can be parked more than once.
 * ground floor must be parked first.
 */
public class ParkingLotDesign {
    public static void main(String[] args) {
        IParkingSystem parkingSystem = new ParkingSystemImpl(3, 5);
        System.out.println(parkingSystem);
        for (int i = 1; i <= 12; i++) {
            String carNum = "c" + i;

            new Thread() {
                @Override
                public void run() {
                    String parkedAt = parkingSystem.doParking(carNum);
                    System.out.println("carNum: " + carNum + " parkedAt: " + parkedAt);
                }
            }.start();
        }
        for (int i = 1; i <= 12; i++) {
            String carNum = "c" + i;
            new Thread() {
                @Override
                public void run() {
                    String leftAt = parkingSystem.leaveParking(carNum);
                    System.out.println("carNum: " + carNum + " leftAt: " + leftAt);
                }
            }.start();
        }
    }
}


interface IParkingSystem {
    // returns position from which car left
    String doParking(String carNum);

    // returns position at which car has been parked.
    String leaveParking(String carNum);
}

class ParkingSystemImpl implements IParkingSystem {
    private Map<String, String> carNumLotPositionMap = new ConcurrentHashMap<>();
    private Map<Integer, Queue<String>> freePositionFloorMap = new LinkedHashMap<>();
    // 4, 60
    private int floors;

    public ParkingSystemImpl(int floors, int maxLot) {
        this.floors = floors;
        // 1:1-1,1-2...1-60
        // 2:2-1...2-60
        for (int floor = 1; floor <= floors; floor++) {
            for (int lot = 1; lot <= maxLot; lot++) {
                String lotPosition = floor + "-" + lot;
                if (freePositionFloorMap.containsKey(floor)) {
                    freePositionFloorMap.get(floor).add(lotPosition);
                } else {
                    Queue<String> lotPositions = new LinkedList<>();
                    lotPositions.offer(lotPosition);
                    freePositionFloorMap.put(floor, lotPositions);
                }
            }
        }
        System.out.println(freePositionFloorMap);
    }

    @Override
    public String doParking(String carNum) {
        String carLotPosition = carNumLotPositionMap.get(carNum);
        if (carLotPosition != null) {
            System.out.println("car already parked at " + carLotPosition);
            return carLotPosition;
        } else {
            for (int i = 1; i <= floors; i++) {
                Queue<String> lotPositions = freePositionFloorMap.get(i);
                synchronized (lotPositions) {
                    if (lotPositions.isEmpty()) {
                        // continue to the next floor
                        continue;
                    } else {
                        carLotPosition = lotPositions.poll();
                        carNumLotPositionMap.put(carNum, carLotPosition);
                        break;
                    }
                }
            }
            return carLotPosition;
        }
    }

    @Override
    public String leaveParking(String carNum) {
        String carLotPosition = null;
        if (carNumLotPositionMap.containsKey(carNum)) {
            carLotPosition = carNumLotPositionMap.get(carNum);
            String[] arr = carLotPosition.split("-");
            int floorNum = Integer.valueOf(arr[0]);
            Queue<String> lotPositions = freePositionFloorMap.get(floorNum);
            lotPositions.offer(carLotPosition);
            carNumLotPositionMap.remove(carNum);
        }
        return carLotPosition;
    }
}