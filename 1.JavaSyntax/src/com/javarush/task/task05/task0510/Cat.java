package com.javarush.task.task05.task0510;

/* 
Кошкоинициация
*/

public class Cat {
    //напишите тут ваш код
    String name = null;
    int age;
    int weight;
    String address = null;
    String color = null;

    public void initialize (String name) {
        this.name = name;
        age = 5;
        weight = 7;
        color = "orange";
    }

    public void initialize (String name, int weight, int age) {
        this.name = name;
        this.weight = weight;
        this.age = age;
        color = "orange";
    }

    public void initialize (String name, int age) {
        this.name = name;
        this.age = age;
        weight = 7;
        color = "orange";
    }
    public void initialize (int weight, String color) {
        this.weight = weight;
        this.color = color;
        age = 5;
    }

    public void initialize (int weight, String color, String address) {
        this.weight = weight;
        this.color = color;
        this.address = address;
        this.age = 5;
    }

    public static void main(String[] args) {

    }
}
