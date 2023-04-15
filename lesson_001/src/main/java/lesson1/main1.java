package lesson1;
import java.util.Scanner;

public class main1 {
    public static void main(String[] args) {
//        ex1();
//        ex2();
        ex3();
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

        // Дан массив nums = [3,2,2,3] и число val = 3.
        //Если в массиве есть числа, равные заданному, нужно перенести эти элементы в конец массива.
        //Таким образом, первые несколько (или все) элементов массива должны быть отличны от заданного,
        // а остальные - равны ему.

    private static void ex3() {
        int[] nums = new int[]{3,2,3,4,2,3};
        int val = 3;
        int temp = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length-1; j++) {
                if (nums[j] == val) {
                    temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
            }
        }
        for (int i: nums) {
            System.out.print(i + " ");
        }
    }
}