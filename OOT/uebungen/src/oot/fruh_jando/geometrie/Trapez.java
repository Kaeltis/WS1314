package oot.fruh_jando.geometrie;

/**
 * Klasse, welche ein Trapez im Sinne einer geometrischen Figur implementiert.
 *
 * @author OOT_UIB_Jando_Fruh
 */
public class Trapez extends Viereck {

     /*
    * Diese Klasse hat keine Membervariablen, da diese von einer zentralen
    * Klasse "Viereck" vererbt werden.
    *
    * Jediglich der Konstruktor setzt auf ein Trapez
    * spezifische Abhängigkeiten.
    * BSP: b=c
    *
    * Die Berechnung des Umfangs wird in der Klasse Viereck berechnet.
    * Siehe super() - Aufruf
    *
    * Der Flächeninhalt ist spezifisch und wird deshalb hier in der eigenen Klasse berechnet
     */

    /**
     * Konstruktor um ein Trapez zu spezifizieren
     *
     * @param a     Seite a des Trapez
     * @param b     Seite b des Trapez
     * @param c     Seite c des Trapez
     * @param hoehe Hoehe des Trapez
     */
    Trapez(double a, double b, double c, double hoehe) {
        super(a, b, c, hoehe);
        berechneFlaecheninhalt(this.a, this.c, this.hoehe);
    }

    //Keine Vererbung, da die Trapez-Fläche spezifisch ist.
    private void berechneFlaecheninhalt(double a, double c, double hoehe) {
        this.flaeche = (0.5 * (a + c) * hoehe);
    }


}
