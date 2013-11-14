package tpe.fruh_razzaq_jando.pue2.einwohner;

/**
 * Klasse zur Implementierung eines Richters.
 *
 * @author TPE_UIB_01
 */
public class Richter extends Mensch {
    /**
     * Membervariable zur Beschreibung der Korruptheit(Bestechnung).
     */
    private boolean korrupt;

    /**
     * Konstruktor der Klasse Richter.
     *
     * @param name      Name des Richter
     * @param einkommen Einkommen des Richter
     * @param alter     Alter des des Richter
     * @param korrupt   Korruptheit des Richter
     */
    public Richter(String name, int einkommen, int alter, boolean korrupt) {
        super(name, einkommen, alter);
        this.korrupt = korrupt;
    }

    /**
     * Getter der Membervarialble Korruptheit.
     *
     * @return Korruptheit
     */
    public boolean isKorrupt() {
        return korrupt;
    }

    /**
     * Methode um einen Schurken zu verurteilen.
     *
     * @return Ausgang der Verurteilung
     */
    public boolean verurteilen() {
        return !isKorrupt();
    }

    /**
     * Methode um bei der Ausgabe eines Objektes
     * einen sinnvollen Wert auszugeben.
     *
     * @return Einen String zur Beschreibung des Objektes
     */
    @Override
    public String toString() {
        return "Richter{"
                + "korrupt="
                + korrupt
                + "} "
                + super.toString();
    }
}
