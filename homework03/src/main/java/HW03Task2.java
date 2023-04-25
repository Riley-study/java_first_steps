import java.util.*;

public class HW03Task2 {
//    2. Каталог товаров книжного магазина сохранен в виде двумерного списка List<ArrayList<String>> так,
//    что на 0й позиции каждого внутреннего списка содержится название жанра, а на остальных позициях - названия книг.
//    Напишите метод для заполнения данной структуры(можно через консоль).
//Пример:
//"Классика", "Преступление и наказание", "Война и мир", "Анна Каренина".
//"Научная фантастика", "Солярис", "Ночной дозор", "Братья Стругацкие".
//"Детектив", "Десять негритят".
//"Фантастика", "Хроники Нарнии", "Гарри Поттер и философский камень", "Грозовой перевал".
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);          // вывод в терминал запроса на новую книгу
        System.out.println("Введите жанр книги: ");
        String scGenre = myScanner.nextLine();
        System.out.println("Введите название книги: ");
        String scBookName = myScanner.nextLine();

        List<List<String>> catalog = new ArrayList<>();      // создаем двумерный список (каталог)
        List<String> listToAdd = new ArrayList<String>();   // создаем новый список для вложения
        listToAdd.add("Роман");                             // добавляем элемент в список
        listToAdd.add("Война и мир");
        catalog.add(listToAdd);                            // добавили первый вложенный список в каталог


        List<String> genre = new ArrayList<String>();      // Блок для случая, когда вводится новый жанр
        for (List<String>l:catalog){
            genre.add(l.get(0));
        }
        if (!(genre.contains(scGenre))){
            genre.add(scGenre);
            List<String> listToAdd2 = new ArrayList<String>();
            listToAdd2.add(scGenre);
            catalog.add(listToAdd2);
        }

        for (List<String>l:catalog){              // Если жанр уже есть, добавляем новую книгу в соответствующий список
            if(l.contains(scGenre)){
                l.add(scBookName);
            }
        }
        for (List<String> s: catalog){           // печатаем каталог
            System.out.println(s);
        }
    }
}
