import java.util.ArrayList;
import java.util.List;

public class HW03_task1 {
//    1. Создать список типа ArrayList<String>. Поместить в него как строки, так и целые числа. Пройти по списку,
//    найти и удалить целые числа.
//    Пример: {"Яблоко", "11", "13", "Апельсин", "Дыня", "17"} -> {"Яблоко", "Апельсин", "Дыня"}
    public static void main(String[] args) {
//        Первоначальный набор элементов
        String[] listOfNumbersAndTextInit = {"Яблоко", "11", "13", "Апельсин", "Дыня", "17"};
        List<String> listOfNumbersAndText = new ArrayList<String>();

//        Формируем список типа ArrayList<String> и помещаем в него все заданные элементы
        List<String> listOfTextOnly = new ArrayList<String>();
        for (int i = 0; i < listOfNumbersAndTextInit.length; i++) {
            listOfNumbersAndText.add(listOfNumbersAndTextInit[i]);
        }

//        Проверяем каждый элемент списка, если он не является числом, то добавляется в новый список
        for (int i = 0; i < listOfNumbersAndTextInit.length; i++) {
            String temp = listOfNumbersAndTextInit[i];
            try {
                int number = Integer.parseInt(temp);
            } catch (NumberFormatException ex) {
                listOfTextOnly.add(temp);
            }
        }
// Выводим на печать первоначальный список и сисок без числовых значений
        System.out.print(listOfNumbersAndText);
        System.out.println();
        System.out.print(listOfTextOnly);

    }
}
