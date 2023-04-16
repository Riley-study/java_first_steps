import java.util.Arrays;
import java.util.Random;

public class HW01_task2 {
    public static void main(String[] args) {
        // 2. Задать одномерный массив и найти в нем минимальный и максимальный элементы ;
        Random random = new Random();
        int[] array = new int[20];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(1,100);
        }
        System.out.println(Arrays.toString(array));

        int minValue = array[0];
        int maxValue = array[0];
        for (int i = 0; i < array.length; i++) {
            minValue = Math.min(minValue, array[i]);
            maxValue = Math.max(maxValue, array[i]);
        }
        System.out.print("Максимальное значение: " + maxValue);
        System.out.print("\nМиниимальное значение: " + minValue);
    }


}
