package terrarium.inhabitants;

import terrarium.AttackSpeed;

public class Frog extends Reptiles implements AttackSpeed {
    public Frog(String name) {
        super(name);
    }

    @Override
    public String feed() {
        return "flies";
    }

    @Override
    public String color() {
        return "green";
    }
    @Override
    public String toString() {
        return String.format("Frog: %s, feed: %s, color: %s, attack speed: %d", name, feed(), color(), getAttackSpeed());
    }

    @Override
    public int getAttackSpeed() {
        return 10;
    }
}
