package oot.fruh_jando.geometrie;

public class Viereck extends Geo {

    protected double a, b, c, d, hoehe;

    protected void berechneFlaeche(double a, double b) {
        this.flaeche = a * b;
    }

    protected void berechneUmfang(double a, double b, double c, double d) {
        this.umfang = a + b + c + d;
    }

}
