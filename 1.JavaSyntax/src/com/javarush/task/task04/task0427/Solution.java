package com.javarush.task.task04.task0427;

/* 
Описываем числа
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        int x = Integer.parseInt(s);
        //Четное
        if (x > 0 && x < 1000) {
            if (x / 100 > 0) {
                if (x % 2 == 0) System.out.println("четное трехзначное число");
                else System.out.println("нечетное трехзначное число");
            } else if (x / 10 > 0) {
                if (x % 2 == 0) System.out.println("четное двузначное число");
                else System.out.println("нечетное двузначное число");
            } else {
                if (x % 2 == 0) System.out.println("четное однозначное число");
                else System.out.println("нечетное однозначное число");
            }
        }
    }
}
