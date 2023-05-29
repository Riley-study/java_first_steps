import java.util.ArrayList;
import java.util.List;

public class DrinksVendingMachine {
    private List<Drinks> drinksMenu = new ArrayList<>();

    public DrinksVendingMachine addDrink(Drinks name){
        drinksMenu.add(name);
        return this;
    }
    public List<Drinks> getDrinkMenu(){
        return drinksMenu;
    }

    private double cash = 0;
    public double getCash() {
        return cash;
    }


    public Drinks findDrink (String name){
        for (Drinks findName: drinksMenu) {
            if(findName.getDrinkName().contains(name)){
                return findName;
            }
        }
        return null;
    }

    public Drinks saleDrink (String name){
        for (Drinks drink: drinksMenu) {
            if(drink.getDrinkName().contains(name)){
                drinksMenu.remove(drink);
                cash = cash + drink.getDrinkPrice();
                return drink;
            }
        }
        return null;
    }
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Денег в автомате: ").append(cash).append("\n");
        for (Drinks drink : drinksMenu) {
            builder.append(drink).append("\n");
        }
        return builder.toString();
    }

}
