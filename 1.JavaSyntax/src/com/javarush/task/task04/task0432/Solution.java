package com.javarush.task.task04.task0432;

/* 
Хорошего много не бывает
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int N = sc.nextInt();
        int i = 0;
        while (i < N) {
            System.out.println(s);
            i++;
        }
    }
}
