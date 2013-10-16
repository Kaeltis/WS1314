package oot.fruh_jando.geometrie;

/**
 * Klasse, welche ein Parallelogramm im Sinne einer geometrischen Figur implementiert.
 *
 * @author OOT_UIB_Jando_Fruh
 */
public class Parallelogramm extends Viereck {

    /*
    * Diese Klasse hat keine Membervariablen, da diese von einer zentralen
    * Klasse "Viereck" vererbt werden.
    *
    * Jediglich der Konstruktor setzt auf ein Parallelogramm
    * spezifische Abhängigkeiten.
    * BSP: a=b, c=d
    *
    * Die Berechnung der Fläche und des Umfangs wird in der Klasse Viereck berechnet.
    * Siehe super() - Aufruf
     */

    /**
     * Konstruktor um ein Parallelogramm zu spezifizieren
     *
     * @param a     Seite a des Parallelogramm
     * @param b     Seite b des Parallelogramm
     * @param hoehe Hoehe des Parallelogramm
     */
    Parallelogramm(double a, double b, double hoehe) {
        super(a, b, hoehe);
    }
}
