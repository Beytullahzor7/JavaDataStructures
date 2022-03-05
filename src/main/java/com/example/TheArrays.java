package com.example;

import java.util.Arrays;

public class TheArrays {
    public static void main(String[] args) {
        String[] colors = new String[3]; //Empty array has 5 spaces
        colors[0] = "purple";
        colors[1] = "blue";

        System.out.println(Arrays.toString(colors));
        System.out.println(colors[0]);
        System.out.println(colors[1]);


        int[] numbers = {10, 20, 30, 40, 50}; //When u know the elements that your array will have
        //Once u defind an array, u are no longer able to change the size

        for(int i = 0; i<numbers.length; i++){
            System.out.print(numbers[i] + "-");
        }

        for(int i = numbers.length-1; i>=0; i--){
            System.out.println(numbers[i]);
        }

        System.out.println(colors.length);
        System.out.println(numbers.length);
        System.out.println("*****************");


        for(String temp : colors){
            System.out.println(temp);
        }

        System.out.println("*****************");


        Arrays.stream(colors).forEach(System.out::println); //Method reference
    }
}
