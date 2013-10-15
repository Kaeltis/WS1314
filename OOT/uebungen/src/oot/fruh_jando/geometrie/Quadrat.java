package oot.fruh_jando.geometrie;

/**
 * Klasse, welche ein Quadrat im Sinne einer geometrischen Figur implementiert.
 *
 * @author OOT_UIB_Jando_Fruh
 */
public class Quadrat extends Viereck {

     /*
    * Diese Klasse hat keine Membervariablen, da diese von einer zentralen
    * Klasse "Viereck" vererbt werden.
    *
    * Jediglich der Konstruktor setzt auf ein Quadrat
    * spezifische Abhängigkeiten.
    * BSP: a=b=c=d
    *
    * Die Berechnung der Fläche und des Umfangs wird per Vererbung
    * durch der Klasse Viereck errechnet.
     */

    Quadrat(double a) {
        this.a = a;
        berechneFlaeche(this.a, this.a);
        berechneUmfang(this.a, this.a, this.a, this.a);
    }

}
