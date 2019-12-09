package com.javarush.task.task09.task0923;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;

/* 
Гласные и согласные
*/

public class Solution {
    public static char[] vowels = new char[]{'а', 'я', 'у', 'ю', 'и', 'ы', 'э', 'е', 'о', 'ё'};

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        LinkedList<Character> vowel = new LinkedList<>();
        LinkedList<Character> notVowel = new LinkedList<>();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        s = s.replaceAll(" ", "");
        for (int i = 0; i < s.length(); i++) {
            if (isVowel(s.charAt(i))) vowel.add(s.charAt(i));
            else notVowel.add(s.charAt(i));
        }
        for (char c : vowel) {
            System.out.print(c + " ");
        }
        System.out.print("\n");
        for (char c : notVowel) {
            System.out.print(c + " ");
        }
    }

    // метод проверяет, гласная ли буква
    public static boolean isVowel(char c) {
        c = Character.toLowerCase(c);  // приводим символ в нижний регистр - от заглавных к строчным буквам
        for (char d : vowels) {  // ищем среди массива гласных
            if (c == d) {
                return true;
            }
        }
        return false;
    }
}