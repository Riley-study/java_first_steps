package terrarium.inhabitants;

public class Spider extends Reptiles{
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
}
