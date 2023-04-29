package lesson1;

import java.io.FileNotFoundException;

public class training_list {
    public static void main(String[] args) throws FileNotFoundException {

        int i,j,val=1;
        // Создание массива (второй размер не указан):
        int[][] nums=new int[4][];
        // Цикл для создания треугольного массива:
        for(i=0;i<nums.length;i++){
            // Создание строки в массиве:
            nums[i]=new int[i+1];
        }
        // Заполнение массива:
        for(i=0;i<nums.length;i++){
            for(j=0;j<nums[i].length;j++){
                // Значение элемента массива:
                nums[i][j]=val++;
                // Отображение значения элемента:
                System.out.print(nums[i][j]+" ");
            }
            // Переход к новой строке:
            System.out.println();
        }
    }




//        String str = "\"name:Ivanov\", \"country:Russia\", \"city:Moscow\", \"age:null\"";
//        char[] strToArray = str.toCharArray(); // Преобразуем строку str в массив символов (char)
//            // Вывод массива на экран
//        for(int i = 0; i < strToArray.length; i++) {
//            if (strToArray[i] != '\"'){
//                System.out.print(strToArray[i]); // Для наглядности вставим пробел между индексами
//
//            }
//        }



//        int day = 29;
//        int month = 9;
//        int year = 1990;
//        Integer[] date = { day, month, year };
//        List<Integer> d = Arrays.asList(date);
//        System.out.println(d);

//        File file = new File("C:\\Users\\user\\Desktop\\GeekBrains\\Java\\java_first_steps\\lesson_001\\src\\main\\resources\\files");
//        StringBuilder sb = new StringBuilder();
//        for (String fileName : file.list()){
//            sb.append(fileName).append(System.lineSeparator());
//        }
//        System.out.println(sb);

//        String str = "разделить-строку-по-разделителю";
//        String[] subStr = new String[0];
//        String delitel = "."; // Разделитель
//        for (String fileName : file.list()){
//            subStr = fileName.split(delitel); // Разделения строки str с помощью метода split()
//            sb.append(subStr).append(System.lineSeparator());
//        }
//        // Вывод результата на экран
//        for(int i = 0; i < subStr.length; i++) {
//            System.out.print(subStr[i]);
//        }

//        for (String fileName : Objects.requireNonNull(file.list())){
//            String str = fileName;
//            String[] subStr;
//            String delimeter = "\\."; // Разделитель
//            subStr = str.split(delimeter); // Разделения строки str с помощью метода split()
//            // Вывод результата на экран
//            for(int i = 0; i < subStr.length; i++) {
//                if (i == subStr.length -1){
//                    System.out.println("Расширение файла: " + subStr[i]);
//                }
//            }
//        }
        // Ещё один пример разделения

//        String str = "разделить.строку.по разделителю";
//        String delimeter = "\\."; // Разделитель
//        String[] subStr;
//        subStr = str.split(delimeter);
//        // Вывод результата на экран
//        for(int i = 0; i < subStr.length; i++) {
//            System.out.println(subStr[i]);
//        }

//
//        if(!(file.exists() || file.isDirectory())){
//            return;
//        }
//        try {
//            try (PrintWriter pw = new PrintWriter("lesson_001/src/main/resources/files/forTraining_list.txt")) {
//                pw.print(subStr);
//            }
//        } catch (FileNotFoundException e){
////            throw new FileNotFoundException();
////        }
//        int[] a = new int[] { 0, 9 };
//        for (int i : a) { System.out.printf("%d ", i); }
//        a = AddItem(a, 2);
//        a = AddItem(a, 3);
//        for (int j : a) { System.out.printf("%d ", j); }

//    }
//    // Метод, добавляющий в массив новый элемент (старый массив, новый элемент)
//    static int[] AddItem(int[] array, int item) {
//        int length = array.length;
//        int[] temp = new int[length + 1];
//        System.arraycopy(array, 0, temp, 0, length);
//        temp[length] = item;
//        return temp;
//    }

}

