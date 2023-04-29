import java.util.*;

public class HW04_task1 {
    public static void main(String[] args) {
        ex1();
    }
//    Реализовать консольное приложение, которое:
//    Принимает от пользователя и “запоминает” строки.
//    Если введено print, выводит строки так, чтобы последняя введенная была первой в списке, а первая - последней.
//    Если введено revert, удаляет предыдущую введенную строку из памяти.
//
    private static void ex1() {
        Scanner scanner = new Scanner(System.in);
        Deque<String> wordsListCollection = new ArrayDeque<String>();
        while (true){
            System.out.println("\nВведите строку: ");
            String userInput = scanner.nextLine();
            if (userInput.isBlank()){
                System.out.println("Введена пустая строка");
            } else if (userInput.equalsIgnoreCase("stop")){
                break;
            } else if (userInput.equalsIgnoreCase("print")){
                printDeque(wordsListCollection);
            } else if (userInput.equalsIgnoreCase("revert")){
                String revertElement = wordsListCollection.removeFirst();
                System.out.printf("Удален последний введенный элемент %s%n", revertElement);
            } else {
                wordsListCollection.addFirst(userInput);
            }
        }
    }

    private static void printDeque (Deque<String> wordsList){
        for (String elm: wordsList) {
            System.out.print("[" + elm + "] ");
        }

    }
}
