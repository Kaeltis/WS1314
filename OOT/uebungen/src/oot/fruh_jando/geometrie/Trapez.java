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
    * Die Berechnung der Fläche und des Umfangs wird per Vererbung
    * durch der Klasse Viereck errechnet.
     */

    public Trapez(double a, double b, double c, double hoehe) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = b;
        this.hoehe = hoehe;
        super.berechneUmfang(this.a, this.b, this.c, this.d);
        berechneFlaecheninhalt(this.a, this.c, this.hoehe);
    }

    //Keine Vererbung, da die Trapez-Fläche spezifisch ist.
    private void berechneFlaecheninhalt(double a, double c, double hoehe) {
        this.flaeche = (0.5 * (a + c) * hoehe);
    }


}
