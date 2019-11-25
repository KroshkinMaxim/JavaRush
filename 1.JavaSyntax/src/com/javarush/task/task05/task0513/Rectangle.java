package com.javarush.task.task05.task0513;

/* 
Собираем прямоугольник
*/

public class Rectangle {
    //напишите тут ваш код
    int top;
    int left;
    int width;
    int height;

    public void initialize(int top, int left, int width, int height) {
        this.top = top;
        this.left = left;
        this.height = height;
        this.width = width;
    }

    public void initialize(int top, int left) {
        this.top = top;
        this.left = left;
        width = 0;
        height = 0;
    }

    public void initialize(int width) {
        this.width = width;
        this.height = width;
    }

    public void initialize (Rectangle rectangle) {
        this.top = rectangle.top;
        this.height = rectangle.height;
        this.width = rectangle.width;
        this.left = rectangle.left;

    }

    public static void main(String[] args) {

    }
}
