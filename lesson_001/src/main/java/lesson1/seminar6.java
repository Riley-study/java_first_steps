package lesson1;

import java.util.HashSet;
import java.util.Set;

public class seminar6 {
    public static void main(String[] args) {
//1. Продумайте структуру класса Кот. Какие поля и методы будут актуальны для приложения, которое является
//а) информационной системой ветеринарной клиники
//б) архивом выставки котов
//в) информационной системой Театра кошек Ю. Д. Куклачёва
        Cat cat1 = new Cat(2,"Barsik", "persian",true );   //создали конструкторы в типах данных
//        cat1.name = "Barsik";
//        cat1.age = 2;
//        cat1.isMale = true;
//        cat1.breed = "persian";

        Cat cat2 = new Cat(5,"Masha", "persian",false );
//        cat2.name = "Masha";
//        cat2.age = 5;
//        cat2.isMale = false;
//        cat2.breed = "persian";

        Cat cat3 = new Cat(2,"Barsik", "persian",true );
//        cat3.name = "Barsik";
//        cat3.age = 2;
//        cat3.isMale = true;
//        cat3.breed = "persian";

        VetCat catVet4 = new VetCat(8,"Boris", "persian",true ,"clear",
                true );
//        catVet4.name = "Boris";
//        catVet4.age = 8;
//        catVet4.isMale = true;
//        catVet4.breed = "persian";
//        catVet4.isSterilized = true;
//        catVet4.medicalHistory = "clear";

        ShowCat catShow5 = new ShowCat(1,"Petya", "persian",true, 1, "highest");

        TheatreCat catTheatre6 = new TheatreCat(1,"Catty", "persian",false, 13,
                "jump with skipping rope");


        Set<Cat> cats = new HashSet<>();
        cats.add(cat1);
        cats.add(cat2);
        cats.add(cat3);
        cats.add(catVet4);
        cats.add(catShow5);
        cats.add(catTheatre6);
        System.out.println(cats);


//
//        System.out.println(cat1.toString());
//        System.out.println(cat2.toString());
//        System.out.println(cat1.equals(cat2));

    }
}
