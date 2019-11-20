package com.javarush.task.task04.task0426;

/* 
Ярлыки и числа
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        int x = Integer.parseInt(s);
        if (x == 0) System.out.println("ноль");
        else if (x > 0) {
            if (x % 2 == 0) System.out.println("положительное четное число");
            else System.out.println("положительное нечетное число");
        } else if (x < 0) {
            if (x % 2 == 0) System.out.println("отрицательное четное число");
            else System.out.println("отрицательное нечетное число");
        }
    }
}

