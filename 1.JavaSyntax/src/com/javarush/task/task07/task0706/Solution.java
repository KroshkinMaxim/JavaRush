package com.javarush.task.task07.task0706;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Улицы и дома
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        int[] houses = new int[15];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int odd = 0;
        int even = 0;
        for (int i = 0; i < 15; i++) {
            houses[i] = Integer.parseInt(reader.readLine());
        }
        for (int i = 0; i < houses.length; i+=2) {
            odd += houses[i];
        }
        for (int i = 1; i<houses.length; i+=2) {
            even += houses[i];
        }
        if (odd > even ) System.out.println("В домах с четными номерами проживает больше жителей.");
        else System.out.println("В домах с нечетными номерами проживает больше жителей.");
    }
}
