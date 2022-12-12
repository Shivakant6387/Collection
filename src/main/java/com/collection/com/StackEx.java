package com.collection.com;

import java.util.Stack;

public class StackEx {
    public static void main(String[] args) {
        Stack<Double>stack=new Stack<>();
        stack.push(10.2);
        stack.push(50.80);
        stack.push(30.30);
        stack.push(40.90);
        stack.push(70.70);
        System.out.println(stack);
        System.out.println(stack.peek());
        System.out.println(stack.pop());

        System.out.println(stack.search(70.70));
    }
}
