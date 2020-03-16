package com.javarush.task.task12.task1215;

/* 
Кошки не должны быть абстрактными!
*/

public class Solution {
    public static void main(String[] args) {

    }

    public static abstract class Pet {
        public abstract String getName();

        public abstract Pet getChild();
    }

    public static class Cat extends Pet {

        public String getName() {
            return "Baksik";
        }

        public Pet getChild() {
            Cat cat = new Cat();
            return cat;
        }

    }

    public static class Dog extends Pet {
        public String getName() {
            return "Richard";
        }

        public Pet getChild() {
            Dog dog = new Dog();
            return dog;
        }


    }

}
