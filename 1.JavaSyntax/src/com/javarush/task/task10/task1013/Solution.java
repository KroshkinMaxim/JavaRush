package com.javarush.task.task10.task1013;

/* 
Конструкторы класса Human
*/

import java.util.Date;

public class Solution {
    public static void main(String[] args) {
    }

    public static class Human {
        // Напишите тут ваши переменные и конструкторы
        private String name;
        private int age;
        private String sex;
        private String surname;
        private long mobilePhone;
        private Date birthday;

        public Human() {
        }

        public Human(String name) {
            this.name = name;
        }

        public Human(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public Human(String name, int age, String sex) {
            this.name = name;
            this.age = age;
            this.sex = sex;
        }

        public Human(String name, int age, String sex, Date birthday, long mobilePhone) {
            this.name = name;
            this.age = age;
            this.sex = sex;
            this.birthday = birthday;
            this.mobilePhone = mobilePhone;
        }

        public Human(String name, int age, String sex, Date birthday) {
            this.name = name;
            this.age = age;
            this.sex = sex;
            this.birthday = birthday;
        }

        public Human(String name, String surname, int age, String sex) {
            this.name = name;
            this.surname = surname;
            this.age = age;
            this.sex = sex;
        }

        public Human(String name, String surname, int age, String sex, Date birthday) {
            this.name = name;
            this.surname = surname;
            this.age = age;
            this.sex = sex;
            this.birthday = birthday;
        }

        public Human(String name, String surname, int age, String sex, Date birthday, long mobilePhone) {
            this.name = name;
            this.surname = surname;
            this.age = age;
            this.sex = sex;
            this.birthday = birthday;
            this.mobilePhone = mobilePhone;
        }

        public Human(String name, String surname, int age, Date birthday, long mobilePhone) {
            this.name = name;
            this.surname = surname;
            this.age = age;
            this.birthday = birthday;
            this.mobilePhone = mobilePhone;
        }
    }
}
