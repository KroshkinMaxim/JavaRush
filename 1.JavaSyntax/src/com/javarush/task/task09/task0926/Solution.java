package com.javarush.task.task09.task0926;

import java.util.ArrayList;

/* 
Список из массивов чисел
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<int[]> list = createList();
        printList(list);
    }

    public static ArrayList<int[]> createList() {
        //напишите тут ваш код
        ArrayList<int[]> list = new ArrayList<>();
        int[] mas1 = new int[5];
        for (int i = 0; i<mas1.length; i++) {
            mas1[i] = i;
        }
        int[] mas2 = new int[2];
        for (int i = 0; i<mas2.length; i++) {
            mas2[i] = i;
        }
        int[] mas3 = new int[4];
        for (int i = 0; i<mas3.length; i++) {
            mas3[i] = i;
        }
        int[] mas4 = new int[7];
        for (int i = 0; i<mas4.length; i++) {
            mas4[i] = i;
        }
        int[] mas5 = new int[0];
        list.add(mas1);
        list.add(mas2);
        list.add(mas3);
        list.add(mas4);
        list.add(mas5);
        return list;
    }

    public static void printList(ArrayList<int[]> list) {
        for (int[] array : list) {
            for (int x : array) {
                System.out.println(x);
            }
        }
    }
}
