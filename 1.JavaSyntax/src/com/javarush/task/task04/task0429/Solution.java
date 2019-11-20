package com.javarush.task.task04.task0429;

/* 
Положительные и отрицательные числа
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s1 = reader.readLine();
        String s2 = reader.readLine();
        String s3 = reader.readLine();
        int x1 = Integer.parseInt(s1);
        int x2 = Integer.parseInt(s2);
        int x3 = Integer.parseInt(s3);
        int countPositive = 0;
        int countNegative = 0;
        if (x1 > 0) countPositive++;
        else if (x1 < 0) countNegative++;
        if (x2 > 0) countPositive++;
        else if (x2 < 0) countNegative++;
        if (x3 > 0) countPositive++;
        else if (x3 < 0) countNegative++;
        System.out.println("количество отрицательных чисел: "+countNegative);
        System.out.println("количество положительных чисел: "+countPositive);
    }
}
