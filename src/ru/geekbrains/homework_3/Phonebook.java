package ru.geekbrains.homework_3;

import java.util.ArrayList;
import java.util.HashMap;

public class Phonebook {
    private HashMap<String, ArrayList<String>> phonebook = new HashMap<>();

    public void add(String lastname, String phoneNumber) {
        ArrayList<String> telList = phonebook.get(lastname);
        if (telList == null) telList = new ArrayList<>();
        telList.add(phoneNumber);
        phonebook.put(lastname, telList);

    }

    public void get(String lastname) {
        if (phonebook.get(lastname) == null) {
            System.out.println("нет такого абонента");
        } else {
            System.out.println(phonebook.get(lastname));
        }
    }
}


