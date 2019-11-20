package com.javarush.task.task04.task0428;

/* 
Положительное число
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
        int count = 0;
        if (x1>0) count++;
        if (x2>0) count++;
        if (x3>0) count++;
        System.out.println(count);
    }
}
