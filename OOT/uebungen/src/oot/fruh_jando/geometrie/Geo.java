package oot.fruh_jando.geometrie;

import java.util.LinkedList;

/**
 * Klasse, welche Grundeingenschaften von geometrischen Figuren implementiert.
 * Alle Äuserungen sind im Bezug gehalten auf das Aufgabenblatt:
 * http://moodle.hs-mannheim.de/mod/resource/view.php?id=23541
 *
 * Eine geometrische Figur kann eine VollwertigeFigur(Umfang + Fläche) oder eine HalbwertigeFigur(Nur Umfang)
 * sein.
 *
 * @author OOT_UIB_Jando_Fruh
 */

public class Geo {
    // Abstrakte Datenstruktur um Referenzen der Klasse
    // Geo(in Form von vererbten Objekten der jeweiligen Klasse zu speichern)
    private LinkedList<Geo> geos = new LinkedList<Geo>();

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
    void addGeo(Geo geo) {
        this.geos.add(geo);
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
