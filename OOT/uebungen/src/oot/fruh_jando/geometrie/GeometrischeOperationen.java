package oot.fruh_jando.geometrie;

import java.util.LinkedList;

/**
 * Hauptprogramm, welches Geometrische Figuren anlegt,
 * und verschiedene Operationen durchführt.
 *
 * @author OOT_UIB_Jando_Fruh
 */
public class GeometrischeOperationen {
    public static void main(String[] args) {
        // ================================================================================
        // Anlegen der Objekte und speichern in der Liste
        // ================================================================================
        Geo geo = new Geo();
        Kreis kreis1 = new Kreis(4d);
        geo.addGeo(kreis1);
        Trapez trapez1 = new Trapez(3, 4, 5, 8);
        geo.addGeo(trapez1);
        Quadrat quadrat1 = new Quadrat(6);
        geo.addGeo(quadrat1);
        Kreisring kreisring1 = new Kreisring(12, 9);
        geo.addGeo(kreisring1);
        Kreissegment kreissegment1 = new Kreissegment(6, 45);
        geo.addGeo(kreissegment1);
        Parallelogramm parallelogramm1 = new Parallelogramm(4, 8, 5);
        geo.addGeo(parallelogramm1);
        Raute raute1 = new Raute(6);
        geo.addGeo(raute1);

        // ================================================================================
        // Aufrufen der Flächen -und Umfangmethode (Vererbung!)
        // ================================================================================
        double gesamtFleache = gesamtFleache(geo.getGeos());
        double gesamtUmfang = gesamtUmfang(geo.getGeos());
        System.out.println("Die Gesamtflaeche betraegt :" + gesamtFleache);
        System.out.println("Der Durchschnitt aller Umfänge beträgt :" + gesamtUmfang);
        System.out.print("Ausgabe aller Objekte: ");
        printAll(geo.getGeos());
    }

    /**
     * Methode um wollwertige geometrische Figuren in der Liste zu zählen.
     * Wichtig für den Durchschnitts-Umfang.
     * @param geos Liste der geometrischen Objekte
     * @return Die Gesamtanzahl aller Vollwertigen geometrischen Figuren
     */
    private static int getListSize(LinkedList<Geo> geos) {
        int counter = 0;
        for (Geo g : geos) {
            if (g instanceof VollwertigeFigur) {
                counter++;
            }
        }
        return counter;
    }


    private static void printAll(LinkedList<Geo> geos) {
        System.out.println(geos);
    }

    private static double gesamtUmfang(LinkedList<Geo> geos) {
        double gesamtUmfang = 0.0;
        byte counter = 0;
        for (Geo g : geos) {
            //Falls die geometrische Figur keinen Umfang hat
            if (g instanceof VollwertigeFigur) {
                gesamtUmfang += ((VollwertigeFigur) g).getUmfang(); //Expliziter Cast zu VollwertigeFigur
            }
        }
        return (gesamtUmfang / getListSize(geos)); //Den Durchschnitt des Gesamt-Umfangs zurückgeben
    }

    private static double gesamtFleache(LinkedList<Geo> geos) {
        double gesamtflaeche = 0.0;
        for (Geo g : geos) {
            gesamtflaeche += ((HalbwertigeFigur)g).getFlaeche(); //Expliziter Cast zu Halbwertige Figur
        }
        return gesamtflaeche;
    }


}
