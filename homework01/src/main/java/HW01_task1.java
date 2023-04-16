
import java.util.Scanner;

// 1. Написать метод, принимающий на вход два аргумента: len и initialValue, и возвращающий одномерный массив
// типа int длиной len, каждая ячейка которого равна initialValue;

public class HW01_task1 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Введите длинну массива: ");
        int userLen = myScanner.nextInt();
        System.out.println("Введите значение для массива: ");
        int userInitialValue = myScanner.nextInt();
//        System.out.print(userLen + userInitialValue);

        int[] array = task01(userLen,userInitialValue);
        for (int i = 0; i < array.length; i++) {
            System.out.printf(array[i] + " ");
        }

    }

    private static int[] task01(int len, int initialValue) {
        int[] result = new int[len];
        for (int i = 0; i < result.length; i++) {
            result[i] = initialValue;
        }
        return result;
    }
}