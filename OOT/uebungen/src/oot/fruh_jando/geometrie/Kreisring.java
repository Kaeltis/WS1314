package oot.fruh_jando.geometrie;


public class Kreisring extends Geo {

    private double groserRadius, kleinerRadius;

    public Kreisring(double groserRadius, double kleinerRadius) {
        this.groserRadius = groserRadius;
        this.kleinerRadius = kleinerRadius;
        berechneFlaeche();
    }

    private void berechneFlaeche() {
        this.flaeche = ((this.groserRadius * this.groserRadius) - (this.kleinerRadius * this.kleinerRadius) * Math.PI);
    }
}
