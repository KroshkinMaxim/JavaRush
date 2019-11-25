package com.javarush.task.task05.task0514;

/* 
Программист создает человека
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Person person = new Person();
        person.initialize("Maxim", 24);
    }

    static class Person {
        //напишите тут ваш код
        String name = null;
        int age;

        public void initialize(String name, int age) {
            this.name = name;
            this.age = age;
        }
    }


}
