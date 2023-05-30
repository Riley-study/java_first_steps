package org.example.animal;

import org.example.FlySpeed;

public class Owl extends Birds implements FlySpeed {
    public Owl(String name) {
        super(name);
    }

    @Override
    public String sound() {
        return "Uh-Uh";
    }

    @Override
    public String feed() {
        return "мыши";
    }

    @Override
    public int getFlySpeed() {
        return 90;
    }
    @Override
    public String toString() {
        return String.format("%s, FlySpeed: %d", super.toString(),
                getFlySpeed());
    }
}
