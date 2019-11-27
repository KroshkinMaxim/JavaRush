package com.javarush.task.task06.task0606;

import java.io.*;

/* 
Чётные и нечётные циферки
*/

public class Solution {

    public static int even;
    public static int odd;

    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = 1;
        while (a / b != 0) {
            int count = (a / b) % 10;
            if (count % 2 == 0)
                even++;
            else
                odd++;
            b *= 10;
        }
        System.out.println("Even: " + even + " Odd: " + odd);
    }
}
