package oot.fruh_jando.geometrie;

/**
 * Klasse, welche ein Quadrat im Sinne einer geometrischen Figur implementiert.
 *
 * @author OOT_UIB_Jando_Fruh
 */
public class Quadrat extends Viereck {

    /**
     * <p>Spezifisches Feld für ein Quadrat</p>
     */
    private double diagonale;

     /*
    * Diese Klasse hat keine Membervariablen, da diese von einer zentralen
    * Klasse "Viereck" vererbt werden.
    *
    * Jediglich der Konstruktor setzt auf ein Quadrat
    * spezifische Abhängigkeiten.
    * BSP: a=b=c=d
    *
    * Die Berechnung der Fläche und des Umfangs wird in der Klasse Viereck berechnet.
    * Siehe super() - Aufruf
     */

    /**
     * Konstruktor um ein Quadrat zu spezifizieren
     *
     * @param a Seite a des Quadrats
     */
    Quadrat(double a) {
        super(a);
        this.diagonale = a * Math.sqrt(2);
    }

}
