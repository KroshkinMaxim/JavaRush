package com.javarush.task.task08.task0817;

import java.util.*;

/* 
Нам повторы не нужны
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

    public static void removeTheFirstNameDuplicates(Map<String, String> map) {
        //напишите тут ваш код
        Set<String> names = new HashSet<>();
        ArrayList<String> namesResult = new ArrayList<>();
        for (Map.Entry<String, String> pair : map.entrySet()) {
            String s = pair.getValue();
            if (names.contains(s)) namesResult.add(s);
            else names.add(s);
        }
        for (int i = 0; i < namesResult.size(); i++) {
            removeItemFromMapByValue(map, namesResult.get(i));
        }
    }

    public static void removeItemFromMapByValue(Map<String, String> map, String value) {
        Map<String, String> copy = new HashMap<>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value)) {
                map.remove(pair.getKey());
            }
        }
    }

    public static void main(String[] args) {
//        Map<String, String> result = createMap();
//        removeTheFirstNameDuplicates(result);
//        for (Map.Entry<String, String> pair : result.entrySet()) {
//            System.out.println(pair.getKey() + "-" + pair.getValue());
//        }
    }
}
