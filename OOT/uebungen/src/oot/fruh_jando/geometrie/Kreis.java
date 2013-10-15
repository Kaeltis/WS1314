package oot.fruh_jando.geometrie;

/**
 * Klasse, welche einen Kreis im Sinne einer geometrischen Figur implementiert.
 *
 * @author OOT_UIB_Jando_Fruh
 */
public class Kreis extends Geo {
    /*Der Radius ist ein spezifisches geometrisches Element und wird
    * deshalb nicht vererbt
    */
    private double radius;

    public Kreis(double radius) {
        this.radius = radius;
        berechneUmfang();
        berechneFlaeche();

    }

    //Keine Vererbung, da die Kreis-Fläche spezifisch ist.
    private void berechneFlaeche() {
        this.flaeche = this.radius * this.radius * Math.PI;
    }

    //Keine Vererbung, da der Kreis-Umfang spezifisch ist.
    private void berechneUmfang() {
        this.umfang = 2 * this.radius * Math.PI;
    }

}
