package tpe.fruh_razzaq_jando.pue2;

import java.util.LinkedList;

public class Finanzamt {
    private static LinkedList<Einkommensteuer> einkommensteuerList = new LinkedList<Einkommensteuer>();
    private static LinkedList<Koerperschaftsteuer> koerperschaftsteuerList = new LinkedList<Koerperschaftsteuer>();
    private static LinkedList<Gewerbesteuer> gewerbesteuerList = new LinkedList<Gewerbesteuer>();

    public static void addEinkommensteuerpflichtig(Einkommensteuer e) {
        einkommensteuerList.add(e);
    }

    public static void addKoerperschaftsteuerpflichtig(Koerperschaftsteuer k) {
        koerperschaftsteuerList.add(k);
    }

    public static void addGewerbesteuerpflichtig(Gewerbesteuer g) {
        gewerbesteuerList.add(g);
    }

    public static int berechneEinkommenssteuer() {
        int summe = 0;
        for (Einkommensteuer e : einkommensteuerList) {
            summe += e.berechneEinkommensteuer();
        }
        return summe;
    }

    public static int berechneKoerperschaftsteuer() {
        int summe = 0;
        for (Koerperschaftsteuer k : koerperschaftsteuerList) {
            summe += k.berechneKoerperschaftssteuer();
        }
        return summe;
    }

    public static int berechneGewerbesteuer() {
        int summe = 0;
        for (Gewerbesteuer g : gewerbesteuerList) {
            summe += g.berechneGewerbesteuer();
        }
        return summe;
    }
}
