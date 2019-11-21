package com.javarush.task.task04.task0441;

/* 
Как-то средненько
*/

import java.io.*;
import java.lang.reflect.Array;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int arr[]= new int[3];
        for (int i = 0; i<3; i++) {
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        System.out.println(arr[1]);
    }
}
