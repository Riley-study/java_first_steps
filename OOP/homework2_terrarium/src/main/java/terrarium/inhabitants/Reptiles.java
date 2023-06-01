package terrarium.inhabitants;

public abstract class Reptiles {
    protected String name;

    public Reptiles(String name) {
        this.name = name;
    }
    public abstract String feed();
    public abstract String color();

}
