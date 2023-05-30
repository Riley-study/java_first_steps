package org.example.animal;

import org.example.animal.Animal;

public abstract class Predaitor extends Animal {

    public Predaitor(String name) {
        super(name);
    }

    @Override
    public String feed() {
        return "meat";
    }
}
