package com.java.sll;

import com.java.sll.common.NodeRandom;


/**
 * 1. iterate source list. create new clone nodes such that. new_clone_node.next = source.next and source.next = new_clone_node
 * 2. iterate again on source to attache random pointers from source with each clone node.
 * new_node_clone.r = current.r.next;
 * 3. iterate again on sourceList(attached with clone list) rearrange the source list and clone list.
 */
public class NodeRandomMain {
    public static void main(String[] args) {
        NodeRandom sourceListRoot = new NodeRandom();
        NodeRandom source2 = new NodeRandom();
        NodeRandom source3 = new NodeRandom();
        NodeRandom source4 = new NodeRandom();

        sourceListRoot.setPointers(1, source2, source3);
        source2.setPointers(2, source3, sourceListRoot);
        source3.setPointers(3, source4, source2);
        source4.setPointers(4, null, sourceListRoot);

        display(sourceListRoot, "display source ll");
        // step 1: create and attache clone nodes between source nodes.
        NodeRandom current = sourceListRoot;
        NodeRandom cloneListRoot = null;
        NodeRandom cloneTailNode = null;
        while (current != null) {
            NodeRandom cloneTempNode = new NodeRandom();
            NodeRandom currentNextTemp = current.next;
            current.next = cloneTempNode;
            cloneTempNode.data = current.data;
            cloneTempNode.next = currentNextTemp;

            if (cloneListRoot == null) {
                cloneListRoot = cloneTempNode;
                cloneTailNode = cloneTempNode;
            } else {
                cloneTailNode.next = current;
                current.next = cloneTempNode;
                cloneTailNode = cloneTempNode;
            }
            current = currentNextTemp;
        }

        display(sourceListRoot, "source node - clone node - source node");

        // step 2 : attach random nodes with clone node from source node
        current = sourceListRoot;
        while (current != null) {
            NodeRandom cloneNode = current.next;
            if (cloneNode != null) {
                cloneNode.random = current.random.next;
                current = cloneNode.next;
                continue;
            }
            current = current.next;
        }

        display(sourceListRoot, "attached random nodes with cloned list");

        // step 3: restore back the source list and cloned list
        current = sourceListRoot;
        cloneTailNode = cloneListRoot;
        while (current != null) {
            NodeRandom cloneNode = current.next;
            if (cloneNode != null) {
                current.next = cloneNode.next;
                cloneTailNode.next = cloneNode;
                cloneTailNode = cloneNode;
            }
            current = current.next;
        }
        display(sourceListRoot, "rearranged source list");
        display(cloneListRoot, "rearranged clone list");
    }

    public static void display(NodeRandom current, String message) {
        System.out.println("\n"+message);
        while (current != null) {
            System.out.println(current);
            current = current.next;
        }
    }
}
