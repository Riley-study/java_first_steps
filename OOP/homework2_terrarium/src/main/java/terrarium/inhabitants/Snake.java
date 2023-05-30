package terrarium.inhabitants;

import terrarium.AttackSpeed;

public class Snake extends Reptiles implements AttackSpeed {
    public Snake(String name) {
        super(name);
    }

    @Override
    public String feed() {
        return "mouse";
    }

    @Override
    public String color() {
        return "yellow";
    }

    @Override
    public int getAttackSpeed() {
        return 80;
    }
}
