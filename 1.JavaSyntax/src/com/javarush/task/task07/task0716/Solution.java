package com.javarush.task.task07.task0716;

import java.util.ArrayList;

/* 
Р или Л
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<String>();
        strings.add("роза");
        strings.add("лоза");
        strings.add("лира");
        strings.add("мера");
        strings.add("вода");
        strings.add("упор");
        strings = fix(strings);

        for (String string : strings) {
            System.out.println(string);
        }
    }

    public static ArrayList<String> fix(ArrayList<String> strings) {
        //напишите тут ваш код
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < strings.size(); i++) {
            String result = strings.get(i);
            if (result.contains("р")) {
                if (result.contains("л")) list.add(result);
            }
            else if (result.contains("л")) {
                list.add(result);
                list.add(result);
            } else list.add(result);
        }
        return list;
    }

//    public static ArrayList<String> fix(ArrayList<String> strings) {
//        //напишите тут ваш код
//        for (int i = 0; i < strings.size(); i++) {
//            String result = strings.get(i);
//            if (result.contains("р")) {
//                if (result.contains("л")) continue;
//                strings.remove(result);
//            }
//            if (result.contains("л")) strings.add(result);
//        }
//        return strings;
//    }
}