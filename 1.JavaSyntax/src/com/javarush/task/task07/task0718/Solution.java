package com.javarush.task.task07.task0718;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Проверка на упорядоченность
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        ArrayList<String> strings = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 10; i++) {
            strings.add(reader.readLine());
        }
        int next = 0;
        for (int i = 0; i < 10; i++) {
            if (strings.get(i).length()>next) next = strings.get(i).length();
            else {
                System.out.println(i);
                break;
            }
        }
    }
}

