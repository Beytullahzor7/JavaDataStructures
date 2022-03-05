package com.example;

import java.util.HashSet;
import java.util.Set;

public class WorkingWithSets {
    public static void main(String[] args) {
        Set<Ball> balls = new HashSet<>();

        balls.add(new Ball("Green"));
        balls.add(new Ball("Green")); //Sets does not allowe duplicate elements
        balls.add(new Ball("Red"));
        balls.forEach(System.out::println);
        System.out.println(balls.size());
    }

    record Ball(String color){}
}
