package org.example;

import java.util.*;

public class HW5_task1 {
    //    Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1 человек может иметь несколько телефонов
    public static void main(String[] args) {
        ex1();
    }

    private static void ex1() {
        Map<String, List<String>> phonebookMap = new HashMap<String, List<String>>();
        List<String> newContact = new ArrayList<>();
        newContact.add("89654325567");
        newContact.add("89123456667");
        phonebookMap.putIfAbsent("Иван Иванов", newContact);
        List<String> newContact2 = new ArrayList<>();
        newContact2.add("8965");
        newContact2.add("89123");
        phonebookMap.putIfAbsent("Вера Полозкова", newContact2);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter name: ");
        String name = scanner.nextLine();
        System.out.println("Enter phone number: ");
        String phoneNum = scanner.nextLine();
        addContact(phonebookMap, name, phoneNum);

//     Без итератора код ниже работает правильно (беру первое имя в списке "Вера Полозкова", добавляет номер.
//     Добавляю в итератор и выделяю в метод он перезаписывает номер телефона. Не понимаю почему не работает,
//     код вроде один-в-один

//        List<String> phoneNumbers = phonebookMap.get(name);
//        phoneNumbers.add(phoneNum);
//        phonebookMap.put(name, phoneNumbers);
//        System.out.println(phoneNumbers.toString());

        for (Map.Entry<String, List<String>> stringListEntry : phonebookMap.entrySet()) {
            System.out.printf("%s - %s%n", stringListEntry.getKey(), stringListEntry.getValue());

        }
    }

    public static void addContact(Map<String, List<String>> phonebookMap, String name, String phoneNum) {
        Iterator<String> col = phonebookMap.keySet().iterator();
        while (col.hasNext()) {
            if (col.toString().contains(name)) {
                List<String> phoneNumbers = phonebookMap.get(name);
                phoneNumbers.add(phoneNum);
                phonebookMap.put(name, phoneNumbers);
            } else {
                List<String> phoneNumbersArray = new ArrayList<>();
                phoneNumbersArray.add(phoneNum);
                phonebookMap.put(name, phoneNumbersArray);
            }
            break;
        }

    }
}



