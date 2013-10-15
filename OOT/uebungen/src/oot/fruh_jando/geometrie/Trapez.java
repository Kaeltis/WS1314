package oot.fruh_jando.geometrie;

public class Trapez extends Viereck {

    public Trapez(double a, double b, double c, double hoehe) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = b;
        this.hoehe = hoehe;
        super.berechneUmfang(this.a, this.b, this.c, this.d);
        berechneFlaecheninhalt(this.a, this.c, this.hoehe);
    }

    private void berechneFlaecheninhalt(double a, double c, double hoehe) {
        this.flaeche = (0.5 * (a + c) * hoehe);
    }


}
