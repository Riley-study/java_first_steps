public class mainForDrinksVendingMachine {
    public static void main(String[] args) {
// Создать торговый кофейный автомат, напитки в автомате должны содержать следующие данные: наименование, объем,
        // температура, цена. Проинициализировать несколько напитков в классе main и торговый автомат, воспроизвести логику
        // продажи напитков. Сделать согласно принципам ООП, пройденным на семинаре.
        DrinksVendingMachine apparat = new DrinksVendingMachine();
        apparat.addDrink(new ColdDrinks("Coca Cola", 60, 0.5, 10, 2,
                        "да")).
                addDrink(new ColdDrinks("Fanta", 60, 0.5, 25, 1,
                        "да")).
                addDrink(new HotDrinks("Cappuccino", 60, 0.3, 60, 2,
                        "нет", "ванильный")).
                addDrink(new ColdDrinks("MilkSheik", 60, 0.5, 5, 2,
                        "нет")).
                addDrink(new HotDrinks("Americano", 60, 0.4, 60, 2,
                        "да", "нет"));

        System.out.println(apparat);

//        System.out.println("\nПоиск нужного напитка:");
//        Drinks foundDrink = apparat.findDrink("Americano");
//        System.out.println(foundDrink);

        System.out.println("\nСписок проданных напитков:");
        Drinks saleDrink = apparat.saleDrink("Fanta");
        Drinks saleDrink1 = apparat.saleDrink("Coca");
        System.out.println(saleDrink);
        System.out.println(saleDrink1 + "\n");
        System.out.println(apparat);
    }
}
