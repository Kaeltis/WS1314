package tpe.fruh_razzaq_jando.pue2.unternehmen;

import tpe.fruh_razzaq_jando.pue2.einwohner.Schurke;
import tpe.fruh_razzaq_jando.pue2.steuern.Finanzamt;
import tpe.fruh_razzaq_jando.pue2.steuern.Koerperschaftsteuer;

import java.util.Collections;
import java.util.LinkedList;

/**
 * Klasse zur Implementierung eines Syndikats
 *
 * @author TPE_UIB_01
 */
public class Syndikat implements Koerperschaftsteuer {
    /**
     * Membervariable für den Namen des Syndikats
     */
    private String name;
    /**
     * Membervariable zu Verwaltung der Syndikatmitglieder(Schurken)
     */
    private LinkedList<Schurke> mitglieder = new LinkedList<Schurke>();

    /**
     * Konstruktor der Klasse Syndikat
     *
     * @param name       Names des Syndikats
     * @param mitglieder Mitglieder des Syndikats
     */
    public Syndikat(String name, Schurke pflichtSchurke, Schurke... mitglieder) {
        this.name = name;
        this.mitglieder.add(pflichtSchurke);
        Collections.addAll(this.mitglieder, mitglieder);
        Finanzamt.addKoerperschaftsteuerpflichtig(this);
    }

    /**
     * Getter des Namens
     *
     * @return Den Namen des Syndikats
     */
    public String getName() {
        return name;
    }

    /**
     * Getter der Mitglieder
     *
     * @return Dynamische Liste der Mitglieder
     */
    public LinkedList<Schurke> getMitglieder() {
        return mitglieder;
    }


    /**
     * Interface-Methode um die Koerperschaftssteuer zu berechnen
     *
     * @return Die gesamte Koerperschaftsteuer
     */
    @Override
    public int berechneKoerperschaftsteuer() {
        int summe = 0;
        //Es werden die Mitlgieder des Syndikats durchlaufen
        for (Schurke s : this.mitglieder) {
            summe += s.getEinkommen();
        }
        return (summe / 100) * 25;
    }

    /**
     * Methode um bei der Ausgabe eines Objektes einen sinnvollen Wert auszugeben
     *
     * @return Einen String zur Beschreibung des Objektes
     */
    @Override
    public String toString() {
        return "Syndikat{" +
                "name='" + name + '\'' +
                ", mitglieder=" + mitglieder +
                "} " + super.toString();
    }
}
