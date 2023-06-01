package terrarium.inhabitants;

import terrarium.AttackSpeed;
import terrarium.TongueLength;

public class Frog extends Reptiles implements AttackSpeed, TongueLength {
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
        return String.format("Frog: %s, feed: %s, color: %s, attack speed: %d, tongue length: %f", name, feed(), color(),
                getAttackSpeed(), getTongueLenght());
    }

    @Override
    public int getAttackSpeed() {
        return 10;
    }

    @Override
    public double getTongueLenght() {
        return 0.1;
    }
}
