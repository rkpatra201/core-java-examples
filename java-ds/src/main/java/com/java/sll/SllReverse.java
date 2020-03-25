package com.java.sll;

import com.java.sll.common.Node;

public class SllReverse {
    public static void main(String[] args) {

        Node node1 = new Node();
        node1.data=1;
        Node node2 = new Node();
        node2.data=2;
        Node node3 = new Node();
        node3.data=3;

        node1.next=node2;
        node2.next=node3;

        displayLinkedList(node1);
        Node reverseNode=reverseNode(node1);
        System.out.println("after reverse");
        displayLinkedList(reverseNode);
    }

    private static void displayLinkedList(Node head)
    {
        Node current=head;
        while(current!=null)
        {
            System.out.println(current.data);
            current=current.next;
        }

    }
    private static Node reverseNode(Node head)
    {
        Node current = head;
        Node actualNext = null;
        Node prev = null;
        while(current!=null)
        {
            // logic is here
            actualNext = current.next;
            current.next=prev;
            prev=current;
            current=actualNext;
        }
        head=prev;
        return head;
    }
}
