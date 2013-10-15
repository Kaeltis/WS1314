package oot.fruh_jando.geometrie;

public class Kreis extends Geo {
    private double radius;

    public Kreis(double radius) {
        this.radius = radius;
        berechneUmfang();
        berechneFlaeche();

    }

    private void berechneFlaeche() {
        this.flaeche = this.radius * this.radius * Math.PI;
    }

    private void berechneUmfang() {
        this.umfang = 2 * this.radius * Math.PI;
    }

}
