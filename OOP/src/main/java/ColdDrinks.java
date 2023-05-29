public class ColdDrinks extends Drinks {
    private String carbonated;

    public ColdDrinks(String drinkName, double drinkPrice, double drinkValue, double drinkTemperature/*, int quantity*/
            , String carbonated) {
        super(drinkName, drinkPrice, drinkValue, drinkTemperature/*,quantity*/);
        this.carbonated = carbonated;
    }
    @Override
    public String toString() {
        return String.format("%s, газированный: %s", super.toString(), carbonated);
    }

}
