package org.example;

import java.util.HashMap;
import java.util.Map;

public class HW05_task2 {
//    2. Написать программу, которая найдёт и выведет повторяющиеся имена с количеством повторений.
//    Отсортировать по убыванию популярности.
    public static void main(String[] args) {
        Map<String, String> namesListMap = new HashMap<>();
        namesListMap.put("Иванов", "Иван");
        namesListMap.put("Петрова", "Светлана");
        namesListMap.put("Белова", "Кристина");
        namesListMap.put("Мусина", "Анна");
        namesListMap.put("Крутова", "Анна");
        namesListMap.put("Юрин", "Иван");
        namesListMap.put("Лыков", "Петр");
        namesListMap.put("Чернов", "Павел");
        namesListMap.put("Чернышов", "Петр");
        namesListMap.put("Федорова", "Мария");
        namesListMap.put("Светлова", "Марина");
        namesListMap.put("Савина", "Мария");
        namesListMap.put("Рыкова", "Мария");
        namesListMap.put("Лугова", "Марина");
        namesListMap.put("Владимирова", "Анна");
        namesListMap.put("Мечников", "Иван");
        namesListMap.put("Петин", "Петр");
        namesListMap.put("Ежов", "Иван");

        Map<String, Integer> namesCountMap = new HashMap<>();
        for (String surname: namesListMap.keySet()){
            String nameToCount = namesListMap.get(surname);
            if (namesCountMap.containsKey(nameToCount)){
                int a = namesCountMap.get(nameToCount) + 1;
                namesCountMap.put(nameToCount, a);
            } else {
                namesCountMap.putIfAbsent(namesListMap.get(surname), 1);
            }
        }

        System.out.println("\nПовторяющиеся имена с количеством повторений по убыванию популярности: ");

        Integer count = namesListMap.size();
        while (count > 0) {
            for (String name : namesCountMap.keySet()) {
                if(namesCountMap.get(name) == count) {
                    System.out.printf("%s - %d%n", name, namesCountMap.get(name));
                }
            }
            count--;
        }
    }
}
