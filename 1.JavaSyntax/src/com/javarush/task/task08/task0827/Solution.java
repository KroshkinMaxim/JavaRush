package com.javarush.task.task08.task0827;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

/* 
Работа с датой
*/

public class Solution {
    public static void main(String[] args) throws ParseException {
        System.out.println(isDateOdd("AUGUST 1 2013"));
    }

    public static boolean isDateOdd(String date) throws ParseException {
        Date result = new SimpleDateFormat( "MMM dd yyyy", Locale.ENGLISH).parse(date);
        Calendar calendar = new GregorianCalendar();

        calendar.setTime(result);
        int year = calendar.get(Calendar.YEAR);
        Calendar calendarStart = new GregorianCalendar(year, Calendar.JANUARY, 1);
//        System.out.println(calendarStart.getTime());
        int days = (int) ((calendar.getTimeInMillis()-calendarStart.getTimeInMillis())/(1000*3600*24)) + 1;
        if (days%2==0) return false;
        else return true;
    }
}
