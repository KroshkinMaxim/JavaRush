package com.javarush.task.task07.task0712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Самые-самые
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        ArrayList<String> strings = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 10; i++) {
            strings.add(reader.readLine());
        }
        int min = strings.get(0).length();
        int max = strings.get(0).length();

        for (int i = 1; i < 10; i++) {
            int currentLength = strings.get(i).length();
            if (currentLength < min) min = currentLength;
            else if (currentLength > max) max = currentLength;
        }

        for (int i = 0; i < 10; i++) {
            int result = strings.get(i).length();
            if (result == min | result == max) {
                System.out.println(strings.get(i));
                break;
            }
        }
    }
}
