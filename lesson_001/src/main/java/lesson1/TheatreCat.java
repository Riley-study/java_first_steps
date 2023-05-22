package lesson1;

public class TheatreCat extends Cat {
    int idGroup;
    String ability;

    public TheatreCat(int age, String name, String breed, boolean isMale, int idGroup, String ability) {
        super(age, name, breed, isMale);
        this.idGroup = idGroup;
        this.ability = ability;
    }

    @Override
    public String toString() {
        return super.toString() + " " + ability;
    }
}
