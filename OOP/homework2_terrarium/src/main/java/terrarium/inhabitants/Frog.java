package terrarium.inhabitants;

public class Frog extends Reptiles{
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
}
