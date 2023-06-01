package terrarium.inhabitants;

import terrarium.AttackSpeed;
import terrarium.TongueLength;

public class Chameleon extends Reptiles implements AttackSpeed, TongueLength {
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
        return String.format("Chameleon: %s, feed: %s, color: %s, attack speed: %d, tongue length: %f", name, feed(),
                color(), getAttackSpeed(), getTongueLenght());
    }

    @Override
    public int getAttackSpeed() {
        return 25;
    }

    @Override
    public double getTongueLenght() {
        return 0.3;
    }
}
