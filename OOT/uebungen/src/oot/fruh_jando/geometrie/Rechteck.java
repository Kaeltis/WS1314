package oot.fruh_jando.geometrie;

/**
 * Klasse, welche ein Rechteck im Sinne einer geometrischen Figur implementiert.
 *
 * @author OOT_UIB_Jando_Fruh
 */
public class Rechteck extends Viereck {

    /**
     * <p>Spezifisches Feld für ein Rechteck</p>
     */
    private double diagonale;

    /*
    * Diese Klasse hat keine Membervariablen, da diese von einer zentralen
    * Klasse "Viereck" vererbt werden.
    *
    * Jediglich der Konstruktor setzt auf ein Rechteck
    * spezifische Abhängigkeiten.
    * BSP: a=c b=d
    *
    * Die Berechnung der Fläche und des Umfangs wird in der Klasse Viereck berechnet.
    * Siehe super() - Aufruf
    */

    /**
     * Konstruktor um ein Rechteck zu spezifizieren.
     *
     * @param a Seite a des Rechtecks
     * @param b Seite b des Rechtecks
     */
    Rechteck(double a, double b) {
        super(a, b);
        this.diagonale = Math.sqrt((a * a + b * b));
    }
}
