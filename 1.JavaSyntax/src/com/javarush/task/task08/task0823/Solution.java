package com.javarush.task.task08.task0823;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Омовение Рамы
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String string = reader.readLine();

        //напишите тут ваш код
        for (String s:string.split("\\s+")) {
            if (s.isEmpty()) continue;
            System.out.print(s.substring(0,1).toUpperCase()+s.substring(1) + " ");
        }
    }
}
