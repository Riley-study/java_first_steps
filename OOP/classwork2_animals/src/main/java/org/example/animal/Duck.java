package org.example.animal;

import org.example.FlySpeed;
import org.example.RunSpeed;
import org.example.SwimSpeed;

public class Duck extends Birds implements RunSpeed, FlySpeed, SwimSpeed {
    public Duck(String name) {
        super(name);
    }

    @Override
    public String sound() {
        return "quack";
    }

    @Override
    public String feed() {
        return "все подряд";
    }

    @Override
    public int getRunSpeed() {
        return 5;
    }

    @Override
    public String toString() {
        return String.format("Duck: %s, Speed: %d, FlySpeed: %d, SwimSpeed: %d", super.toString(), getRunSpeed(),
                getFlySpeed(), getSwimSpeed());
    }

    @Override
    public int getFlySpeed() {
        return 80;
    }

    @Override
    public int getSwimSpeed() {
        return 10;
    }
}
