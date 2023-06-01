package terrarium.inhabitants;

public abstract class Reptiles {
    protected String name;

    public Reptiles(String name) {
        this.name = name;
    }
    public abstract String feed();
    public abstract String color();

    // добавитьь скорость бега, высота прыжка, длинна языка
//    жители: хамелион мультиколор, змея желтая, лягушка зеленая
}
