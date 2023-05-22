import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class mainForNotebookTask {
    public static void main(String[] args) {

        // Создаем множество ноутбуков и заполняем его
        Set<Notebook> notebooksCatalog = new HashSet();
        Notebook note1 = new Notebook(1, "Windows", 8, 512,
                "black");
        Notebook note2 = new Notebook(2, "Windows", 16, 512,
                "white");
        Notebook note3 = new Notebook(3, "IOS", 16, 512,
                "white");
        Notebook note4 = new Notebook(4, "IOS", 8, 512,
                "black");
        Notebook note5 = new Notebook(5, "Linux", 8, 512,
                "white");
        Notebook note6 = new Notebook(6, "Linux", 16, 512,
                "black");
        notebooksCatalog.add(note1);
        notebooksCatalog.add(note2);
        notebooksCatalog.add(note3);
        notebooksCatalog.add(note4);
        notebooksCatalog.add(note5);
        notebooksCatalog.add(note6);
        System.out.println(notebooksCatalog.toString());
        int UserChoice = Integer.parseInt(menuToFilterNotebookCatalog());

        // далее сделать сортирвку


    }

    public static String menuToFilterNotebookCatalog() {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Введите число, соответствующее необходимому критерию: \n" +
                "1 - Размер оперативной памяти\n" +
                "2 - Объём памяти жесткого диска\n" +
                "3 - Операционная система\n" +
                "4 - Цвет корпуса\n" +
                "5 - Не хочу ничего выбирать!");
        String scannerNum = myScanner.next();
        boolean start = true;   // проверка на корректность ввода данных пользователем
        while (start) {
            try {
                int userNumber = Integer.parseInt(scannerNum);
                int maxMenuNumber = 5;
                int minMenuNumber = 1;
                if (userNumber < minMenuNumber || userNumber > maxMenuNumber) {
                    System.out.println("Введено некорректное число");
                    menuToFilterNotebookCatalog();
                }

            } catch (NumberFormatException ex) {
                System.out.println("Введено некорректное число.");
                menuToFilterNotebookCatalog();
            }
        }
        return scannerNum;
    }
}

