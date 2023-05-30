package org.example.animal;

import org.example.Soundable;

public abstract class Animal implements Soundable {
    protected String name;

    public Animal(String name) {
        this.name = name;
    }
    public abstract String sound ();
    public abstract String feed ();

    @Override
    public String toString() {
        return String.format("%s, Food: %s", name, feed());
    }
}
