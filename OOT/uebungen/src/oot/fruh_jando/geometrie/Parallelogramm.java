package oot.fruh_jando.geometrie;

public class Parallelogramm extends Viereck {

    public Parallelogramm(double a, double c, double hoehe) {
        this.a = a;
        this.b = a;
        this.c = c;
        this.d = c;
        this.hoehe = hoehe;
        super.berechneUmfang(this.a, this.b, this.c, this.d);
        super.berechneFlaeche(this.a, this.hoehe);
    }
}
