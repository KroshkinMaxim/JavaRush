package com.javarush.task.task08.task0824;

import java.util.ArrayList;
import java.util.List;

/* 
Собираем семейство
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        ArrayList<Human> parents1 = new ArrayList<>();
        ArrayList<Human> parents2 = new ArrayList<>();
        ArrayList<Human> children = new ArrayList<>();
        Human child1 = new Human("Макси", true, 24);
        Human child2 = new Human("Юля", false, 20);
        Human child3 = new Human("Костя", true, 10);
        children.add(child1);
        children.add(child2);
        children.add(child3);
        Human father = new Human("Алексей", true, 46, children);
        Human mother = new Human("Ольга", false, 45, children);
        parents1.add(father);
        parents2.add(mother);
        Human grandPa2 = new Human("Valentin", true, 72, parents2);
        Human grandMa2 = new Human("Valentin", true, 72, parents2);
        Human grandPa1 = new Human("Valentin", true, 72, parents1);
        Human grandMa1 = new Human("Valentin", true, 72, parents1);

        System.out.println(grandPa1);
        System.out.println(grandMa1);
        System.out.println(grandPa2);
        System.out.println(grandMa2);
        System.out.println(father);
        System.out.println(mother);
        System.out.println(child1);
        System.out.println(child2);
        System.out.println(child3);
    }

    public static class Human {
        //напишите тут ваш код

        String name;
        boolean sex;
        int age;
        ArrayList<Human> children = new ArrayList<>();

        public Human(String name, boolean sex, int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        public Human(String name, boolean sex, int age, ArrayList<Human> children) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            for (int i = 0; i<children.size(); i++) {
                this.children.add(children.get(i));
            }
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0) {
                text += ", дети: " + this.children.get(0).name;

                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }
            return text;
        }
    }
}
