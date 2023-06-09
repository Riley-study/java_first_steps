package lesson1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class seminar2 {
    public static void main(String[] args) throws FileNotFoundException {
//        ex1();
//        ex2();
//        ex2_1();
        ex5("C:\\Users\\user\\Desktop\\GeekBrains\\Java\\java_first_steps\\lesson_001");
    }



    private static void ex1() {
        //Дано число N (>0) и символы c1 и c2.
        //Написать метод, который вернет строку длины N, которая состоит из чередующихся символов c1 и c2, начиная с c1.
        int amountOfChar = 1;
        String firstSim = "a";
        String secondSim = "b";
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < amountOfChar; i++) {
            if (i % 2 == 0) {
                result.append(firstSim);
            } else {
                result.append(secondSim);
            }
        }
        System.out.print(result);
    }

    private static void ex2() {
        //    Напишите метод, который сжимает строку. Пример: вход aaaabbbcdd.
        String trash = "aaabbcccddd";
        int count = 1;
        System.out.print(trash.charAt(0));
        for (int i = 1; i < trash.length(); i++) {
            if (trash.charAt(i) == trash.charAt(i-1)){
                count++;
            } else if (trash.charAt(i) != trash.charAt(i-1) && count >1) {
                System.out.print(count);
                count = 1;
                System.out.print(trash.charAt(i));
            } else if (trash.charAt(i) != trash.charAt(i-1) && count == 1) {
                System.out.print(trash.charAt(i));
            }
        }
        if (count > 1) {
            System.out.print(count);
        }
    }

    private static void ex2_1() {
// Напишите метод, который сжимает строку. Пример: вход aaaabbbcdd.

            String trash = "aaaabbbcddYYYYYoooooo00000";
            StringBuilder result = new StringBuilder();
            int counter = 1;
            for (int i = 0; i < trash.length() - 1 ; i++) {
                if ( trash.charAt(i + 1) != trash.charAt(i)) {
                    result.append(trash.charAt(i));
                    if (counter != 1) {
                        result.append(counter);
                    }
                    counter = 0;
                }

                counter++;
            }
            result.append((trash.charAt(trash.length() - 1))).append(counter);
            System.out.println(result);

    }

    // Напишите метод, который вернет содержимое текущей папки в виде массива строк.
    //Напишите метод, который запишет массив, возвращенный предыдущим методом в файл.
    //Обработайте ошибки с помощью try-catch конструкции. В случае возникновения исключения,
    // оно должно записаться в лог-файл.

    private static void ex5(String pahtDir) throws FileNotFoundException {
        File file = new File(pahtDir);
        String[] dirListNames = file.list();
        StringBuilder sb = new StringBuilder();
        for (String fileName : dirListNames){
            sb.append(fileName).append(System.lineSeparator());
        }
        System.out.println(sb);

        if(!(file.exists() || file.isDirectory())){
            return;
        }
        try {
            try (PrintWriter pw = new PrintWriter("lesson_001/src/main/resources/files/listNames.txt")) {
                pw.print(sb);
            }
        } catch (FileNotFoundException e){
            throw new FileNotFoundException();
        }

        }


    }
