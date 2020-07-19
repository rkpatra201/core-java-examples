package com.java.stack;

import java.util.Stack;

public class BalancedParantheses {
    public static void main(String[] args) {
        String s = "()()";
        int res = countUnbalanced(s);
        System.out.println(res);
    }

    private static int countUnbalanced(String s) {
        char[] chars = s.toCharArray();
        Stack<Character> stack = new Stack<>();
        for (char current : chars) {
            if (current == '(') {
                stack.push(current);
            } else {
                if (!stack.isEmpty()) {
                    char top = stack.peek();
                    if (top == '(' && current == ')') {
                        stack.pop();
                    } else {
                        stack.push(current);
                    }
                }
                else {
                    stack.push(current);
                }
            }
        }

        return stack.size();
    }
}
