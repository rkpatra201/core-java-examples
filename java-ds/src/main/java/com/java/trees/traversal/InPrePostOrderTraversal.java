package com.java.trees.traversal;

import com.java.trees.model.Node;

public class InPrePostOrderTraversal {

    public static void main(String[] args) {

        Node n8 = new Node(8, null, null);
        Node n10 = new Node(10, null, null);
        Node n9 = new Node(9, n10, null);

        Node n4 = new Node(4, null, null);
        Node n5 = new Node(5, null, n8);
        Node n6 = new Node(6, null, n9);
        Node n7 = new Node(7, null, null);

        Node n3 = new Node(3, n6, n7);
        Node n2 = new Node(2, n4, n5);
        Node n1 = new Node(1, n2, n3);

        System.out.println("\nin-order");
        inOrder(n1);


        System.out.println("\npost-order");
        postOrder(n1);

        System.out.println("\npre-order");
        preOrder(n1);
    }

    private static  void inOrder(Node root)
    {
        if(root == null)
        {
            return;
        }
        inOrder(root.left);
        System.out.print(root.data+"\t");
        inOrder(root.right);
    }


    private static  void postOrder(Node root)
    {
        if(root == null)
        {
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data+"\t");
    }

    private static  void preOrder(Node root)
    {
        if(root == null)
        {
            return;
        }
        System.out.print(root.data+"\t");
        preOrder(root.left);
        preOrder(root.right);
    }
}

