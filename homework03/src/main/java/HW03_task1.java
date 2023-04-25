import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HW03_task1 {
//    1. Создать список типа ArrayList<String>. Поместить в него как строки, так и целые числа. Пройти по списку,
//    найти и удалить целые числа.
//    Пример: {"Яблоко", "11", "13", "Апельсин", "Дыня", "17"} -> {"Яблоко", "Апельсин", "Дыня"}
    public static void main(String[] args) {
//        Первоначальный набор элементов
        String[] listOfNumbersAndTextInit = {"Яблоко", "11", "13", "Апельсин", "Дыня", "17"};
//        Формируем список типа ArrayList<String> и помещаем в него все заданные элементы
        List<String> listOfNumbersAndText = Arrays.asList(listOfNumbersAndTextInit);

        List<String> listOfTextOnly = new ArrayList<String>();

//        Проверяем каждый элемент списка, если он не является числом (ошибка), то добавляется в новый список
        for (int i = 0; i < listOfNumbersAndText.size(); i++) {
            String temp = listOfNumbersAndText.get(i);
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
