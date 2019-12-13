package com.java.arrays.common;

public class DeliveryTrips {
    public static void main(String[] args) {
        int arr[] = {1, 4, 6, 10, 12};
        int min_items = 1;
        int max_items = 12;
        int max_allowed_trips = 10;
        // ceiling of arr elements sum / max_allowed_trips
        for (int i = min_items; i <= max_items; i++) {
            int trips = 0;

            for (int item : arr) {
                if (item % i == 0) {
                    trips += item / i;
                } else {
                    trips += item / i + 1;
                }
            }
            if (trips <= max_allowed_trips) {
                System.out.println("total trips: " + trips + " items per trip: " + i);
                break;
            }
        }
    }
}
