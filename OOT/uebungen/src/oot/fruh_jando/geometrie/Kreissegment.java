package oot.fruh_jando.geometrie;


public class Kreissegment extends Geo {

    private double radius, winkel;

    public Kreissegment(double radius, double winkel) {
        this.radius = radius;
        this.winkel = winkel;
        berechneFlaeche();
    }

    private void berechneFlaeche() {
        this.flaeche = (this.radius * this.radius * Math.PI * this.winkel) / 360;
    }
}
