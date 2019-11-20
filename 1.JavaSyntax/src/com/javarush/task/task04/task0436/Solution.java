package com.javarush.task.task04.task0436;

/* 
Рисуем прямоугольник
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        for (int i = 0; i<m; i++) {
            for (int j=0; j<n; j++) {
                System.out.print("8");
            }
            System.out.print("\n");
        }

    }
}
