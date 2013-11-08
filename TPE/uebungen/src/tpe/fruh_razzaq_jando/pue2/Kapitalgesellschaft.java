package tpe.fruh_razzaq_jando.pue2;

import java.util.LinkedList;

/**
 * Klasse,welche eine Kapitslgesellschaft implementiert
 *
 * @author TPE_UIB_01
 */
public class Kapitalgesellschaft extends Unternehmen implements Koerperschaftsteuer, Gewerbesteuer {
    /**
     * Dynamische Liste der Gesellschafter
     */
    private LinkedList<Buerger> gesellschafter = new LinkedList<Buerger>();

    /**
     * Konstruktor der Klasse Kapitalgesellschaft
     *
     * @param name           Nsme der Kapitalgesellschaft
     * @param gewinn         Gewinn der Kapitalgesellschaft
     * @param gesellschafter Liste der Gesellschafter(Buerger)
     */
    public Kapitalgesellschaft(String name, int gewinn, LinkedList<Buerger> gesellschafter) {
        super(name, gewinn);
        this.gesellschafter = gesellschafter;
        Finanzamt.addKoerperschaftsteuerpflichtig(this);
        Finanzamt.addGewerbesteuerpflichtig(this);
    }

    /**
     * Getter für die Gesellschafter
     *
     * @return Dynamische Liste der Gesellschafter
     */
    public LinkedList<Buerger> getGesellschafter() {
        return gesellschafter;
    }

    /**
     * Methode um die Koerperschaftssteuer zu berechnen
     *
     * @return Die Koerperschaftssteuer der Kapitalgesellschaft
     */
    @Override
    public int berechneKoerperschaftsteuer() {
        return (this.getGewinn() / 100) * 25;
    }

    /**
     * Interface-Methode um die Gewerbesteuer zu berechnen
     *
     * @return Die Gewerbesteuer der Kapitalgesellschaft
     */
    @Override
    public int berechneGewerbesteuer() {
        return (this.getGewinn() / 100) * 10;
    }

    /**
     * Methode um bei der Ausgabe eines Objektes einen sinnvollen Wert auszugeben
     *
     * @return Einen String zur Beschreibung des Objektes
     */
    @Override
    public String toString() {
        return "Kapitalgesellschaft{" +
                "gesellschafter=" + gesellschafter +
                "} " + super.toString();
    }
}
