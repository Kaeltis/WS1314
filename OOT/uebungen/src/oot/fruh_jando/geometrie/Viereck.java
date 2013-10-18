package oot.fruh_jando.geometrie;

/**
 * Klasse, welche ein Viereck im Sinne einer geometrischen Figur implementiert.
 * Hier sind jediglich allgemeine Eigenschaften implementiert.
 * Andere Klassen, welche auch ein 4-Eck sind erben von dieser Klasse.
 * Das Viereck ist eine Vollwertige Figur, da sie einen Umfang besitzt.
 * @author OOT_UIB_Jando_Fruh
 */
public class Viereck extends VollwertigeFigur {

    /*Jedes 4-Eck hat 4 Seiten und eine Höhe.
    * Bausteine, welche für jede Klasse, die von Viereck erben zur Verfügung stehen
     */
    protected double a, b, c, d, hoehe;

    /**
     * Haupt-Konstruktor, welcher mit 5 Übergabewerten aufgerufen wird.
     * Dieser Konstruktor wird von jedem anderem Konstruktor der Klasse benutzt
     *
     * @param a     Seite a des Vierecks
     * @param b     Seite b des Vierecks
     * @param c     Seite c des Vierecks
     * @param d     Seite d des Vierecks
     * @param hoehe Hoehe des Vierecks
     */
    Viereck(double a, double b, double c, double d, double hoehe) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.hoehe = hoehe;
        berechneFlaeche();
        berechneUmfang();
    }

    /**
     * Konstruktor mit 4 Übergabewerten, z.B. für Trapez
     *
     * @param a     Seite a des Trapez
     * @param b     Seite b des Trapez
     * @param c     Seite c des Trapez
     * @param hoehe Hoehe des Trapez
     */
    Viereck(double a, double b, double c, double hoehe) {
        this(a, b, c, b, hoehe);
    }

    /**
     * Konstruktor mit 3 Übergabewerten, z.B. für Parallelogramm
     *
     * @param a     Seite a des Parallelogramm
     * @param b     Seite b des Parallelogramm
     * @param hoehe Hoehe des Parallelogramm
     */
    Viereck(double a, double b, double hoehe) {
        this(a, b, a, b, hoehe);
    }

    /**
     * Konstruktor mit 2 Übergabewerten, z.B. für Rechteck
     *
     * @param a Seite a des Rechtecks
     * @param b Seite b des Rechtecks
     */
    Viereck(double a, double b) {
        this(a, b, a, b, b);
    }

    /**
     * Konstruktor mit 1 Übergabewert, z.B. für Raute,Quadrat
     *
     * @param a Seite a des Qudrates
     */
    Viereck(double a) {
        this(a, a, a, a, a);
    }

    /*
    * Bis auf einige Ausnahmen ist die Flächeberechnung immer gleich.
    * Sollte eine spzifische Flächenberechnung erwünscht sein, kann man einfach
    * in der jeweiligen Klasse die Methode überschreiben (siehe Trapez)
    */
    protected void berechneFlaeche() {
        this.flaeche = this.a * this.b;
    }

    /*
   * Die Umfangberechnung eines Vierecks ist immer gleich (soweit uns bekannt).
   * Sollte eine spzifische Umfangberechnung erwünscht sein, kann man einfach
   * in der jeweiligen Klasse die Methode überschreiben
   */
    protected void berechneUmfang() {
        this.umfang = this.a + this.b + this.c + this.d;
    }

}
