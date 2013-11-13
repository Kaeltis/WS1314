package tpe.fruh_razzaq_jando.pue2.einwohner;

import tpe.fruh_razzaq_jando.pue2.helper.EinkommensteuerHelfer;
import tpe.fruh_razzaq_jando.pue2.helper.Superkraft;
import tpe.fruh_razzaq_jando.pue2.steuern.Einkommensteuer;
import tpe.fruh_razzaq_jando.pue2.steuern.Finanzamt;

/**
 * Klasse um einen Schurken zu implementieren
 *
 * @author TPE_UIB_01
 */
public class Schurke extends Mutant implements Einkommensteuer {
    /**
     * Membervariable um die Superkraft eines Schurken zu verwalten
     */
    private Superkraft superkraft;

    /**
     * Konstruktor der Klasse Schurke
     *
     * @param superkraft Superkraft des Schurken
     */
    public Schurke(String name, int einkommen, String mutation, Superkraft superkraft) {
        super(name, einkommen, mutation);
        this.superkraft = superkraft;
        Finanzamt.addEinkommensteuerpflichtig(this);
    }

    /**
     * Getter der Superkraft
     *
     * @return Superkraft des Schurken
     */
    public Superkraft getSuperkraft() {
        return superkraft;
    }

    /**
     * Methode um einen Kampf auszutragen
     *
     * @param m Erben der Klassen Mutant
     * @return Ausgang des Kampfes
     */
    @Override
    public boolean kaempfe(Mutant m) {
        if (m instanceof Superheld) {
            return !((Superheld) m).getSuperkraefte().contains(this.superkraft);
        } else {
            throw new IllegalArgumentException("Schurke darf nicht gegen einen anderen Schurken kämpfen!");
        }
    }

    /**
     * Implementierung der abstrakten Methode um die Eikommensteuer eines Schurken zu berechnen
     *
     * @return Die Eikommensteuer des Schurken
     */
    @Override
    public int berechneEinkommensteuer() {
        return EinkommensteuerHelfer.berechneEinkommensteuer(this.getEinkommen());
    }
}
