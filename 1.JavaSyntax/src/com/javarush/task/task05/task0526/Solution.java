package com.javarush.task.task05.task0526;

/* 
Мужчина и женщина
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Man maxim = new Man("Maxim", 24, "Moscow");
        Man ali = new Man("Ali", 30, "Moscow");
        Woman julia = new Woman("Julia", 29, "Moscow");
        Woman ann = new Woman("Ann", 26, "Tolliaty");
        System.out.println(maxim.name + " " + maxim.age + " " + maxim.address);
        System.out.println(ali.name + " " + ali.age + " " + ali.address);
        System.out.println(julia.name + " " + julia.age + " " + julia.address);
        System.out.println(ann.name + " " + ann.age + " " + ann.address);
    }

    //напишите тут ваш код

    public static class Person {
        String name = null, address = null;
        int age;

        public Person(String name, int age, String address) {
            this.name = name;
            this.age = age;
            this.address = address;
        }
    }

    public static class Man extends Person {

        public Man(String name, int age, String address) {
            super(name, age, address);
        }
    }

    public static class Woman extends Person {

        public Woman(String name, int age, String address) {
            super(name, age, address);
        }
    }
}
