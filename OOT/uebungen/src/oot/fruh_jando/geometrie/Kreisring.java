package oot.fruh_jando.geometrie;

/**
 * Klasse, welche einen Kreisring im Sinne einer geometrischen Figur implementiert.
 *
 * @author OOT_UIB_Jando_Fruh
 */
public class Kreisring extends Geo {
    /*Die beiden Radien sind spezifische geometrische Elemente und werden
    * deshalb nicht vererbt
    */
    private double groserRadius, kleinerRadius;

    public Kreisring(double groserRadius, double kleinerRadius) {
        this.groserRadius = groserRadius;
        this.kleinerRadius = kleinerRadius;
        berechneFlaeche();
    }

    //Keine Vererbung, da die Kreis-Fläche spezifisch ist.
    private void berechneFlaeche() {
        this.flaeche = ((this.groserRadius * this.groserRadius) - (this.kleinerRadius * this.kleinerRadius)) * Math.PI;
    }
}
