import java.util.*;

public class mainForNotebookTask {
    public static void main(String[] args) {

        // Создаем множество ноутбуков и заполняем его
        Set<Notebook> notebooksCatalog = new HashSet();
        Notebook note1 = new Notebook(1, "Windows", 8, 512,
                "black");
        Notebook note2 = new Notebook(2, "Windows", 16, 512,
                "white");
        Notebook note3 = new Notebook(3, "IOS", 32, 1024,
                "white");
        Notebook note4 = new Notebook(4, "IOS", 8, 512,
                "black");
        Notebook note5 = new Notebook(5, "Linux", 32, 1024,
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

        int userAnswerForRequest = Integer.parseInt(menuToFilterNotebookCatalog());
        System.out.println(userAnswerForRequest);

        List<Notebook> selected = new ArrayList<>();

        // Отрабатываем пункты меню:
        if (userAnswerForRequest == 1) {
            String scannerRAM = userAnswerForSecondRequest("Введите минимальное значение оперативной памяти: ");
            int userMinRAM = Integer.parseInt(scannerRAM);
            for (Notebook note : notebooksCatalog) {
                if (note.randomAccessMemory >= userMinRAM) {
                    selected.add(note);
                }
            }
        }
        if (userAnswerForRequest == 2) {
            String scannerHDC = userAnswerForSecondRequest("Введите минимальный объем памяти жесткого диска: ");
            int userMinHDC = Integer.parseInt(scannerHDC);
            for (Notebook note : notebooksCatalog) {
                if (note.hardDriveCapacity >= userMinHDC) {
                    selected.add(note);
                }
            }
        }
        if (userAnswerForRequest == 3) {
            String scannerOS = userAnswerForSecondRequest("Введите название операционной системы: ");
            for (Notebook note : notebooksCatalog) {
                if (note.operatingSystem.contains(scannerOS)) {
                    selected.add(note);
                }
            }
        }
        if (userAnswerForRequest == 4) {
            String scannerColor = userAnswerForSecondRequest("Введите цвет корпуса (white/black): ");
            for (Notebook note : notebooksCatalog) {
                if (note.color.contains(scannerColor)) {
                    selected.add(note);
                }
            }
        }
        if (userAnswerForRequest == 5) {
            System.out.println("Всего хорошего, до новых встреч!");
        }
        System.out.println(selected);
    }

    public static String menuToFilterNotebookCatalog() {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Введите число, соответствующее необходимому критерию для сортировки ноутбуков: \n" +
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
                start = false;

            } catch (NumberFormatException ex) {
                System.out.println("Введено некорректное число.");
                menuToFilterNotebookCatalog();
            }
        }
        return scannerNum;
    }

    public static String userAnswerForSecondRequest(String message){
        System.out.println(message);
        Scanner myScanner1 = new Scanner(System.in);
        String scanner = myScanner1.next();
        return scanner;
    }
}

