package com.javarush.task.task05.task0532;

import java.io.*;
import java.util.Arrays;

/* 
Задача по алгоритмам
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        if (n > 0) {
            int maximum = 0;
            int mas[] = new int[n];
            for (int i = 0; i < n; i++) {
                mas[i] = Integer.parseInt(reader.readLine());
            }
            Arrays.sort(mas);
            maximum = mas[n - 1];
            System.out.println(maximum);
        }
        //напишите тут ваш код
    }
}
