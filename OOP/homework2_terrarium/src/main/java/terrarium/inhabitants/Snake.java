package terrarium.inhabitants;

import terrarium.AttackSpeed;
import terrarium.TongueLength;

public class Snake extends Reptiles implements AttackSpeed, TongueLength {
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
        return 50;
    }

    @Override
    public String toString() {
        return String.format("Snake: %s, feed: %s, color: %s, attack speed: %d, tongue length: %f", name, feed(), color(),
                getAttackSpeed(), getTongueLenght());
    }

    @Override
    public double getTongueLenght() {
        return 0.2;
    }
}
