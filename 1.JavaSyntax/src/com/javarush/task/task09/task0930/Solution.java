package com.javarush.task.task09.task0930;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

/* 
Задача по алгоритмам
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();
        while (true) {
            String s = reader.readLine();
            if (s.isEmpty()) {
                break;
            }
            list.add(s);
        }

        String[] array = list.toArray(new String[0]);
        sort(array);

        for (String x : array) {
            System.out.println(x);
        }
    }

    public static void sort(String[] array) {
        // напишите тут ваш код
        ArrayList<Integer> mas1 = new ArrayList<>();
        ArrayList<String> mas2 = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            if (isNumber(array[i])) {
                mas1.add(Integer.parseInt(array[i]));
            } else mas2.add(array[i]);
        }
        Collections.sort(mas1);
        Collections.reverse(mas1);
        for (int i = mas2.size() - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (isGreaterThan(mas2.get(j), mas2.get(j + 1))) {
                    Collections.swap(mas2, j, j + 1);
                }
            }
        }
        int k = 0;
        int l = 0;
        for (int i = 0; i < array.length; i++) {

            if (isNumber(array[i])) {
                array[i] = mas1.get(k).toString();
                k++;
            } else {
                array[i] = mas2.get(l);
                l++;
            }
        }

    }

    // Метод для сравнения строк: 'а' больше чем 'b'
    public static boolean isGreaterThan(String a, String b) {
        return a.compareTo(b) > 0;
    }


    // Переданная строка - это число?
    public static boolean isNumber(String s) {
        if (s.length() == 0) {
            return false;
        }

        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            if ((i != 0 && c == '-') // Строка содержит '-'
                    || (!Character.isDigit(c) && c != '-') // или не цифра и не начинается с '-'
                    || (chars.length == 1 && c == '-')) // или одиночный '-'
            {
                return false;
            }
        }
        return true;
    }
}
