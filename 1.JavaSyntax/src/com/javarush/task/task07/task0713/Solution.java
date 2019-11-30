package com.javarush.task.task07.task0713;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Играем в Jолушку
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        ArrayList<Integer> begin = new ArrayList<>();
        ArrayList<Integer> divisionByThree = new ArrayList<>();
        ArrayList<Integer> divisionByTwo = new ArrayList<>();
        ArrayList<Integer> other = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 20; i++) {
            begin.add(Integer.parseInt(reader.readLine()));
            int result = begin.get(i);
            if (result % 3 == 0) {
                if (result % 2 == 0) {
                    divisionByTwo.add(result);
                }
                divisionByThree.add(result);
            } else if (result % 2 == 0) divisionByTwo.add(result);
            else other.add(result);
        }

        printList(divisionByThree);
        printList(divisionByTwo);
        printList(other);
    }

    public static void printList(ArrayList<Integer> list) {
        //напишите тут ваш код
        for (Integer i:list) {
            System.out.println(i);
        }
    }
}
