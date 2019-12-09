package com.javarush.task.task09.task0921;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/* 
Метод в try..catch
*/

public class Solution {
    public static void main(String[] args) {
        readData();
    }

    public static void readData() {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        LinkedList<Integer> numbers = new LinkedList<>();
        try {
            while (true) {
                numbers.add(Integer.parseInt(reader.readLine()));
            }
        } catch (NumberFormatException e) {
            for (Integer i : numbers) {
                System.out.println(i);
            }
        } catch (IOException e) {

        }
    }
}
