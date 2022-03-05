package com.example;

import java.util.Stack;

public class WorkingWithStacks {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);


        System.out.println(stack.peek()); //It gives us the last element (LIFO)
        System.out.println(stack.size());
        System.out.println(stack.pop()); //It gives us the last element and delete it
        System.out.println(stack.size());

    }
}
