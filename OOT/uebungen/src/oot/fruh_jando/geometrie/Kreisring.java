package oot.fruh_jando.geometrie;

/**
 * Klasse, welche einen Kreisring im Sinne einer geometrischen Figur implementiert.
 * Ein Kreisring ist eine Halbwertige Figur, da sie keinen Umfang besitzt.
 *
 * @author OOT_UIB_Jando_Fruh
 */
public class Kreisring extends HalbwertigeFigur {
    /**
     * <p>
     * Der kleine und der große Radius ist ein spezifisches geometrisches Element und wird
     * deshalb nicht vererbt.
     * </p>
     */
    private double kleinerRadius, groserRadius;

    /**
     * Konstruktor um einen Kreisring zu spezifizieren.
     *
     * @param groserRadius  Äußerer Radius des Kreisrings
     * @param kleinerRadius Innerer Radius des Kreisrings
     */
    public Kreisring(double groserRadius, double kleinerRadius) {
        this.groserRadius = groserRadius;
        this.kleinerRadius = kleinerRadius;
        this.berechneFlaeche();
    }

    //Keine Vererbung, da die Kreis-Fläche spezifisch ist.
    private void berechneFlaeche() {
        this.flaeche = (Math.pow(this.groserRadius, 2) - Math.pow(this.kleinerRadius, 2)) * Math.PI;
    }
}
