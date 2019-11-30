package com.javarush.task.task07.task0715;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Продолжаем мыть раму
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        ArrayList<String> strings = new ArrayList<>();
        strings.add("мама");
        strings.add("мыла");
        strings.add("раму");
        for (int i = 1; i < 6; i +=2) {
            strings.add(i, "именно");
        }
        for (int i = 0; i<strings.size(); i++) {
            System.out.println(strings.get(i));
        }
    }
}
