package oot.fruh_jando.geometrie;

/**
 * Klasse, welche eine Raute im Sinne einer geometrischen Figur implementiert.
 *
 * @author OOT_UIB_Jando_Fruh
 */
public class Raute extends Viereck {

      /*
    * Diese Klasse hat keine Membervariablen, da diese von einer zentralen
    * Klasse "Viereck" vererbt werden.
    *
    * Jediglich der Konstruktor setzt auf eine Raute
    * spezifische Abhängigkeiten.
    * BSP: a=b=c=d
    *
    * Die Berechnung der Fläche und des Umfang wird per Vererbung
    * durch der Klasse Viereck errechnet.
     */


    public Raute(double a) {
        this.a = a;
        berechneUmfang(this.a, this.a, this.a, this.a);
        berechneFlaeche(this.a, this.a);
    }

}
