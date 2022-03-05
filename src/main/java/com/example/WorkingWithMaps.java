package com.example;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class WorkingWithMaps {
    public static void main(String[] args) {
        Map<Person, Diamond> diamondMap = new HashMap<>();

        //Person -> Key | Diamond -> Value
        diamondMap.put(new Person("Johny"), new Diamond("African Diamond"));

        System.out.println(new Person("Johny").hashCode());
        System.out.println(new Person("Johny").hashCode());
        System.out.println(diamondMap.get(new Person("Johny")));

    }


    private static void maps(){
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

    static class Person{
        String name;

        public Person(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    '}';
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Person person = (Person) o;
            return Objects.equals(name, person.name);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name);
        }
    }

    record Diamond(String name){}
}
