package com.javarush.task.task05.task0522;

/* 
Максимум конструкторов
*/

public class Circle {
    public double x;
    public double y;
    public double radius;

    Circle circle;

    //напишите тут ваш код
    public Circle(double x, double y, double radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public Circle() {
    }

    public Circle(double x, double y) {
        this.x = x;
        this.y = y;
        this.radius = 10;
    }

    public Circle(Circle circle){
        this(circle.x, circle.y, circle.radius);
    }

    public static void main(String[] args) {

    }
}