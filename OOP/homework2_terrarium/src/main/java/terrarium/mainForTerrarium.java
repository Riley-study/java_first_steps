package terrarium;

import terrarium.inhabitants.*;

public class mainForTerrarium {
    public static void main(String[] args) {
        Terrarium terrarium = new Terrarium();
        Snake snake1 = new Snake("Shhhhh");
        Chameleon chameleon1 = new Chameleon("Chamy");
        Frog frog1 = new Frog("froggy");
        Spider spider1 = new Spider("Spy");

        terrarium.addReptile(snake1).addReptile(chameleon1).addReptile(frog1).addReptile(spider1);
        terrarium.getSeparator();
        System.out.println(terrarium);
        terrarium.getSeparator();

        terrarium.getSeparator();
        System.out.println("Список аттакующих: ");
        for (AttackSpeed rep : terrarium.attackingReptiles()) {
            System.out.println(rep);
        }
        terrarium.getSeparator();
        AttackSpeed championAttacker = terrarium.getChampionAttacker();
        System.out.println("\nСамая большая скорость атаки: \n"+ championAttacker);

        terrarium.getSeparator();
        System.out.println("\nСписок жителей с длынными языками: ");
        for (TongueLength rep : terrarium.getTongueLengthOfReptiles()) {
            System.out.println(rep);
        }
        terrarium.getSeparator();
        TongueLength championTongueLength = terrarium.championOfTongueLength();
        System.out.println("\nСамый длинный язык: \n"+ championTongueLength);
        terrarium.getSeparator();





    }



}
