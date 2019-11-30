package com.javarush.task.task07.task0707;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Что за список такой?
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        ArrayList<String> strings = new ArrayList<>();
        strings.add("reader.readLine()");
        strings.add("reader.readLine()");
        strings.add("reader.readLine()");
        strings.add("reader.readLine()");
        strings.add("reader.readLine()");
        System.out.println(strings.size());
        for (String s : strings
        ) {
            System.out.println(s);
        }
    }
}
