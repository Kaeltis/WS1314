package tpe.fruh_razzaq_jando.pue2.unternehmen;

import tpe.fruh_razzaq_jando.pue2.einwohner.Buerger;
import tpe.fruh_razzaq_jando.pue2.steuern.Finanzamt;
import tpe.fruh_razzaq_jando.pue2.steuern.Gewerbesteuer;
import tpe.fruh_razzaq_jando.pue2.steuern.Koerperschaftsteuer;

import java.util.Collections;
import java.util.LinkedList;

import static tpe.fruh_razzaq_jando.pue2.helper.Konstanten.*;

/**
 * Klasse,welche eine Kapitslgesellschaft implementiert.
 *
 * @author TPE_UIB_01
 */
public class Kapitalgesellschaft extends
        Unternehmen implements Koerperschaftsteuer, Gewerbesteuer {
    /**
     * Dynamische Liste der Gesellschafter.
     */
    private LinkedList<Buerger> gesellschafter = new LinkedList<Buerger>();

    /**
     * Konstruktor der Klasse Kapitalgesellschaft.
     *
     * @param name                  Nsme der Kapitalgesellschaft
     * @param gewinn                Gewinn der Kapitalgesellschaft
     * @param pflichtGesellschafter Pflichtgesellschafter des Gesellschafter
     * @param gesellschafter        Weitere Gesellschafter(Buerger)
     */
    public Kapitalgesellschaft(String name, int gewinn,
                               Buerger pflichtGesellschafter,
                               Buerger... gesellschafter) {

        super(name, gewinn);
        this.gesellschafter.add(pflichtGesellschafter);
        Collections.addAll(this.gesellschafter, gesellschafter);
        Finanzamt.addKoerperschaftsteuerpflichtig(this);
        Finanzamt.addGewerbesteuerpflichtig(this);
    }

    /**
     * Getter für die Gesellschafter.
     *
     * @return Dynamische Liste der Gesellschafter
     */
    public LinkedList<Buerger> getGesellschafter() {
        return gesellschafter;
    }

    /**
     * Methode um die Koerperschaftssteuer zu berechnen.
     *
     * @return Die Koerperschaftssteuer der Kapitalgesellschaft
     */
    @Override
    public int berechneKoerperschaftsteuer() {
        return (this.getGewinn() <= 0) ? 0 : (this.getGewinn() / HUNDRED) * TWENTYFIVE;
    }

    /**
     * Interface-Methode um die Gewerbesteuer zu berechnen.
     *
     * @return Die Gewerbesteuer der Kapitalgesellschaft
     */
    @Override
    public int berechneGewerbesteuer() {
        return (this.getGewinn() <= 0) ? 0 : (this.getGewinn() / HUNDRED) * TEN;
    }

    /**
     * Methode um bei der Ausgabe eines Objektes
     * einen sinnvollen Wert auszugeben.
     *
     * @return Einen String zur Beschreibung des Objektes
     */
    @Override
    public String toString() {
        return "Kapitalgesellschaft{"
                + "gesellschafter="
                + gesellschafter
                + "} "
                + super.toString();
    }
}
