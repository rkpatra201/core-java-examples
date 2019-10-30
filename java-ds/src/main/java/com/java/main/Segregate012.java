package com.java.main;

public class Segregate012 {
    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 1, 1, 2, 0, 1, 0, 1, 2, 2};

        Node node0 = null;
        Node node0End = null;
        Node node1 = null;
        Node node1End = null;
        Node node2 = null;
        Node node2End = null;
        for (int i : arr) {
            if (i == 0) {
                Node current = new Node();
                current.data = i;
                current.next = null;
                if (node0 == null) {
                    node0 = current;
                    node0End = current;
                } else {
                    node0End.next = current;
                    node0End = current;
                }
            } else if (i == 1) {
                Node current = new Node();
                current.data = i;
                current.next = null;
                if (node1 == null) {
                    node1 = current;
                    node1End = current;
                } else {
                    node1End.next = current;
                    node1End = current;
                }

            } else if (i == 2) {
                Node current = new Node();
                current.data = i;
                current.next = null;
                if (node2 == null) {
                    node2 = current;
                    node2End = current;
                } else {
                    node2End.next = current;
                    node2End = current;
                }
            }
        }

        Node root = node0;
        node0End.next = node1;
        node1End.next = node2;

        while (root != null) {
            System.out.println(root.data);
            root = root.next;
        }
    }
}

class Node {
    int data;
    Node next;
}
