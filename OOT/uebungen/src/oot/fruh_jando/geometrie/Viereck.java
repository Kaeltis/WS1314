package oot.fruh_jando.geometrie;

/**
 * Klasse, welche ein Viereck im Sinne einer geometrischen Figur implementiert.
 * Hier sind jediglich allgemeine Eigenschaften implementiert
 *
 * @author OOT_UIB_Jando_Fruh
 */
public class Viereck extends Geo {

    /*Jedes 4-Eck hat 4 Seiten und eine Höhe.
    * Bausteine, welche für jede Klasse, die von Viereck erben zur Verfügung stehen
     */
    protected double a, b, c, d, hoehe;

    /*
    * Bis auf einige Ausnahmen ist die Flächeberechnung immer gleich.
    * Sollte eine spzifische Flächenberechnung erwünscht sein, kann man einfach
    * in der jeweiligen Klasse die Methode überschreiben (siehe Trapez)
    */
    protected void berechneFlaeche(double a, double b) {
        this.flaeche = a * b;
    }

    /*
   * Die Umfangberechnung eines Vierecks ist immer gleich (soweit uns bekannt).
   * Sollte eine spzifische Umfangberechnung erwünscht sein, kann man einfach
   * in der jeweiligen Klasse die Methode überschreiben
   */
    protected void berechneUmfang(double a, double b, double c, double d) {
        this.umfang = a + b + c + d;
    }

}
