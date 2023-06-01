package terrarium.inhabitants;

import terrarium.AttackSpeed;

public class Chameleon extends Reptiles implements AttackSpeed {
    public Chameleon(String name) {
        super(name);
    }

    @Override
    public String feed() {
        return "spiders";
    }

    @Override
    public String color() {
        return "multicolor";
    }
    @Override
    public String toString() {
        return String.format("Chameleon: %s, feed: %s, color: %s, attack speed: %d", name, feed(), color(), getAttackSpeed());
    }

    @Override
    public int getAttackSpeed() {
        return 25;
    }
}
