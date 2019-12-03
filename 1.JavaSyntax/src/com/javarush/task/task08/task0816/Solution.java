package com.javarush.task.task08.task0816;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/* 
Добрая Зинаида и летние каникулы
*/

public class Solution {
    public static Map<String, Date> createMap() throws ParseException {
        DateFormat dateFormat = new SimpleDateFormat("MMMMM d yyyy", Locale.ENGLISH);
        Map<String, Date> map = new HashMap<>();
        map.put("Сталлоне", dateFormat.parse("MAY 1 2012"));

        //напишите тут ваш код
        map.put("Крошкин", dateFormat.parse("AUGUST 4 1995"));
        map.put("Смолина", dateFormat.parse("NOVEMBER 8 1990"));
        map.put("Ященко", dateFormat.parse("OCTOBER 1 1989"));
        map.put("Смелик", dateFormat.parse("JUNE 1 1992"));
        map.put("Алекперов", dateFormat.parse("APRIL 1 1988"));
        map.put("Скрыдлова", dateFormat.parse("JULY 1 1990"));
        map.put("Фролов", dateFormat.parse("MAY 1 2012"));
        map.put("Лысенко", dateFormat.parse("DECEMBER 1 2012"));
        map.put("Чернышов", dateFormat.parse("MAY 1 2012"));

        return map;
    }

    public static void removeAllSummerPeople(Map<String, Date> map) {
        //напишите тут ваш код
        Map<String, Date> removePerson = new HashMap<>();
        for (Map.Entry<String, Date> pair : map.entrySet()) {
            if (pair.getValue().getMonth() > 4 && pair.getValue().getMonth() < 8)
                removePerson.put(pair.getKey(), pair.getValue());
        }
        for (Map.Entry<String, Date> pair : removePerson.entrySet()) {
            map.remove(pair.getKey());
        }
    }

    public static void main(String[] args) {
//        Map<String, Date> result = createMap();
//        removeAllSummerPeople(result);
//        for (Map.Entry<String, Date> pair : result.entrySet()) {
//            System.out.println(pair.getValue());
//        }
    }
}
