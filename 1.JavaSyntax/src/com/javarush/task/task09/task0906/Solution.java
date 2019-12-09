package com.javarush.task.task09.task0906;

/* 
Логирование стек-трейса
*/

public class Solution {
    public static void main(String[] args) {
        log("In main method");
//        method1();
    }

    public static void log(String s) {
        //напишите тут ваш код
        StackTraceElement[] element = Thread.currentThread().getStackTrace();
        String a = element[2].getClassName();
        String b = element[2].getMethodName();
        System.out.println(a + ": " + b + ": " + s);
    }

//    public static void method1(){
//        log("In method 1");
//        method2();
//    }
//    public static void method2() {
//
//    }
}
