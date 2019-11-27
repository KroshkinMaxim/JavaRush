package com.javarush.task.task05.task0528;

/* 
Вывести на экран сегодняшнюю дату
*/

import java.text.SimpleDateFormat;
import java.util.Date;

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("d M yyyy");

        System.out.println(simpleDateFormat.format(date));
    }
}
