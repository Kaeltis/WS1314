package oot.fruh_jando.geometrie;

/**
 * Klasse, welche ein Kreissegment im Sinne einer geometrischen Figur implementiert.
 *
 * @author OOT_UIB_Jando_Fruh
 */
public class Kreissegment extends Geo {
    /*Der Radius und der Winkel sind spezifische geometrische Elemente und werden
    * deshalb nicht vererbt
    */
    private double radius, winkel;

    public Kreissegment(double radius, double winkel) {
        this.radius = radius;
        this.winkel = winkel;
        berechneFlaeche();
    }

    //Keine Vererbung, da die Kreis-Fläche spezifisch ist.
    private void berechneFlaeche() {
        this.flaeche = (this.radius * this.radius * Math.PI * this.winkel) / 360;
    }
}
