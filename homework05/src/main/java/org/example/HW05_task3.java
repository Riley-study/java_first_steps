package org.example;

import java.util.Arrays;
// 3**. На шахматной доске расставить 8 ферзей так, чтобы они не били друг друга (обратите внимание на алгоритм
// backtracking(поиск с возвратом)).
public class HW05_task3 {
    public static void main(String[] args) {
        int[][] board = new int[8][8]; // создали матрицу 8 * 8
        if (solve(board, 0)) {     // вызываем рекурсивный метод, если он возващает true, выводим матрицу в консоль
            for (int[] row : board) {
                System.out.println(Arrays.toString(row));
            }
        } else {
            System.out.println("Решение не найдено");  // если решение не найдено
        }
    }
    private static boolean isSafe(int[][] board, int row, int col) {
        // Проверяем, что ферзь не бьется с другими ферзями на доске
        for (int i = 0; i < row; i++) {
            if (board[i][col] == 1) {     // проходим по колонке col перебирая строки, если найдет 1 вернет ложь
                return false;
            }
        }
        for (int i = row, j = col; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 1) {    // если в диагонале есть 1 вернет ложь
                return false;
            }
        }
        for (int i = row, j = col; i >= 0 && j < 8; i--, j++) {
            if (board[i][j] == 1) {   // если во второй диагонале есть 1 вернет ложь
                return false;
            }
        }
        return true;
    }

    private static boolean solve(int[][] board, int row) {
        // Рекурсивная функция для решения задачи
        if (row == 8) {   // выход из рекурсии, когда дойдем до 8 строки
            return true;
        }
        for (int col = 0; col < 8; col++) {
            if (isSafe(board, row, col)) {
                board[row][col] = 1;  // если проверка, что ферзь не бьется с другими ферзями пройдена, ставим 1
                if (solve(board, row+1)) {  // вызываем рекурсивно саму себя на проверку остальных строк
                    return true;
                }
                board[row][col] = 0; // если проверка, что ферзь не бьется с другими ферзями не пройдена, ставим 0
            }
        }
        return false;  // если переберет все варианты, но не найдет куда расставить все фигуы, вернет ложь
    }
}
