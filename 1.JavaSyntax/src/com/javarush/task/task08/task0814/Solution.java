package com.javarush.task.task08.task0814;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* 
Больше 10? Вы нам не подходите
*/

public class Solution {
    public static Set<Integer> createSet() {
        // напишите тут ваш код
        Set<Integer> numbers = new HashSet<>();
        for (int i = 0; i < 20; i++) {
            numbers.add(i);
        }
        return numbers;
    }

    public static Set<Integer> removeAllNumbersGreaterThan10(Set<Integer> set) {
        // напишите тут ваш код
        Set<Integer> removeNumbers = new HashSet<>();
        Iterator<Integer> iter = set.iterator();
        while (iter.hasNext()) {
            int number = iter.next();
            if (number<=10) removeNumbers.add(number);
        }
        return removeNumbers;
    }

    public static void main(String[] args) {
        Set<Integer> result = createSet();
        for (int i:removeAllNumbersGreaterThan10(result)
             ) {
            System.out.println(i);
        }
    }
}
