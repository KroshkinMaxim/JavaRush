package com.javarush.task.task08.task0815;

import java.util.HashMap;
import java.util.Map;

/* 
Перепись населения
*/

public class Solution {
    public static Map<String, String> createMap() {
        //напишите тут ваш код
        Map<String, String> person = new HashMap<>();
        person.put("Крошкин", "Максим");
        person.put("Крошкян", "Максим");
        person.put("Смелик", "Игорь");
        person.put("Алекперов", "Али");
        person.put("Смолина", "Юля");
        person.put("Колесник", "Юля");
        person.put("Скрыдлова", "Юля");
        person.put("Ященко", "Ира");
        person.put("Фролов", "Костя");
        person.put("Дегтев", "Валера");
        return person;
    }

    public static int getCountTheSameFirstName(Map<String, String> map, String name) {
        //напишите тут ваш код
        int count = 0;
        for (Map.Entry<String, String> pair:map.entrySet()) {
            if (pair.getValue().equals(name)) count++;
        }
        return count;
    }

    public static int getCountTheSameLastName(Map<String, String> map, String lastName) {
        //напишите тут ваш код
        int count = 0;
        for (Map.Entry<String, String> pair:map.entrySet()) {
            if (pair.getKey().equals(lastName)) count++;
        }
        return count;
    }

    public static void main(String[] args) {
//        System.out.println(getCountTheSameFirstName(createMap(),"Юля"));
//        System.out.println(getCountTheSameLastName(createMap(), "Смелик"));
    }
}
