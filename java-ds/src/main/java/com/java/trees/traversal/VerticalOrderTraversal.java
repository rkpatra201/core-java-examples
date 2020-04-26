package com.java.trees.traversal;

import com.java.trees.model.DistanceNode;

import java.util.*;

public class VerticalOrderTraversal {

    /**
     * do level order traversal.
     * <p>
     * use horizontal distance(Hd) mapping after printing.
     * while printing in level order add to map<Integer,List<Integer>>
     * 0: 1, 1: 2,3 like this. not correct answer this is an example of map content only.
     * <p>
     * set Hd value while adding child nodes to queue by below algo.
     * Hd(parent) =0
     * Hd(left) = Hd(parent) -1
     * Hd(right) = Hd(parent) + 1
     */
    private static Map<Integer, List<Integer>> hdNodeMapping = new TreeMap<>();

    public static void main(String[] args) {
        DistanceNode n8 = new DistanceNode(8, null, null);
        DistanceNode n9 = new DistanceNode(9, null, null);
        DistanceNode n10 = new DistanceNode(10, null, null);
        DistanceNode n11 = new DistanceNode(11, null, null);

        DistanceNode n4 = new DistanceNode(4, null, n8);
        DistanceNode n5 = new DistanceNode(5, n9, null);
        DistanceNode n6 = new DistanceNode(6, n10, null);
        DistanceNode n7 = new DistanceNode(7, null, n11);
        DistanceNode n2 = new DistanceNode(2, n4, n5);
        DistanceNode n3 = new DistanceNode(3, n6, n7);
        DistanceNode n1 = new DistanceNode(1, n2, n3);


        printLevelOrder(n1);

        System.out.println();
        System.out.println(hdNodeMapping);
    }

    private static void printLevelOrder(DistanceNode root) {
        if (root == null) {
            return;
        }
        Queue<DistanceNode> q = new LinkedList<>();
        root.hd = 0;
        q.add(root);
        while (!q.isEmpty()) {
            DistanceNode current = q.poll();
            System.out.print(current.data + "\t");
            addToHdNodeMapping(current); // mapping with hd
            if (current.left != null) {
                current.left.hd = current.hd - 1; // algo step
                q.add(current.left);
            }
            if (current.right != null) {
                current.right.hd = current.hd + 1; // algo step
                q.add(current.right);
            }
        }
    }

    private static void addToHdNodeMapping(DistanceNode n) {
        if (hdNodeMapping.containsKey(n.hd)) {
            hdNodeMapping.get(n.hd).add(n.data);
        } else {
            List<Integer> nodeDataList = new ArrayList<>();
            nodeDataList.add(n.data);
            hdNodeMapping.put(n.hd, nodeDataList);
        }
    }


}
