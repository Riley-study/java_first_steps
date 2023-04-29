package lesson1;

import java.util.*;

public class seminar3 {
    public static void main(String[] args) {
//        ex1();
        ex2();
    }

    private static void ex1() {
        Random random = new Random();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            list.add(random.nextInt(100));
        }
        list.sort(Comparator.reverseOrder());
        Collections.sort(list, Comparator.reverseOrder());

        System.out.println(list);
    }

    //    Заполнить список названиями планет Солнечной системы в произвольном порядке с повторениями.
//    Вывести название каждой планеты и количество его повторений в списке.
//    Пройти по списку из предыдущего задания и удалить повторяющиеся элементы.
//     Меркурий, Венера, Земля, Марс, Юпитер, Сатурн, Уран, Нептун, Плутон
    private static void ex2() {
        String[] planetsNamesStringArray = {"Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Neptune",
                "Uranus", "Pluto"};
        Random randomPlanetIndex = new Random();
        List<String> listPlanet = new ArrayList<String>();
        for (int i = 0; i < 40; i++) {
            listPlanet.add(planetsNamesStringArray[randomPlanetIndex.nextInt(planetsNamesStringArray.length)]);
        }

        Collections.sort(listPlanet, Comparator.naturalOrder());
        System.out.println("\nСписок c названиями планет Солнечной системы в произвольном порядке с повторениями: \n" +
                listPlanet);
//        System.out.println(listPlanet.get(0));
        System.out.println(listPlanet.lastIndexOf("Venus"));
        System.out.println("\nНазвание каждой планеты и количество его повторений в списке: \n");
        int count = 0;
        for (int i = 0; i < planetsNamesStringArray.length; i++) {
            for (int j = 0; j <= listPlanet.lastIndexOf("Venus"); j++) {
                if (planetsNamesStringArray[i].equals(listPlanet.get(j))) {
                    count++;
                }
            }
            System.out.println(planetsNamesStringArray[i] + " " + count);
            count = 0;
        }

        System.out.println("\nУдалины повторяющиеся элементы в списке: \n");
        for (int j = 0; j < listPlanet.lastIndexOf("Venus") - 1; j++) {
            if (!(listPlanet.get(j).equals(listPlanet.get(j + 1)))) {
                System.out.print(listPlanet.get(j + 1) + " ");
            } else if (j == 0) {
                System.out.print(listPlanet.get(j) + " ");
            }
        }

    }
}
