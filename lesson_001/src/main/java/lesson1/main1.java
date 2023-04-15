package lesson1;
import java.util.Scanner;

public class main1 {
    public static void main(String[] args) {
        //  ex1();
        ex2();
        ex3();
    }

    public static void ex1() {
// Написать программу, которая запросит пользователя ввести <Имя> в консоли.
// Получит введенную строку и выведет в консоль сообщение “Привет, <Имя>!”
        Scanner myScanner = new Scanner(System.in); // Ctrl + Alt + m  вынести метод
        System.out.println("Введите имя: ");
        String name = myScanner.nextLine();
        System.out.printf("Привет, человек по имени %s!%n", name);
    }

    private static void ex2() {
// Дан массив двоичных чисел, например [1,1,0,1,1,1,1], вывести максимальное количество подряд идущих 1.
        int [] array = new int[]{1,1,0,1,1,1,1};
        int count = 0;
        int max_value = 0;
        for (int i : array) {
            if (i == 1) count++;
            else {
                max_value = Math.max(count, max_value);
                count = 0;
            }
        }
        max_value = Math.max(count, max_value);
        System.out.printf("максимальное количество подряд идущих единичек в массиве: %d%n", max_value);
    }

    private static void ex3() {

    }
}