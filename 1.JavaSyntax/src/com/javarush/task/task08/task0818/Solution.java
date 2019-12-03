package com.javarush.task.task08.task0818;

import java.util.HashMap;
import java.util.Map;

/* 
Только для богачей
*/

public class Solution {
    public static Map<String, Integer> createMap() {
        //напишите тут ваш код
        Map<String, Integer> person = new HashMap<>();
        person.put("Крошкин", 1000);
        person.put("Крошкян", 500);
        person.put("Смелик", 100);
        person.put("Алекперов", 1500);
        person.put("Смолина", 250);
        person.put("Колесник", 900);
        person.put("Скрыдлова", 200);
        person.put("Ященко", 600);
        person.put("Фролов", 3000);
        person.put("Дегтев", 5000);
        return person;
    }

    public static void removeItemFromMap(Map<String, Integer> map) {
        //напишите тут ваш код
        map.entrySet().removeIf(x -> x.getValue()<500);
    }

    public static void main(String[] args) {
//        Map<String,Integer> result = createMap();
//        removeItemFromMap(result);
//        for (Map.Entry<String,Integer> pair:result.entrySet()) {
//            System.out.println(pair.getKey()+"-"+pair.getValue());
//        }
    }
}