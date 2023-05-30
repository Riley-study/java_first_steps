package org.example.animal;

import org.example.animal.Animal;

public abstract class Herbivores extends Animal {

    public Herbivores(String name) {
        super(name);
    }

    @Override
    public String feed() {
        return "grass";
    }
}
