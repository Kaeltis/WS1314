package tpe.fruh_razzaq_jando.pue2.einwohner;

import tpe.fruh_razzaq_jando.pue2.helper.Superkraft;

import java.util.Collections;
import java.util.LinkedList;

/**
 * Klasse zur Implemntierung eines Superhelden
 *
 * @author TPE_UIB_01
 */
public class Superheld extends Mutant {

    /**
     * Membervariable zur Beschreibung der Superkräfte
     */
    private LinkedList<Superkraft> superkraefte = new LinkedList<Superkraft>();

    /**
     * Konstruktor des Superhelden
     *
     * @param name              Name des Helden
     * @param einkommen         Einkommen des Helden
     * @param mutation          Mutation des Helden
     * @param pflichtSuperkraft Pflichtsuperkraft des Helden
     * @param superkraefte      Weitere Superkräfte des Helden
     */
    public Superheld(String name, int einkommen, String mutation, Superkraft pflichtSuperkraft, Superkraft... superkraefte) {
        super(name, einkommen, mutation);
        this.superkraefte.add(pflichtSuperkraft);
        Collections.addAll(this.superkraefte, superkraefte);
    }

    /**
     * Getter der Superkräfte
     *
     * @return Dynamische Liste der Superkräfte
     */
    public LinkedList<Superkraft> getSuperkraefte() {
        return superkraefte;
    }

    /**
     * Methode um bei der Ausgabe eines Objektes einen sinnvollen Wert auszugeben
     *
     * @return Einen String zur Beschreibung des Objektes
     */
    @Override
    public boolean kaempfe(Mutant m) {
        if (m instanceof Schurke) {
            //Redundanter Aufruf von Schuke, da der Ausgang des Kampfes, bei gleichen Personen, in jeder Richtung
            //gleich ausgehen muss
            return m.kaempfe(this);
        } else {
            throw new IllegalArgumentException("Superheld darf nicht gegen einen anderen Superhelden kämpfen!");
        }
    }
}