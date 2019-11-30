package com.javarush.task.task07.task0724;

/* 
Семейная перепись
*/

public class Solution {
    public static void main(String[] args) {
        // напишите тут ваш код
        Human grandPa1 = new Human("Валя", true, 72);
        Human grandPa2 = new Human("Сережа", true, 70);
        Human grandMa1 = new Human("Таня", false, 68);
        Human grandMa2 = new Human("Галя", false, 65);

        Human father = new Human("Алеша", true, 46, grandPa2, grandMa2);
        Human mother = new Human("Оля", false, 45, grandPa1, grandMa1);

        Human child1 = new Human("Максим", true, 24, father, mother);
        Human child2 = new Human("Юля", false, 29, father, mother);
        Human child3 = new Human("Саша", true, 10, father, mother);

        System.out.println(grandPa1);
        System.out.println(grandPa2);
        System.out.println(grandMa1);
        System.out.println(grandMa2);
        System.out.println(father);
        System.out.println(mother);
        System.out.println(child1);
        System.out.println(child2);
        System.out.println(child3);

    }

    public static class Human {
        // напишите тут ваш код

        String name;
        boolean sex;
        int age;
        Human father;
        Human mother;

        public Human(String name, boolean sex, int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;
        }
        public Human(String name, boolean sex, int age, Human father, Human mother) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null) {
                text += ", отец: " + this.father.name;
            }

            if (this.mother != null) {
                text += ", мать: " + this.mother.name;
            }

            return text;
        }
    }
}