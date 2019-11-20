package com.javarush.task.task04.task0433;

/* 
Гадание на долларовый счет
*/

public class Solution {
    public static void main(String[] args) {
        String s = "S";
        int i = 0;
        int j = 0;
        while (i<10) {
            while (j < 10) {
                System.out.print(s);
                j++;
            }
            j=0;
            System.out.print("\n");
            i++;
        }

    }
}
