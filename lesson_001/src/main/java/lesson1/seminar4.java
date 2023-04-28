package lesson1;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class seminar4 {
//    Реализовать консольное приложение, которое:
//    1. Принимает от пользователя строку вида text~num
//    2. Нужно рассплитить строку по ~, сохранить text в связный список на позицию num.
//    3. Если введено print~num, выводит строку из позиции num в связном списке и удаляет её из списка.
//    4. Продумать систему добавления элементов на индексы, превышающие размер
//    5. Добавить проверки ввода
    public static void main(String[] args) {
        ex1();
    }

    private static void ex1() {
        Scanner scanner = new Scanner(System.in);
        LinkedList<String> wordList = new LinkedList<>();
        Collections.addAll(wordList, "Apple", "Orange", "Melon", "Lemon");

        while (true){
            System.out.println("\n Введите запрос в формате text~number: ");
            String userInput = scanner.nextLine();
//            Проверки
            if (userInput.isBlank()){
                System.out.println("Строка не должно быть пустой");
                continue;
            } else if (userInput.equalsIgnoreCase("stop")) {
                break;
            } else if (userInput.equalsIgnoreCase("print~all")) {
                printAllNotNullValues(wordList);
                continue;
            } else if (!userInput.contains("~")) {
                System.out.println("Строка не содержит тильду ~ ");
                continue;
            }
//            Парсим строку по разделителю ~ и дальше проверки на дурака
            String[] parts = userInput.split("\\~+");
            if (parts.length != 2){
                System.out.println("Введен не корректный формат");
            }
            String word = parts[0];
            int num = 0;
            try {
                num =  Integer.parseInt(parts[1]);
            } catch (NumberFormatException e) {
                System.out.println("Запрос не содержит число");
                continue;
            }
            if (num < 1) {
                System.out.println("Введите num более 1");
                continue;
            }
            if (word.equalsIgnoreCase("print")){
                if (!isNumberInRange(num, wordList.size()) || valueIsNull(wordList, num)){
                    System.out.println("Такого элемента не существует");
                } else {
                    System.out.printf("Под номером %d находится слово: %s%n и оно будет удалено",
                            num, wordList.get(num - 1));
                    wordList.remove(num - 1);
                }
            } else if (isNumberInRange(num, wordList.size())) {   // если в диапазоне списка
                String oldWord = wordList.get(num - 1);

                if (valueIsNull(wordList, num)) {
                    printAddMessage(word, num);
                } else {
                    printSetMessage(word, num, oldWord);
                }
                wordList.set(num - 1, word);
            } else {                                             // добавляем нули, если вышли за пределы списка
                int nullCount = num - wordList.size() - 1;      // рассчитываем кол-во нулей, которые нужно добавить
                addNulls(wordList, nullCount);
                wordList.add(word);
                printAddMessage(word, num);
            }
        }
    }
    private static boolean isNumberInRange (int num, int size){
        return num >= 1 && num < size;
    }
    private static boolean valueIsNull (LinkedList<String> wordList, int num){
        return wordList.get(num -1) == null;
    }

    private static void printAddMessage (String word, int num){
        System.out.printf("Элемент %s добавлен на позицию %d%n", word, num);
    }

    private static void printSetMessage(String word, int num, String oldWord) {
        System.out.printf("Слово %s заменило на позиции %d слово %s%n", word, num, oldWord);
    }

    private static void printAllNotNullValues(LinkedList<String> wordList){
        for (int i = 0; i < wordList.size(); i++) {
            if (wordList.get(i) != null){
                System.out.printf("%d) %s%n", i+1, wordList.get(i));
            }
        }
    }

    private static void addNulls (LinkedList<String> wordList, int count){
        for (int i = 0; i < count; i++) {
            wordList.add(null);
        }
    }
}
