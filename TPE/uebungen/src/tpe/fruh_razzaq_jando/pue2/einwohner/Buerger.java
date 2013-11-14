package tpe.fruh_razzaq_jando.pue2.einwohner;

import tpe.fruh_razzaq_jando.pue2.helper.EinkommensteuerHelfer;
import tpe.fruh_razzaq_jando.pue2.steuern.Einkommensteuer;
import tpe.fruh_razzaq_jando.pue2.steuern.Finanzamt;

/**
 * Klasse Buerger, welche einen Buerger implementiert.
 *
 * @author TPE_UIB_01
 */
public class Buerger extends Mensch implements Einkommensteuer {
    /**
     * Konstruktor der Klasse Buerger.
     *
     * @param name      Name des Buergers
     * @param einkommen Einkommen des Buergers
     * @param alter     Alter des Buergers
     */
    public Buerger(String name, int einkommen, int alter) {
        super(name, einkommen, alter);
        Finanzamt.addEinkommensteuerpflichtig(this);
    }

    /**
     * Methode, welche die Einkommensteuer eines Buergers berechnet.
     *
     * @return Die Einkommenssteuer des Buergers
     */
    public int berechneEinkommensteuer() {
        return EinkommensteuerHelfer.
                berechneEinkommensteuer(this.getEinkommen());
    }

}
