package com.example;

import java.util.LinkedList;
import java.util.Queue;

public class WorkingWithQueues {
    public static void main(String[] args) {
        Queue<Person> supermarket = new LinkedList<>();

        supermarket.add(new Person("Alex", 19));
        supermarket.add(new Person("Maria", 24));
        supermarket.add(new Person("Tom", 17));
        supermarket.add(new Person("John", 23));

        System.out.println(supermarket.size());
        System.out.println(supermarket.peek()); //It gives us the first element of queue
        System.out.println(supermarket.poll()); //It gives us the first element and delete it
        System.out.println(supermarket.size());
        System.out.println(supermarket.peek());

    }

    record Person(String name, int age){}
}
