package com.example;

import java.util.HashMap;
import java.util.Map;

public class WorkingWithMaps {
    public static void main(String[] args) {
        Map<Integer, Person> personMap = new HashMap<>();
        personMap.put(1, new Person("Alex"));
        personMap.put(2, new Person("Maria"));
        personMap.put(3, new Person("John"));

        System.out.println(personMap);
        System.out.println(personMap.size());
        System.out.println(personMap.get(2));
        System.out.println(personMap.containsKey(4));
        System.out.println(personMap.containsValue("Tom"));
        System.out.println(personMap.keySet());
        System.out.println(personMap.entrySet());
        personMap.remove(3);

        personMap.forEach((key, person) -> {
            System.out.println(key + " - " + person);
        });
    }

    record Person(String name){}
}
