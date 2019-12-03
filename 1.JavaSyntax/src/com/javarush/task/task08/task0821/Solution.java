package com.javarush.task.task08.task0821;

import java.util.HashMap;
import java.util.Map;

/* 
Однофамильцы и тёзки
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, String> map = createPeopleList();
        printPeopleList(map);
    }

    public static Map<String, String> createPeopleList() {
        //напишите тут ваш код
        Map<String, String> person = new HashMap<>();
        person.put("Крошкин", "Максим");
        person.put("Крошкян", "Максим");
        person.put("Смелик", "Игорь");
        person.put("Алекперов", "Али");
        person.put("Смолина", "Юля");
        person.put("Колесник", "Юля");
        person.put("Смелик", "Юля");
        person.put("Ященко", "Ира");
        person.put("Фролов", "Костя");
        person.put("Дегтев", "Валера");
        return person;

    }

    public static void printPeopleList(Map<String, String> map) {
        for (Map.Entry<String, String> s : map.entrySet()) {
            System.out.println(s.getKey() + " " + s.getValue());
        }
    }
}
