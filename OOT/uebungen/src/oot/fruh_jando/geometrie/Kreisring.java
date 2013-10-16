package oot.fruh_jando.geometrie;

/**
 * Klasse, welche einen Kreisring im Sinne einer geometrischen Figur implementiert.
 *
 * @author OOT_UIB_Jando_Fruh
 */
public class Kreisring extends Kreis {
    /**
     * <p>
     * Die beiden Radien sind spezifische geometrische Elemente und werden
     * deshalb nicht vererbt.
     * </p>
     */
    private double kleinerRadius;

    /**
     * Konstruktor um einen Kreisring zu spezifizieren.
     * @param groserRadius Äußerer Radius des Kreisrings
     * @param kleinerRadius Innerer Radius des Kreisrings
     */
    public Kreisring(double groserRadius, double kleinerRadius) {
        super(groserRadius);
        this.kleinerRadius = kleinerRadius;
        this.berechneFlaeche();
    }

    //Keine Vererbung, da die Kreis-Fläche spezifisch ist.
    private void berechneFlaeche() {
        this.flaeche = ((this.radius * this.radius) - (this.kleinerRadius * this.kleinerRadius) * Math.PI);
    }
}
