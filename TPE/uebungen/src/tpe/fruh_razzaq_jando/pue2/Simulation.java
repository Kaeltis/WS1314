package tpe.fruh_razzaq_jando.pue2;

import tpe.fruh_razzaq_jando.pue2.einwohner.Buerger;
import tpe.fruh_razzaq_jando.pue2.einwohner.Richter;
import tpe.fruh_razzaq_jando.pue2.einwohner.Schurke;
import tpe.fruh_razzaq_jando.pue2.einwohner.Superheld;
import tpe.fruh_razzaq_jando.pue2.helper.Superkraft;
import tpe.fruh_razzaq_jando.pue2.unternehmen.Kapitalgesellschaft;
import tpe.fruh_razzaq_jando.pue2.unternehmen.Personengesellschaft;
import tpe.fruh_razzaq_jando.pue2.unternehmen.Syndikat;

import java.util.LinkedList;
import java.util.Random;

/**
 * Klasse zur Implementierung einer Simulation
 *
 * @author TPE_UIB_01
 */
public class Simulation {

    private LinkedList<Schurke> schurken = new LinkedList<Schurke>();
    private LinkedList<Superheld> superhelden = new LinkedList<Superheld>();
    private LinkedList<Kapitalgesellschaft> kgs = new LinkedList<Kapitalgesellschaft>();
    private LinkedList<Personengesellschaft> pgs = new LinkedList<Personengesellschaft>();
    private LinkedList<Syndikat> syndikat = new LinkedList<Syndikat>();
    private Richter braverRichter;
    private Richter korrupterRichter;

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


    }

    private int randomElement(int laenge) {
        Random r = new Random();
        return r.nextInt(laenge);
    }

    private String simulationVerurteilen() {
        String output = "##### Verurteilen-Simulation #####\n\n";
        Schurke schurke1 = schurken.get(this.randomElement(schurken.size()));

        output += "Der Richter " + braverRichter.getName() + " urteilt über den Schurken " + schurke1.getName() + "\t--- " +
                "Der Schurke ";
        boolean verurteilenErgebnis = braverRichter.verurteilen();
        output += (verurteilenErgebnis ? "muss ins Gefängnis" : "kommt frei") + "\n";

        Schurke schurke2 = schurken.get(this.randomElement(schurken.size()));

        output += "Der Richter " + korrupterRichter.getName() + " urteilt über den Schurken " + schurke2.getName() + "\t--- " +
                "Der Schurke ";
        verurteilenErgebnis = korrupterRichter.verurteilen();
        output += (verurteilenErgebnis ? "muss ins Gefängnis" : "kommt frei") + "\n";

        return output;
    }


    private String simulationKampf(int anzahl) {
        String output = "##### Kampf-Simulation #####\n\n";
        for (int i = 0; i < anzahl; i++) {
            Superheld held = superhelden.get(this.randomElement(superhelden.size()));
            Schurke schurke = schurken.get(this.randomElement(schurken.size()));
            output += "Der Held " + held.getName() + " kämpft gegen den Schurken " + schurke.getName() + "\t--- Der Held ";
            boolean kampfErgebnis = held.kaempfe(schurke);
            output += (kampfErgebnis ? "gewinnt" : "verliert") + "\n";
        }
        return output;
    }

    private void richterAnlegen() {
        this.braverRichter = new Richter("Sir Richter von Bravenhold", 123456, 43, false);
        this.korrupterRichter = new Richter("Sir Richter von Korruptenstein", 3434545, 34, true);
    }

    private void syndikateAnlegen() {

        this.syndikat.add(
                new Syndikat("SI:7",
                        new Schurke("Artermis Entreri", 123434, "Viel Geld", Superkraft.Kamehameha),
                        schurken.toArray(new Schurke[schurken.size()])));
    }

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

    private void heldenAnlegen() {
        this.superhelden.add(new Superheld("Wolverine", 40000000, "Krallenhände", Superkraft.Blitzewerfen, Superkraft.Hadoken, Superkraft.Genkidama));
        this.superhelden.add(new Superheld("Spiderman", 3000000, "Spinnenkraft", Superkraft.Kaioken, Superkraft.Kamehameha));
        this.superhelden.add(new Superheld("Hulk", 5000000, "Grüne Haut", Superkraft.Laserstrahl, Superkraft.Magnetkraft));
        this.superhelden.add(new Superheld("Lina", 3450000, "Feueratem", Superkraft.Kamehameha, Superkraft.Blitzewerfen));
        this.superhelden.add(new Superheld("Lich", 234545676, "Frostkörper", Superkraft.Hadoken, Superkraft.Magnetkraft, Superkraft.Kamehameha));
    }


    private void schurkenAnlegen() {
        this.schurken.add(new Schurke("Heinz", 12000, "Dolchhand", Superkraft.Kaioken));
        this.schurken.add(new Schurke("Patrick", 340000, "riesig", Superkraft.Genkidama));
        this.schurken.add(new Schurke("Max", 333333, "Surface", Superkraft.Laserstrahl));
        this.schurken.add(new Schurke("Yordan", 28903, "Naturlich", Superkraft.Kamehameha));
        this.schurken.add(new Schurke("Elena", 45768, "Fliegen", Superkraft.Hadoken));
    }
}
