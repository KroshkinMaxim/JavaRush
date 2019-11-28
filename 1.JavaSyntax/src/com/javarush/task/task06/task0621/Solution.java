package com.javarush.task.task06.task0621;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Родственные связи кошек
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String grandPaName = reader.readLine();
        Cat catGrandPa = new Cat(grandPaName);

        String grandMaName = reader.readLine();
        Cat catGrandMa = new Cat(grandMaName);

        String fatherName = reader.readLine();
        Cat catFather = new Cat(fatherName, catGrandPa);

        String motherName = reader.readLine();
        Cat catMother = new Cat(catGrandMa, motherName);

        String sonName = reader.readLine();
        Cat catSon = new Cat(sonName, catFather, catMother);

        String daughterName = reader.readLine();
        Cat catDaughter = new Cat(daughterName, catFather, catMother);


        System.out.println(catGrandPa);
        System.out.println(catGrandMa);
        System.out.println(catFather);
        System.out.println(catMother);
        System.out.println(catSon);
        System.out.println(catDaughter);
    }

    public static class Cat {
        private String name;
        private Cat parentMan;
        private Cat parentWoman;

        Cat(String name) {
            this.name = name;
        }

        Cat(String name, Cat parentMan) {
            this.name = name;
            this.parentMan = parentMan;
        }

        Cat(Cat parentWoman, String name) {
            this.name = name;
            this.parentWoman = parentWoman;
        }

        Cat(String name, Cat parentMan, Cat parentWoman) {
            this.name = name;
            this.parentMan = parentMan;
            this.parentWoman = parentWoman;
        }

        @Override
        public String toString() {
            if (parentMan == null && parentWoman == null)
                return "The cat's name is " + name + ", no mother, no father";
            else if (parentMan != null && parentWoman == null)
                return "The cat's name is " + name + ", no mother, father is " + parentMan.name;
            else if (parentMan == null && parentWoman != null)
                return "The cat's name is " + name + ", mother is " + parentWoman.name + ", no father";
            else
                return "The cat's name is " + name + ", mother is " + parentWoman.name + ", father is " + parentMan.name;
        }
    }

}
