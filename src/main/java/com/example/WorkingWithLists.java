package com.example;

import java.util.ArrayList;
import java.util.List;

public class WorkingWithLists {
    public static void main(String[] args) {

        List<String> colorsUnmodifiable = List.of(
                "red",
                "green"
        );

        List<String > colors = new ArrayList<>();

        colors.add("yellow");
        colors.add("green");
        //colors.add(1); // It is better to define which data type we gonna use in List<>

        System.out.println(colors.size());
        System.out.println(colors.contains("blue"));

        colors.forEach(System.out::println);

        for (int i=0; i<colors.size(); i++){
            System.out.println(colors.get(i));
        }
    }
}
