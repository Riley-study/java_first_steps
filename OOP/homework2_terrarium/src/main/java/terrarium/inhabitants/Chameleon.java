package terrarium.inhabitants;

public class Chameleon extends Reptiles{
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
}
