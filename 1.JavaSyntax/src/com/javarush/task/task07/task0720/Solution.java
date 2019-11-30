package com.javarush.task.task07.task0720;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Перестановочка подоспела
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //напишите тут ваш код
        int N = Integer.parseInt(reader.readLine());
        int M = Integer.parseInt(reader.readLine());

        ArrayList<String> strings = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            strings.add(reader.readLine());
        }

        for (int i = 0; i < M; i++) {
            String s = strings.get(0);
            strings.add(s);
            strings.remove(0);
        }

        for (String s : strings) {
            System.out.println(s);

        }
    }
}
