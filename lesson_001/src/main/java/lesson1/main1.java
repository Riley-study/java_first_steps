package lesson1;

import java.io.FileWriter;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Scanner;

public class main1 {
    public static void main(String[] args) {
//        ex1();
//        ex2();
//        ex3();
//        ex5();
//        ex6();
        ex7();
    }



    // Написать программу, которая запросит пользователя ввести <Имя> в консоли.
// Получит введенную строку и выведет в консоль сообщение “Привет, <Имя>!”
    public static void ex1() {
        Scanner myScanner = new Scanner(System.in); // Ctrl + Alt + m  вынести метод
        System.out.println("Введите имя: ");
        String name = myScanner.nextLine();
        System.out.printf("Привет, человек по имени %s!%n", name);
    }

    // Дан массив двоичных чисел, например [1,1,0,1,1,1,1], вывести максимальное количество подряд идущих 1.
    private static void ex2() {
        int[] array = new int[]{1, 1, 0, 1, 1, 1, 1};
        int count = 0;
        int maxValue = 0;
        for (int i : array) {
            if (i == 1) count++;
            else {
                maxValue = Math.max(count, maxValue);
                count = 0;
            }
        }
        maxValue = Math.max(count, maxValue);
        System.out.printf("максимальное количество подряд идущих единичек в массиве: %d%n", maxValue);
    }

    // Дан массив nums = [3,2,2,3] и число val = 3.
    //Если в массиве есть числа, равные заданному, нужно перенести эти элементы в конец массива.
    //Таким образом, первые несколько (или все) элементов массива должны быть отличны от заданного,
    // а остальные - равны ему.

    private static void ex3() {
        int[] nums = new int[]{3, 2, 3, 4, 2, 3};
        int val = 3;
        int temp = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length - 1; j++) {
                if (nums[j] == val) {
                    temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
        }
        for (int i : nums) {
            System.out.print(i + " ");
        }
    }
    // Во фразе "Добро пожаловать на курс по Java" переставить слова в обратном порядке.

    private static void ex5() {
        String str = "Добро пожаловать на курс по Java";
        String[] words = str.split(" ");  // сделали массивом
        System.out.println(Arrays.toString(words));
        String temp = "";
        for (int i = 0; i < words.length/2; i++) {
            temp = words[i];
            words[i] = words[words.length-i-1];
            words[words.length-i-1] = temp;
        }
        for (String j: words) {
            System.out.print(j + " ");
        }
    }

//    Реализовать функцию возведения числа а в степень b. a, b из Z. Сводя количество выполняемых действий к минимуму.
//    Пример 1: а = 3, b = 2, ответ: 9
//    Пример 2: а = 2, b = -2, ответ: 0.25
//    Пример 3: а = 3, b = 0, ответ: 1
    private static void ex6() {
        int a = 2;
        int b = 0;
        double res = Math.pow(a, b);
        System.out.println(res);
    }

//    Записать в файл следующие данные:
//Name Surname Age
//Kate Smith 20
//Paul Green 25
//Mike Black 23
    private static void ex7() {
        try (FileWriter fw = new FileWriter("GB_java_s01.txt", StandardCharsets.UTF_8, false)) {
            fw.write("Name\tSurname\tAge\n");
            fw.append("Kate\tSmith\t20\n");
            fw.append("Paul\tGreen\t25\n");
            fw.append("Mike\tBlack\t23\n");
            fw.flush();

        } catch (Exception ex) {
            System.out.println("Some error: " + ex.getMessage());  // ловим исключения и выводим в виде сообщения
        }
    }
}
