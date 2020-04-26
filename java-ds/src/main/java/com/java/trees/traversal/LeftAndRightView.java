package com.java.trees.traversal;

import com.java.trees.model.Node;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LeftAndRightView {
    public static void main(String[] args) {
        Node n8 = new Node(8, null, null);
        Node n9 = new Node(9, null, null);
        Node n10 = new Node(10, null, null);
        Node n11 = new Node(11, null, null);
        Node n12 = new Node(12, null, null);
        Node n13 = new Node(13, null, null);
        Node n14 = new Node(14, null, null);

        Node n4 = new Node(4, n8, null);
        Node n5 = new Node(5, n9, n10);
        Node n6 = new Node(6, n11, n12);
        Node n7 = new Node(7, n13, n14);

        Node n2 = new Node(2, n4, n5);
        Node n3 = new Node(3, n6, n7);
        Node n1 = new Node(1, n2, n3);

        Node root = n1;
        printLevelWise(root);

        displayLevelList();
        displayLeftView();
        displayRightView();
    }


    private static List<List<Integer>> levelList = new ArrayList<>();

    public static void printLevelWise(Node root) {
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);

        int count = 0;
        while (!q.isEmpty()) {
            Node current = q.poll();
            if (current != null) {
                System.out.print(current.data + "\t");
                if (current.left != null) {
                    q.add(current.left);
                }
                if (current.right != null) {
                    q.add(current.right);
                }
                if (count == 1) {
                    count = 0;
                }
                addToLevel(current.data);
            } else {
                System.out.println();
                q.add(null);
                count++;
                addLevel();
            }

            if (count >= 2) {
                break;
            }
        }
    }

    private static void addLevel() {
        levelList.add(new ArrayList<>());
    }

    private static void addToLevel(int data) {
        if (levelList.size() == 0) {
            addLevel();
        }
        levelList.get(levelList.size() - 1).add(data);
    }

    private static void displayLevelList() {
        System.out.println(levelList);
    }

    private static void displayLeftView() {
        System.out.println("\nleft view:");
        for (List<Integer> list : levelList) {
            if (list.size() > 0) {
                System.out.print(list.get(0) + "\t");
            }
        }
    }


    private static void displayRightView() {
        System.out.println("\nright view:");
        for (List<Integer> list : levelList) {
            if (list.size() > 0) {
                System.out.print(list.get(list.size() - 1) + "\t");
            }
        }
    }
}
