package com.javarush.task.task07.task0705;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Один большой массив и два маленьких
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        int[] big = new int[20];
        int[] smallOne = new int[10];
        int[] smallTwo = new int[10];

        for (int i = 0; i<20; i++) {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            big[i] = Integer.parseInt(reader.readLine());
        }
        for (int i = 0; i < 10; i++) {
            smallOne[i] = big[i];
        }

        for (int i = 10; i < 20; i++) {
            smallTwo[i-10] = big[i];
            System.out.println(smallTwo[i-10]);
        }
    }
}
