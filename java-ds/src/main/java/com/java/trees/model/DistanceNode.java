package com.java.trees.model;

public class DistanceNode {

    public int hd;
    public int data;
    public DistanceNode left;
    public DistanceNode right;

    public DistanceNode(int data, DistanceNode left, DistanceNode right) {
        this.data = data;
        this.left = left;
        this.right = right;
    }
}
