package homework1;

import java.util.Date;
import java.util.Scanner;

public class HW01_task4 {
    public static void main(String[] args) {
        // 4. В консоли запросить имя пользователя. В зависимости от текущего времени, вывести приветствие вида:
        //"Доброе утро, <Имя>!", если время от 05:00 до 11:59
        //"Добрый день, <Имя>!", если время от 12:00 до 17:59;
        //"Добрый вечер, <Имя>!", если время от 18:00 до 22:59;
        //"Доброй ночи, <Имя>!", если время от 23:00 до 4:59

        Scanner myScanner = new Scanner(System.in); // Ctrl + Alt + m  вынести метод
        System.out.println("Введите имя: ");
        String name = myScanner.nextLine();

        Date date = new Date();
        int getHour = date.getHours();
        String hi = "";
        if (getHour >= 5 && getHour < 12) {
            hi = "Добое утро";
        } else if (getHour >= 12 && getHour < 18) {
            hi = "Добрый день";
        } else if (getHour >= 18 && getHour < 23) {
            hi = "Добрый вечер";
        } else {
            hi = "Доброй ночи";
        }
//        System.out.println(getHour);
        System.out.printf("%s, %s!%n", hi, name);
    }
}
