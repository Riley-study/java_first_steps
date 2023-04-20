package org.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Objects;

public class HW02_task2 {
    // 2.Напишите метод, который определит тип (расширение) файлов из текущей папки и выведет в консоль результат вида:
    //    1 Расширение файла: txt
    //    2 Расширение файла: pdf
    //    3 Расширение файла:
    //    4 Расширение файла: jpg
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("C:\\Users\\user\\Desktop\\GeekBrains\\Java\\java_first_steps\\lesson_001\\src\\main\\resources\\files");
        StringBuilder sb = new StringBuilder();
        for (String fileName : Objects.requireNonNull(file.list())){
            String str = fileName;
            String[] subStr;
            String delimeter = "\\."; // Разделитель
            subStr = str.split(delimeter); // Разделения строки str с помощью метода split()
            // Вывод результата на экран
            for(int i = 0; i < subStr.length; i++) {
                if (i == subStr.length -1){
                    System.out.println("Расширение файла: " + subStr[i]);
                }
            }
        }
    }
}
