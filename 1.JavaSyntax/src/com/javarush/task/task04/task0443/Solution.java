package com.javarush.task.task04.task0443;

/* 
Как назвали, так назвали
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        int y = sc.nextInt();
        int m = sc.nextInt();
        int d = sc.nextInt();
        System.out.println("Меня зовут "+name+".");
        System.out.println("Я родился "+d+"."+m+"."+y);
    }
}
