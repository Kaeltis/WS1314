package oot.fruh_jando.geometrie;

/**
 * Klasse, welche eine Raute im Sinne einer geometrischen Figur implementiert.
 *
 * @author OOT_UIB_Jando_Fruh
 */
public class Raute extends Viereck {

    /**
     * <p>Eine Raute hat zusätzlich 2 Diagonalen</p>
     */
    protected double e, f;

      /*
    * Diese Klasse hat keine Membervariablen, da diese von einer zentralen
    * Klasse "Viereck" vererbt werden.
    *
    * Jediglich der Konstruktor setzt auf eine Raute
    * spezifische Abhängigkeiten.
    * BSP: a=b=c=d
    *
    * Die Berechnung der Fläche und des Umfangs wird in der Klasse Viereck berechnet.
    * Siehe super() - Aufruf
     */

    /**
     * Konstruktor um eine Raute zu spezifieren
     *
     * @param a Seite a der Raute
     */
    Raute(double a, double e, double f) {
        super(a);
        this.e = e;
        this.f = f;
        berechneFlaeche();
    }

    protected void berechneFlaeche() {
        this.flaeche = this.e * this.f;
    }
}
