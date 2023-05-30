package org.example;

import org.example.animal.Animal;

import java.util.ArrayList;
import java.util.List;

public class Zoo {
    private Radio radio = new Radio();
    private List<Animal> zoo = new ArrayList<>();

    public Zoo addAnimal(Animal name) {
        zoo.add(name);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("В зоопарке: \n");
        for (Animal ani : zoo) {
            sb.append(ani).append("\n");
        }
        return sb.toString();
    }

    private List<Soundable> getSoundable() {
        List<Soundable> result = new ArrayList<>(zoo);
        result.add(radio);
        return result;
    }

    public String getSound() {
        StringBuilder builder = new StringBuilder();
        for (Soundable soundable : getSoundable()) {
            builder.append(soundable.sound()).append("\n");
        }
        return builder.toString();
    }

    public List<RunSpeed> runners() {
        List<RunSpeed> listOfRunners = new ArrayList<>();
        for (Animal animal : zoo) {
            if (animal instanceof RunSpeed) {
                listOfRunners.add((RunSpeed) animal);
            }
        }
        return listOfRunners;
    }

    public RunSpeed getRunnerChampion() {
        List<RunSpeed> listOfRunners = runners();
        RunSpeed champion = listOfRunners.get(0);
        for (RunSpeed runner : listOfRunners) {
            if (champion.getRunSpeed() < runner.getRunSpeed()) {
                champion = runner;
            }
        }
        return champion;
    }

    public List<FlySpeed> flyAnimals(){
        List<FlySpeed> flyAnimals = new ArrayList<>();
        for (Animal animal:zoo) {
            if (animal instanceof FlySpeed){
                flyAnimals.add((FlySpeed) animal);
            }
        }
        return flyAnimals;
    }
    public List<SwimSpeed> swimmers(){
        List<SwimSpeed> swimAnimals = new ArrayList<>();
        for (Animal animal:zoo) {
            if (animal instanceof SwimSpeed){
                swimAnimals.add((SwimSpeed) animal);
            }
        }
        return swimAnimals;
    }

    public SwimSpeed getSwimmerChampion() {
        List<SwimSpeed> listOfswimmers = swimmers();
        SwimSpeed champion = listOfswimmers.get(0);
        for (SwimSpeed swimmer : listOfswimmers) {
            if (champion.getSwimSpeed() < swimmer.getSwimSpeed()) {
                champion = swimmer;
            }
        }
        return champion;
    }
    public FlySpeed getFlyerChampion() {
        List<FlySpeed> listOfFlyers = flyAnimals();
        FlySpeed champion = listOfFlyers.get(0);
        for (FlySpeed flyer : listOfFlyers) {
            if (champion.getFlySpeed() < flyer.getFlySpeed()) {
                champion = flyer;
            }
        }
        return champion;
    }
}
