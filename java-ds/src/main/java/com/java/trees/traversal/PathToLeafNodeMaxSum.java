package com.java.trees.traversal;

import com.java.trees.model.Node;

import java.util.Stack;

/**
 * 1. Path to leaf node.
 * 2. Path having max sum
 * <p>
 * approach:
 * add to stack if root is not null.
 * do inorder.
 * after inorder processing check if the node is leaf node.
 * if leaf node
 *      print the stack state or
 *      evaluate the max sum so far for the paths.
 * pop a node from the stack.
 */
public class PathToLeafNodeMaxSum {

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

        inOrder(n1); // this print path to leaf node using stack.

        /** display path with max sum **/
        System.out.println();
        displayStack(stackSumWrapper.stack, false);

    }

    private static Stack<Node> nodeStack = new Stack<>();
    private static StackSumWrapper stackSumWrapper = new StackSumWrapper();

    public static void inOrder(Node root) {
        if (root == null) {
            return;
        } else {
            nodeStack.push(root); // this is special for this problem to track the path.
        }
        /** inorder flow start **/
        inOrder(root.left);
        // System.out.println(root.data); // comment this as it is not required in this problem.
        inOrder(root.right);
        /** inorder flow end **/

        /** display path logic begin **/
        boolean leafNode = isLeafNode(root);
        /** if leaf node display and
         * evaluate maxSum and save the stack state **/
        if (leafNode) {
            displayStack(nodeStack, true);
        }
        /** remove the top node **/
        if (!nodeStack.isEmpty()) {
            nodeStack.pop();
        }

    }

    private static void displayStack(Stack<Node> stack, boolean flag) {
        int tempSum = 0;
        for (Node n : stack) {
            System.out.print(n.data + "\t");
            if (flag == true) {
                tempSum = tempSum + n.data;
            }
        }
        if (flag == true && tempSum > stackSumWrapper.sum) {
            stackSumWrapper.stack = (Stack<Node>) nodeStack.clone();
            stackSumWrapper.sum = tempSum;
        }
        System.out.println();
    }

    private static boolean isLeafNode(Node root) {
        if (root.left == null && root.right == null) {
            return true;
        }
        return false;
    }
}

class StackSumWrapper {
    int sum;
    Stack<Node> stack;
}
