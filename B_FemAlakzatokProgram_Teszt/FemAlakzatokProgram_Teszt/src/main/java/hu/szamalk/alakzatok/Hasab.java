package hu.szamalk.alakzatok;

import java.util.List;

public class Hasab extends FemAlakzat {
    private double a,b,m;

    public Hasab(List<FemAlakzat> lista, double sugar, double magassag, double a, double b, double m) {
        super(lista, sugar, magassag);
        this.a = a;
        this.b = b;
        this.m = m;
    }

    public int getA() {
        return 0;
    }

    public int getB() {
        return 0;
    }

    public int getM() {
        return 0;
    }
}
