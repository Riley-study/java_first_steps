package org.example;

import org.example.animal.*;

public class MainClassForAnimal {
    public static void main(String[] args) {
        Animal bear1 = new Bear("Потапыч");
        Animal cow1 = new Cow("Мурка");
        Animal duck1 = new Duck("Кряша");

        Zoo zoo = new Zoo();
        zoo.addAnimal(bear1).addAnimal(cow1).addAnimal(duck1).addAnimal(new Owl("Owl"));
//        System.out.println(zoo);

        System.out.println(zoo.getSound());

        RunSpeed championRunner = zoo.getRunnerChampion();
        System.out.println("Самый быстрый в зоопарке " + championRunner);
        System.out.println("\nСписок бегунов: \n");
        for (RunSpeed runner: zoo.runners()) {
            System.out.println(runner);
        }
        System.out.println("\nСписок летунов: \n");
        for (FlySpeed flyer: zoo.flyAnimals()) {
            System.out.println(flyer);
        }

        FlySpeed championFlyer = zoo.getFlyerChampion();
        System.out.println("\nСамый быстрый летун в зоопарке: " + championFlyer);

        System.out.println("\nСписок плавунов: \n");
        for (SwimSpeed swimmer: zoo.swimmers()) {
            System.out.println(swimmer);
        }

        SwimSpeed championSwimmer = zoo.getSwimmerChampion();
        System.out.println("\nСамый быстрый плавец в зоопарке: " + championSwimmer);
    }

}
