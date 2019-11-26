package com.java.sll;

import com.java.sll.common.Node;

import java.util.HashSet;
import java.util.Set;

public class SllRemoveDuplicates {
    public static void main(String[] args) {
        Node node1 = new Node();
        node1.data=1;
        Node node2 = new Node();
        node2.data=2;
        Node node3 = new Node();
        node3.data=3;
        Node node4 = new Node();
        node4.data=2;



        node1.next=node2;
        node2.next=node3;
        node3.next=node4;
        Node current=node1;
        Set<Integer> uniqueSet = new HashSet<>();
        Node prev = null;
        while(current!=null)
        {
            // logic is here
            if(uniqueSet.contains(current.data))
            {
                prev.next=current.next;
            }
            else
            {
                uniqueSet.add(current.data);
                prev = current;
            }
            current=current.next;
        }
        current=node1;
        while(current!=null)
        {
            System.out.println(current.data);
            current=current.next;
        }
    }
}
