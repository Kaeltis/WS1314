package tpe.fruh_razzaq_jando.pue2.steuern;

import java.util.LinkedList;

/**
 * Klasse, welche ein Finanzamt implementiert
 *
 * @author TPE_UIB_01
 */
public class Finanzamt {

    /**
     * Statische Liste um die Einkommensteuer zu verwalten
     */
    private static final LinkedList<Einkommensteuer> einkommensteuerList = new LinkedList<Einkommensteuer>();
    /**
     * Statische Liste um die Koerperschaftssteuer zu verwalten
     */
    private static final LinkedList<Koerperschaftsteuer> koerperschaftsteuerList = new LinkedList<Koerperschaftsteuer>();
    /**
     * Statische Liste um die Gewerbesteuer zu verwalten
     */
    private static final LinkedList<Gewerbesteuer> gewerbesteuerList = new LinkedList<Gewerbesteuer>();


    /**
     * Statische Methode, um einen Verwender des Interfaces Einkommenssteuer durch
     * Polymorphie in die Liste hinzuzufügen
     *
     * @param e Durch Polymorhpie übergebene Klassenreferenz, des Verwenders(Interface)
     */
    public static void addEinkommensteuerpflichtig(Einkommensteuer e) {
        einkommensteuerList.add(e);
    }

    /**
     * Statische Methode, um einen Verwender des Interfaces Koerperschaftssteuer durch
     * Polymorphie in die Liste hinzuzufügen
     *
     * @param k Durch Polymorhpie übergebene Klassenreferenz, des Verwenders(Interface)
     */
    public static void addKoerperschaftsteuerpflichtig(Koerperschaftsteuer k) {
        koerperschaftsteuerList.add(k);
    }

    /**
     * Statische Methode, um einen Verwender des Interfaces Gewerbesteuer durch
     * Polymorphie in die Liste hinzuzufügen
     *
     * @param g Durch Polymorhpie übergebene Klassenreferenz, des Verwenders(Interface)
     */
    public static void addGewerbesteuerpflichtig(Gewerbesteuer g) {
        gewerbesteuerList.add(g);
    }

    /**
     * Methode, welche die gesamte Einkommensteuer berechnet
     *
     * @return Die gesamte Einkommensteuer
     */
    public static int berechneEinkommensteuer() {
        int summe = 0;

        /**
         * Es wird die dynamische Liste der Einkommenssteuer durchlaufen
         * @param e Ist hierbei ein Verwender des Interfaces Einkommensteuer
         */
        for (Einkommensteuer e : einkommensteuerList) {
            summe += e.berechneEinkommensteuer();
        }
        return summe;
    }

    /**
     * Methode, welche die gesamte Koerperschaftsteuer berechnet
     *
     * @return Die gesamte Koerperschaftsteuer
     */
    public static int berechneKoerperschaftsteuer() {
        int summe = 0;
        /**
         * Es wird die dynamische Liste der Koerperschaftsteuer durchlaufen
         * @param k Ist hierbei ein Verwender des Interfaces Koerperschaftsteuer
         */
        for (Koerperschaftsteuer k : koerperschaftsteuerList) {
            summe += k.berechneKoerperschaftsteuer();
        }
        return summe;
    }

    /**
     * Methode, welche die gesamte Gewerbesteuer berechnet
     *
     * @return Die gesamte Gewerbesteuer
     */
    public static int berechneGewerbesteuer() {
        int summe = 0;

        /**
         * Es wird die dynamische Liste der Gewerbesteuer durchlaufen
         * @param g Ist hierbei ein Verwender des Interfaces Gewerbesteuer
         */
        for (Gewerbesteuer g : gewerbesteuerList) {
            summe += g.berechneGewerbesteuer();
        }
        return summe;
    }
}
