package tpe.fruh_razzaq_jando.pue2;

import java.util.Collections;
import java.util.LinkedList;

import static tpe.fruh_razzaq_jando.pue2.Konstanten.GEWERBESTEUERABZUG;

/**
 * Klasse um eine Personengesellschaft zu implementieren
 */
public class Personengesellschaft extends Unternehmen implements Einkommensteuer, Gewerbesteuer {

    /**
     * Membervariable für die Inhaber der Personengesellschaft
     */
    private LinkedList<Buerger> inhaber = new LinkedList<Buerger>();

    /**
     * Konstruktor der Klasse Personengesellschaft
     *
     * @param name    Name der Personengesellschaft
     * @param gewinn  Gewinn der der Personengesellschaft
     * @param inhaber Inhaber der Personengesellschaft
     */
    public Personengesellschaft(String name, int gewinn, Buerger pflichtInhaber, Buerger... inhaber) {
        super(name, gewinn);
        this.inhaber.add(pflichtInhaber);
        Collections.addAll(this.inhaber, inhaber);
        Finanzamt.addEinkommensteuerpflichtig(this);
        Finanzamt.addGewerbesteuerpflichtig(this);
    }

    /**
     * Getter der Membervarialbe Inhaber
     *
     * @return Die Inhaber der Gesellschaft
     */
    public LinkedList<Buerger> getInhaber() {
        return inhaber;
    }

    /**
     * Interface-Methode um die Einkommensteuer zu berechnen
     *
     * @return Die Einkommensteuer der Personengesellschaft
     */
    @Override
    public int berechneEinkommensteuer() {
        return EinkommensteuerHelfer.berechneEinkommensteuer(this.getGewinn());
    }

    /**
     * Interface-Methode um die Gewerbesteuer zu berechnen
     *
     * @return Die Gewerbesteuer der Personengesellschaft
     */
    @Override
    public int berechneGewerbesteuer() {
        int steuer = (this.getGewinn() / 100) * 10;
        if (steuer >= GEWERBESTEUERABZUG) {
            return steuer - GEWERBESTEUERABZUG;
        } else {
            return 0;
        }
    }

    /**
     * Methode um bei der Ausgabe eines Objektes einen sinnvollen Wert auszugeben
     *
     * @return Einen String zur Beschreibung des Objektes
     */
    @Override
    public String toString() {
        return "Personengesellschaft{" +
                "inhaber=" + inhaber +
                "} " + super.toString();
    }
}
