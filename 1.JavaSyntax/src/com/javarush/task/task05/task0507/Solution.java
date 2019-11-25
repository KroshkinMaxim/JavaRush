package com.javarush.task.task05.task0507;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Среднее арифметическое
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Scanner sc = new Scanner(System.in);
        float sum = 0;
        float count = 0;
        float result = 0;
        while (true) {
            int number = sc.nextInt();
            if (number == -1)
                break;
            sum += number;
            count++;
        }
        if (count == 0) System.out.println("0");
        else {
            result = sum / count;
            System.out.println(result);
        }
    }
}

