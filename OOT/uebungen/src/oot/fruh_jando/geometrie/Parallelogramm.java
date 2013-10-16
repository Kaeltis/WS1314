package oot.fruh_jando.geometrie;

/**
 * Klasse, welche ein Parallelogramm im Sinne einer geometrischen Figur implementiert.
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
    * Die Berechnung der Fläche und des Umfangs wird per Vererbung
    * durch der Klasse Viereck errechnet.
     */

    public Parallelogramm(double a, double c, double hoehe) {
        this.a = a;
        this.b = a;
        this.c = c;
        this.d = c;
        this.hoehe = hoehe;
        berechneUmfang(this.a, this.b, this.c, this.d);
        berechneFlaeche(this.a, this.hoehe);
    }
}
