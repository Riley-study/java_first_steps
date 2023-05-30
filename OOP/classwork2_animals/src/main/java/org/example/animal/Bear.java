package org.example.animal;

import org.example.RunSpeed;
import org.example.SwimSpeed;

public class Bear extends Predaitor implements RunSpeed, SwimSpeed {
    public Bear(String name) {
        super(name);
    }

    @Override
    public String sound() {
        return "Rear";
    }

    @Override
    public String toString() {
        return String.format("Bear: %s, Speed: %d", super.toString(), getRunSpeed());
    }

    @Override
    public int getRunSpeed() {
        return 20;
    }

    @Override
    public int getSwimSpeed() {
        return 15;
    }
}
