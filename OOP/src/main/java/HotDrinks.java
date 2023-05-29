public class HotDrinks extends Drinks {
    private String addDoubleMilk;
    private String syrupType;

    public HotDrinks(String drinkName, double drinkPrice, double drinkValue, double drinkTemperature, int quantity,
                     String addDoubleMilk, String syrupType) {
        super(drinkName, drinkPrice, drinkValue, drinkTemperature,quantity);
        this.addDoubleMilk = addDoubleMilk;
        this.syrupType = syrupType;
    }

    @Override
    public String toString() {
        return String.format("%s, двойная порция молока: %s, сироп: %s", super.toString(), addDoubleMilk, syrupType);
    }
}

