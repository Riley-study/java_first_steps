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
        sb.append("В террариуме есть следующие рептилии:\n");
        for (Reptiles rep: terrarium) {
            sb.append(rep).append("\n");
        }
        return sb.toString();
    }
}
