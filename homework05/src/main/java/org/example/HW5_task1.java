package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HW5_task1 {
//    Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1 человек может иметь несколько телефонов
    public static void main(String[] args) {

        ex1();
    }

    private static void ex1() {
        Map<String, List<String>> phonebookMap = new HashMap<String, List<String>>();
//        List<String> newContact = new ArrayList<>();
//        newContact.add("89654325567");
//        newContact.add("89123456667");
//
//        phonebookMap.put("Иван Иванов", newContact);
        addContact(phonebookMap, "Светлана Петрова", "89236556767");
        addContact(phonebookMap, "Кристина Белова", "8923677789");
        addContact(phonebookMap, "Кристина Белова", "new new new");

//        phonebookMap.put("Иван Иванов", "new tel");
//        phonebookMap.put("Светлана Петрова", "89236556767");
//        phonebookMap.put("Кристина Белова", "8923677789");

        for (Map.Entry<String, List<String>> contact: phonebookMap.entrySet()) {
            System.out.printf("%s - %s%n", contact.getKey(), contact.getValue());
        }
    }

    public static void addContact(Map<String, List<String>> phoneBook, String name, String phoneNumber){

        for (Map.Entry<String, List<String>> contact: phoneBook.entrySet()) {

            if (contact.getKey().contains(name)){
                contact.getValue().add(phoneNumber);
            } else {
                List<String> phoneNumbersArray = new ArrayList<>();
                phoneNumbersArray.add(phoneNumber);
                phoneBook.put(name,phoneNumbersArray);
            }
        }
    }
}
