package oot.fruh_jando.geometrie;

import java.util.LinkedList;

/**
 * Hauptprogramm, welches Geometrische Figuren anlegt,
 * und verschiedene Operationen durchführt.
 */
public class GeometrischeOperationen {
    public static void main(String[] args) {
        // ================================================================================
        // Anlegen der Objekte und speichern in der Liste
        // ================================================================================
        Geo geo = new Geo();
        Kreis kreis1 = new Kreis(4d);
        geo.setGeos(kreis1);
        Trapez trapez1 = new Trapez(3, 4, 5, 8);
        geo.setGeos(trapez1);
        Quadrat quadrat1 = new Quadrat(6);
        geo.setGeos(quadrat1);
        Kreisring kreisring1 = new Kreisring(12, 9);
        geo.setGeos(kreisring1);
        Kreissegment kreissegment1 = new Kreissegment(6, 45);
        geo.setGeos(kreissegment1);
        Parallelogramm parallelogramm1 = new Parallelogramm(4, 8, 5);
        geo.setGeos(parallelogramm1);
        Raute raute1 = new Raute(6);
        geo.setGeos(raute1);

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

    private static void printAll(LinkedList<Geo> geos) {
        System.out.println(geos);
    }

    private static double gesamtUmfang(LinkedList<Geo> geos) {
        double gesamtUmfang = 0.0;
        for (Geo g : geos) {
            gesamtUmfang += g.getUmfang();
        }
        return (gesamtUmfang / geos.size()); //Den Durchschnitt des Gesamt-Umfangs zurückgeben
    }

    private static double gesamtFleache(LinkedList<Geo> geos) {
        double gesamtflaeche = 0.0;
        for (Geo g : geos) {
            gesamtflaeche += g.getFlaeche();
        }
        return gesamtflaeche;
    }


}
