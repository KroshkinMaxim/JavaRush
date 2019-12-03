package com.javarush.task.task08.task0813;

import java.util.HashSet;
import java.util.Set;

/* 
20 слов на букву «Л»
*/

public class Solution {
    public static Set<String> createSet() {
        //напишите тут ваш код
        Set<String> letterL = new HashSet<String>();
        for (int i = 0; i < 20; i++) {
            char c = (char) i;
            letterL.add("Лала"+ c);
        }
        return letterL;
    }

    public static void main(String[] args) {
        createSet();
    }
}
