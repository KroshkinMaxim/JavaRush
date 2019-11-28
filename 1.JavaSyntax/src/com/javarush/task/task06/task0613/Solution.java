package com.javarush.task.task06.task0613;

/* 
Кот и статика
*/

public class Solution {
    public static void main(String[] args) {
        // Создай 10 котов
        for (int i = 0; i<10; i++) {
            new Cat();
        }
        // Выведи значение переменной catCount
        System.out.println(Cat.getCatCount());
    }

    public static class Cat {
        // Создай статическую переменную catCount
        public static int catCount = 0;

        // Создай конструктор
        public Cat(){
            catCount++;
        }

        public static int getCatCount() {
            return catCount;
        }
    }
}
