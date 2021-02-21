package ru.geekbrains.homework_3;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> animals = new ArrayList<>();

        animals.add("Cat");
        animals.add("Dog");
        animals.add("Mouse");
        animals.add("Horse");
        animals.add("Tiger");
        animals.add("Lion");
        animals.add("Monkey");
        animals.add("Cat");
        animals.add("Rabbit");
        animals.add("Sheep");
        animals.add("Deer");
        animals.add("Tiger");
        animals.add("Lion");
        animals.add("Bear");
        animals.add("Cat");
        System.out.println(animals);

        Set<String> uniqueItems = new HashSet<>(animals);
        System.out.println(uniqueItems);

        for (String calculation : uniqueItems) {
            System.out.println(calculation + ": " + Collections.frequency(animals, calculation));
        }

        System.out.println();
        System.out.println("Task 2");

        Phonebook phonebook = new Phonebook();

        phonebook.add("Ковальчук", "892612345450");
        phonebook.add("Усманов", "892612000000");
        phonebook.add("Дерипаска", "892612545454");
        phonebook.add("Ротенберг", "8926656125");
        phonebook.add("Володин", "89263213214");
        phonebook.add("Ротенберг", "892654644");

        phonebook.get("Ротенберг");

    }
}
