package terrarium.inhabitants;

import terrarium.AttackSpeed;

public class Spider extends Reptiles implements AttackSpeed {
    public Spider(String name) {
        super(name);
    }

    @Override
    public String feed() {
        return "flies";
    }

    @Override
    public String color() {
        return "black";
    }
    @Override
    public String toString() {
        return String.format("Spider: %s, feed: %s, color: %s, attack speed: %d", name, feed(), color(),
                getAttackSpeed());
    }

    @Override
    public int getAttackSpeed() {
        return 20;
    }
}
