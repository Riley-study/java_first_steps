package homework1;

import java.util.Arrays;
import java.util.Random;

public class HW01_task5 {
    public static void main(String[] args) {
        // 5.** Написать метод, которому на вход подается одномерный массив и число n (может быть положительным,
        // или отрицательным), при этом метод должен сместить все элементы массива на n позиций. Элементы смещаются
        // циклично. Для усложнения задачи нельзя пользоваться вспомогательными массивами.
        // Примеры: [ 1, 2, 3 ] при n = 1 (на один вправо) -> [ 3, 1, 2 ];
        // [ 3, 5, 6, 1] при n = -2 (на два влево) -> [ 6, 1, 3, 5 ].
        // При каком n в какую сторону сдвиг можете выбирать сами.

        int[] array = RandomArray(10, 1, 30);
        System.out.println(Arrays.toString(array));
        int shiftNumber = -3;
        if (shiftNumber >= 0) {
            int[] shiftArray = ShiftArrayRight(array, shiftNumber);
            PrintArray(shiftArray);
        } else {
            int[] shiftArray = ShiftArrayLeft(array, shiftNumber);
            PrintArray(shiftArray);
        }
    }
/////////////////////////// Methods ////////////////////////////

    // Метод, сдвигающий массив вправо на n элементов:
    private static int[] ShiftArrayRight(int[] arr, int n) {
        int[] result = new int[arr.length];
        int count = 0;
        while (count < n) {
            for (int i = 0; i < result.length-1; i++) {
                if (i == 0) {
                    result[i] = arr[arr.length-1];
                    result[arr.length-1] = arr[arr.length-2];
                } else if (i > 0) {
                    result[i] = arr[i - 1];
                }
            }
            arr = result.clone();
            count++;
        }
        return result;
    }

    // Метод, сдвигающий массив влево на n элементов:
    private static int[] ShiftArrayLeft(int[] arr, int n) {
        int[] result = new int[arr.length];
        n = -n;
        int count = 0;
        while (count < n) {
            for (int i = 0; i < result.length; i++) {
                if (i == result.length-1) {
                    result[i] = arr[0];
                } else {
                    result[i] = arr[i + 1];
                }
            }
            arr = result.clone();
            count++;
        }
        return result;
    }

    // Метод, распечатывающий массив:
    private static void PrintArray(int[] array) {
        System.out.print("[" + array[0] + ", ");
        for (int i = 1; i < array.length - 1; i++) {
            System.out.print(array[i] + ", ");
        }
        System.out.print(array[array.length - 1] + "]");
    }

    // Метод, формирующий массив заданной длинны и заполняющий его случайными значениями в заданном диапазоне:
    private static int[] RandomArray(int len, int minValue, int maxValue) {
        Random random = new Random();
        int[] array = new int[len];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(minValue, maxValue);
        }
        return array;
    }
}
