package hu.szamalk.alakzatok;

import java.util.List;

public class FemAlakzat {
    private List<FemAlakzat> Lista;
    public double sugar;
    public double magassag;

    public FemAlakzat(List<FemAlakzat> lista, double sugar, double magassag) {
        Lista = lista;
        this.sugar = sugar;
        this.magassag = magassag;
    }

    public FemAlakzat() {

    }

    public static double getFajsuly() {
        return 0.0;
    }

    public double terfogat() {
        return 4 * (sugar*(Math.sqrt(sugar)))*Math.PI/3;
    }

    public double suly() {
        return terfogat()*getFajsuly();
    }
}
