package com.javarush.task.task07.task0721;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Минимаксы в массивах
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int maximum;
        int minimum;

        //напишите тут ваш код

        int[] num = new int[20];

        for (int i = 0; i < num.length; i++) {
            num[i] = Integer.parseInt(reader.readLine());
        }

        minimum = num[0];
        maximum = num[0];

        for (int i = 1; i < num.length; i++) {
            if (num[i] < minimum) minimum = num[i];
            else if (num[i] > maximum) maximum = num[i];
        }
        System.out.print(maximum + " " + minimum);
    }
}
