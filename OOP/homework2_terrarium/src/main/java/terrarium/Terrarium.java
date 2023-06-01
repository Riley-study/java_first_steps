package terrarium;

import terrarium.inhabitants.Reptiles;

import java.util.ArrayList;
import java.util.List;

public class Terrarium {
    private List<Reptiles> terrarium = new ArrayList<>();
    public Terrarium addReptile(Reptiles name){
        terrarium.add(name);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("В террариуме есть следующие жители:\n");
        for (Reptiles rep: terrarium) {
            sb.append(rep).append("\n");
        }
        return sb.toString();
    }

    public List<AttackSpeed> attackingReptiles() {
        List<AttackSpeed> attackingRepList = new ArrayList<>();
        for (Reptiles rep : terrarium) {
            if (rep instanceof AttackSpeed) {
                attackingRepList.add((AttackSpeed) rep);
            }
        }
        return attackingRepList;
    }
    public AttackSpeed getChampionAttacker(){
        List<AttackSpeed> attackersList = attackingReptiles();
        AttackSpeed champion = attackersList.get(0);
        for (AttackSpeed attacker: attackersList) {
            if (champion.getAttackSpeed()<attacker.getAttackSpeed()){
                champion = attacker;
            }
        }
        return champion;
    }

    public List<TongueLength> getTongueLengthOfReptiles(){
        List<TongueLength> repList = new ArrayList<>();
        for (Reptiles rep: terrarium) {
            if (rep instanceof TongueLength){
                repList.add((TongueLength) rep);
            }
        }
        return repList;
    }

    public TongueLength championOfTongueLength(){
        List<TongueLength> repList = getTongueLengthOfReptiles();
        TongueLength champion = repList.get(0);
        for (TongueLength rep: repList) {
            if (champion.getTongueLenght()<rep.getTongueLenght()){
                champion = rep;
            }
        }
        return champion;
    }

    public void getSeparator(){
        System.out.println("---------------------------------------------------------------------------------------" +
                "--------");
    }
}
