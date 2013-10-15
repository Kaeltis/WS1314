package oot.fruh_jando.geometrie;

import java.util.LinkedList;

/**
 * Klasse, welche Grundeingenschaften von geometrischen Figuren implementiert.
 * Alle Äuserungen sind im Bezug gehalten auf das Aufgabenblatt:
 * http://moodle.hs-mannheim.de/mod/resource/view.php?id=23541
 *
 * @author OOT_UIB_Jando_Fruh
 */

public class Geo {
    // Abstrakte Datenstruktur um Referenzen der Klasse
    // Geo(in Form von vererbten Objekten der jeweiligen Klasse zu speichern)
    private LinkedList<Geo> geos = new LinkedList<Geo>();

    //Wichtig für die Vererbung zu deklarieren. Standardannahme ist,
    // das jede geometrische Figur eine Fläche und einen Umfang hat.
    protected double flaeche;
    protected double umfang;

    /*
    * Getter für die dynamische Datenstruktur
    */
    LinkedList<Geo> getGeos() {
        /*Hier ist interesannt, das der Inhalt das Resultat der jeweiligen
        * toString()- Methode ist, welche auf jede Klasse vererbt wurde.
        * (Natürlich nur die, welche auch zur ADT hinzugefügt wurden)
        * Beispiel-Ausgabe ist: [Kreis, Trapez, Quadrat, Kreisring, Kreissegment, Parallelogramm, Raute]
        */
        return geos;
    }

    /*Das setzen der Objektreferenzen in den Abstrakten Datentyp wurde
    * in eine extra Methode ausgelagert
    */
    void setGeos(Object object) {
        this.geos.add((Geo) object);
    }

    /*
    * Um den Umfang und Flaeche auf allen Ebenen zu erhalten ist
    * eine Deklaration hier von Nöten. Das setzen der Fläche und des Umfangs wurde
    * bewusst weggelassen, da diese Berechnungen von Figur zu Figur unterschiedlich sind.
    * Die Fläche und der Umfang wird im Konstruktor der jeweiligen Klasse
    * beim Erstellen des Objektes errechnet.
    * Ergänzung: Bei den Figuren, welche aus einem 4-Eck abgeleitet werden können, wurde
    * eine seperate Klasse Viereck erstellt.
    */
    double getUmfang() {
        return umfang;
    }

    double getFlaeche() {
        return flaeche;
    }

    //to String Methode soll vererbt werden, damit in der jeweiligen Klasse der
    //Klassenname ausgegeben wird.
    @Override
    public String toString() {
        //substring(Ab welchem Zeichen bei einem Paramaeter) entfernt den
        // absoluten Dateinamen der Klassendatei.
        //Bsp: Aus oot.fruh_jando.geometrie.Kreis  wird Kreis
        return this.getClass().getName().substring(25);
    }

}
