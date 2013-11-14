package tpe.fruh_razzaq_jando.pue2;

import tpe.fruh_razzaq_jando.pue2.einwohner.Buerger;
import tpe.fruh_razzaq_jando.pue2.einwohner.Richter;
import tpe.fruh_razzaq_jando.pue2.einwohner.Schurke;
import tpe.fruh_razzaq_jando.pue2.einwohner.Superheld;
import tpe.fruh_razzaq_jando.pue2.helper.Superkraft;
import tpe.fruh_razzaq_jando.pue2.steuern.Finanzamt;
import tpe.fruh_razzaq_jando.pue2.unternehmen.Kapitalgesellschaft;
import tpe.fruh_razzaq_jando.pue2.unternehmen.Personengesellschaft;
import tpe.fruh_razzaq_jando.pue2.unternehmen.Syndikat;

import java.util.LinkedList;
import java.util.Random;

/**
 * Klasse zur Implementierung einer Simulation.
 *
 * @author TPE_UIB_01
 */
final class Simulation {
    /**
     * Liste von Schurken zur Simulation.
     */
    private LinkedList<Schurke> schurken = new LinkedList<Schurke>();
    /**
     * Liste von Superhelden zur Simulation.
     */
    private LinkedList<Superheld>
            superhelden = new LinkedList<Superheld>();
    /**
     * Liste von Kapitalgesellschaften zur Simulation.
     */
    private LinkedList<Kapitalgesellschaft>
            kgs = new LinkedList<Kapitalgesellschaft>();
    /**
     * Liste von Personengesellschaften zur Simulation.
     */
    private LinkedList<Personengesellschaft>
            pgs = new LinkedList<Personengesellschaft>();
    /**
     * Liste von Syndikaten zur Simulation.
     */
    private LinkedList<Syndikat> syndikat =
            new LinkedList<Syndikat>();
    /**
     * Nicht korrupter Richter zur Simulation.
     */
    private Richter braverRichter;
    /**
     * Korrupter Richter zur Simulation.
     */
    private Richter korrupterRichter;

    /**
     * Privater Konstruktor der Klasse Simulation.
     */
    private Simulation() {

    }

    /**
     * Main Methode und Aufrufe aller anderen Methoden.
     *
     * @param args Kommandozeilenparameter - wird nicht benutzt
     */
    public static void main(String[] args) {
        Simulation metropolis = new Simulation();
        System.out.println("Metropolis Simulation\n---------------------");

        metropolis.heldenAnlegen();
        metropolis.schurkenAnlegen();
        metropolis.unternehmenAnlegen();
        metropolis.syndikateAnlegen();
        metropolis.richterAnlegen();

        System.out.println(metropolis.simulationKampf(5));
        System.out.println(metropolis.simulationVerurteilen());
        System.out.println(metropolis.simulationSteuern());

        //DEBUG Ausgabe
        //System.out.println(metropolis.printAll());
    }

    /**
     * Debugmethode zur Ausgabe aller Felder.
     *
     * @return String aller Felder
     */
    private String printAll() {
        return schurken.toString()
                + "\n\n" + superhelden.toString()
                + "\n\n" + kgs.toString()
                + "\n\n" + pgs.toString()
                + "\n\n"
                + syndikat.toString()
                + "\n\n"
                + braverRichter.toString()
                + "\n\n" + korrupterRichter.toString();
    }

    /**
     * Methode um die Steuerberechung zu simulieren.
     *
     * @return String des Ergebnisses der Steuerberechnungen
     */
    private String simulationSteuern() {
        String output = "##### Steuerberechnung-Simulation #####\n\n";
        output += "Berechnete Einkommensteuer: "
                + Finanzamt.berechneEinkommensteuer()
                + " M$\n";
        output += "Berechnete Gewerbesteuer: "
                + Finanzamt.berechneGewerbesteuer()
                + " M$\n";
        output += "Berechnete Körperschaftsteuer: "
                + Finanzamt.berechneKoerperschaftsteuer()
                + " M$\n";
        output += "Gesamte Steuer: "
                + Finanzamt.berecheSteuer()
                + " M$";
        return output;
    }

    /**
     * Methode um eine zufällige Zahl von 0 bis laenge-1 zu erzeugen.
     *
     * @param laenge Größte Zufallszahl-1
     * @return Zufällige Zahl von 0 bis laenge-1
     */
    private int randomElement(int laenge) {
        Random r = new Random();
        return r.nextInt(laenge);
    }

    /**
     * Methode zur Simulation einer Verurteilung.
     *
     * @return String des Ergebnisses der Verurteilungen
     */
    private String simulationVerurteilen() {
        String output = "##### Verurteilen-Simulation #####\n\n";
        Schurke schurke1 = schurken.get(this.randomElement(schurken.size()));

        output += "Der Richter "
                + braverRichter.getName()
                + " urteilt über den Schurken "
                + schurke1.getName() + "\t--- "
                + "Der Schurke ";

        boolean verurteilenErgebnis = braverRichter.verurteilen();
        output += (verurteilenErgebnis
                ? "muss ins Gefängnis" : "kommt frei") + "\n";

        Schurke schurke2 = schurken.get(this.randomElement(schurken.size()));

        output += "Der Richter "
                + korrupterRichter.getName()
                + " urteilt über den Schurken "
                + schurke2.getName() + "\t--- "
                + "Der Schurke ";

        verurteilenErgebnis = korrupterRichter.verurteilen();
        output += (verurteilenErgebnis
                ? "muss ins Gefängnis" : "kommt frei") + "\n";

        return output;
    }

    /**
     * Methode zum durchführen zufälliger Kämpfe von Helden gegen Schurken.
     *
     * @param anzahl Anzahl der zu führenden Kämpfe
     * @return String der Kampfergebnisse
     */
    private String simulationKampf(int anzahl) {
        String output = "##### Kampf-Simulation #####\n\n";
        for (int i = 0; i < anzahl; i++) {
            Superheld held = superhelden.get(
                    this.randomElement(superhelden.size()));
            Schurke schurke = schurken.get(
                    this.randomElement(schurken.size()));
            output += "Der Held "
                    + held.getName()
                    + " kämpft gegen den Schurken "
                    + schurke.getName()
                    + "\t--- Der Held ";

            boolean kampfErgebnis = held.kaempfe(schurke);
            output += (kampfErgebnis ? "gewinnt" : "verliert") + "\n";
        }
        return output;
    }


    /**
     * Methode zum Anlegen der Richter der Simulation.
     */
    private void richterAnlegen() {
        this.braverRichter = new Richter(
                "Sir Richter von Bravenhold", 123456, 43, false);
        this.korrupterRichter = new Richter(
                "Sir Richter von Korruptenstein", 3434545, 34, true);
    }


    /**
     * Methode zum anlegen der Syndikate der Simulation.
     */
    private void syndikateAnlegen() {

        this.syndikat.add(
                new Syndikat("SI:7",
                        new Schurke("Artermis Entreri", 123434,
                                "Viel Geld", Superkraft.Kamehameha),
                        schurken.toArray(new Schurke[schurken.size()])));
    }


    /**
     * Methode zum anlegen der Unternehmen der Simulation.
     */
    private void unternehmenAnlegen() {

        Buerger[] buergerArray = {
                new Buerger("Peter", 123555, 56),
                new Buerger("Kent Clark", 345888, 23),
                new Buerger("Peter Parker", Integer.MAX_VALUE, 44)};

        this.kgs.add(
                new Kapitalgesellschaft("Weihnachtsmann & Co. KG", 450000000,
                        new Buerger("Heinz-Peter", 123456, 45), buergerArray));

        Buerger[] buergerArray2 = {
                new Buerger("Holger", 555321, 65),
                new Buerger("Clark Kent", 888345, 32),
                new Buerger("Parker Peter", 1, 44)};

        this.pgs.add(
                new Personengesellschaft("HS-Mannheim", 34567898,
                        new Buerger("Peter-Heinz", 654321, 54), buergerArray2));
    }

    /**
     * Methode zum anlegen der Helden der Simulation.
     */
    private void heldenAnlegen() {
        this.superhelden.add(
                new Superheld("Wolverine", 40000000, "Krallenhände",
                        Superkraft.Blitzewerfen, Superkraft.Hadoken,
                        Superkraft.Genkidama));

        this.superhelden.add(
                new Superheld("Spiderman", 3000000, "Spinnenkraft",
                        Superkraft.Kaioken, Superkraft.Kamehameha));

        this.superhelden.add(
                new Superheld("Hulk", 5000000, "Grüne Haut",
                        Superkraft.Laserstrahl, Superkraft.Magnetkraft));

        this.superhelden.add(
                new Superheld("Lina", 3450000, "Feueratem",
                        Superkraft.Kamehameha, Superkraft.Blitzewerfen));
        this.superhelden.add(
                new Superheld("Lich", 234545676, "Frostkörper",
                        Superkraft.Hadoken, Superkraft.Magnetkraft,
                        Superkraft.Kamehameha));
    }


    /**
     * Methode zum anlegen der Schurken der Simulation.
     */
    private void schurkenAnlegen() {
        this.schurken.add(
                new Schurke("Heinz", 12000, "Dolchhand", Superkraft.Kaioken));

        this.schurken.add(
                new Schurke("Patrick", 340000, "riesig", Superkraft.Genkidama));

        this.schurken.add(
                new Schurke("Max", 333333, "Surface", Superkraft.Laserstrahl));

        this.schurken.add(
                new Schurke("Yordan", 28903, "Naturlich",
                        Superkraft.Kamehameha));

        this.schurken.add(
                new Schurke("Elena", 45768, "Fliegen", Superkraft.Hadoken));
    }
}
