package com.javarush.task.task05.task0502;

/* 
Реализовать метод fight
*/

public class Cat {
    public int age;
    public int weight;
    public int strength;

    public Cat() {
    }

    public boolean fight(Cat anotherCat) {
        //напишите тут ваш код
        int me = 0;
        int he = 0;
        if (this.age > anotherCat.age) me++;
        else if (this.age < anotherCat.age) he++;
        if (this.weight > anotherCat.weight) me++;
        else if (this.weight < anotherCat.weight) he++;
        if (this.strength > anotherCat.strength) me++;
        else if (this.strength < anotherCat.strength) he++;
        if (me > he) return true;
        else return false;
    }

    public static void main(String[] args) {
//        Cat vasya = new Cat();
//        Cat petya = new Cat();
//        vasya.age=10;
//        vasya.strength=10;
//        vasya.weight=5;
//        petya.age=5;
//        petya.weight=10;
//        petya.strength=10;
//        System.out.println(vasya.fight(petya));
    }
}
