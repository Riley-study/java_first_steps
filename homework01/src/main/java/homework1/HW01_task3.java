package homework1;

public class HW01_task3 {
    public static void main(String[] args) {
        // 4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое), и с помощью
        // цикла(-ов) заполнить его диагональные элементы единицами (можно только одну из диагоналей, если обе сложно).
        // Определить элементы одной из диагоналей можно по следующему принципу: индексы таких элементов равны,
        // то есть [0][0], [1][1], [2][2], …, [n][n];
        int[][] array = new int[7][7];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (i == j){
                    array[i][j] = 1;
                } else if (i+j+1 == array.length) {
                    array[i][j] = 1;
                    }
            }
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.print(array[i][j] + "  ");
            }
            System.out.print("\n");
        }
    }
}
