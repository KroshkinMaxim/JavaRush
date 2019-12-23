package com.javarush.task.task10.task1015;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

/* 
Массив списков строк
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<String>[] arrayOfStringList = createList();
        printList(arrayOfStringList);
    }

    public static ArrayList<String>[] createList() {
        //напишите тут ваш код

        ArrayList<String> list1 = new ArrayList<>();
        list1.add("Maxim");
        ArrayList<String> list2 = new ArrayList<>();
        list2.add("Maxim");
        list2.add("Julia");
        ArrayList<String> list3 = new ArrayList<>();
        list3.add("Maxim");
        list3.add("Maxia");


        ArrayList<String>[] result = (ArrayList<String>[]) new ArrayList[3];
        result[0] = list1;
        result[1] = list2;
        result[2] = list3;
        return result;
    }

    public static void printList(ArrayList<String>[] arrayOfStringList) {
        for (ArrayList<String> list : arrayOfStringList) {
            for (String s : list) {
                System.out.println(s);
            }
        }
    }
}