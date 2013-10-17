package oot.fruh_jando.geometrie;

/**
 * Klasse, welche ein Kreissegment im Sinne einer geometrischen Figur implementiert.
 * Ein Kreisring ist eine Halbwertige Figur, da sie keinen Umfang besitzt.
 * @author OOT_UIB_Jando_Fruh
 */
public class Kreissegment extends HalbwertigeFigur {
    /*Der Radius und der Winkel sind spezifische geometrische Elemente und werden
    * deshalb nicht vererbt
    */
    private double radius, winkel;

    /**
     * Konstruktor um ein Kreissegment zu spezifizieren
     * @param radius Gibt den Radius des Kreissegements an
     * @param winkel Gibt den Winkel des Kreissegements an
     */
    public Kreissegment(double radius, double winkel) {
        this.radius = radius;
        this.winkel = winkel;
        this.berechneFlaeche();
    }

    //Keine Vererbung, da die Kreissegment-Fläche spezifisch ist.
    private void berechneFlaeche() {
        this.flaeche = (this.radius * this.radius * Math.PI * this.winkel) / 360;
    }
}
