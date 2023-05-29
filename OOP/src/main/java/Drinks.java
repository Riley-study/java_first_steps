public class Drinks {
    private String drinkName;
    private double drinkPrice;
    private double drinkValue;
    private double drinkTemperature;
//    private int quantity;

    public Drinks(String drinkName, double drinkPrice, double drinkValue, double drinkTemperature/*, int quantity*/) {
        this.drinkName = drinkName;
        this.drinkPrice = drinkPrice;
        this.drinkValue = drinkValue;
        this.drinkTemperature = drinkTemperature;
//        this.quantity = quantity;
    }

    public String getDrinkName(){
        return drinkName;
    }

    public double getDrinkPrice() {
        return drinkPrice;
    }
    public double getDrinkValue() {
        return drinkValue;
    }
    public double getDrinkTemperature(){
        return  drinkTemperature;
    }

    @Override
    public String toString() {
        return String.format("Напиток: %s, Цена: %f, Объем: %f, температура: %f C", drinkName,
                drinkPrice, drinkValue, drinkTemperature/*,quantity*/ );
    }

    //    public int getQuantity() {
//        return quantity;
//    }
//    public int quantityDecrement() {
//        return quantity - 1;
//    }
}