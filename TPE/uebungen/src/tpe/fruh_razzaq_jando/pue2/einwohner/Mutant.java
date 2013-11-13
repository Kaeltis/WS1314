package tpe.fruh_razzaq_jando.pue2.einwohner;

/**
 * Abstrakte Klasse zur Implementierung eines Mutanten
 *
 * @author TPE_UIB_01
 */
public abstract class Mutant extends Einwohner {
    /**
     * Membervariable zur Beschreibung des Mutation
     */
    private String mutation;

    /**
     * Konstruktor der Klasse Mutant
     *
     * @param name      Names des Mutanten
     * @param einkommen Einkommen des Mutanten
     * @param mutation  Mutation des Mutanten
     */
    protected Mutant(String name, int einkommen, String mutation) {
        super(name, einkommen);
        this.mutation = mutation;
    }

    /**
     * Getter der Mutation
     *
     * @return Die Mutation des Mutanten
     */
    public String getMutation() {
        return mutation;
    }

    /**
     * Abstrakte Methode zur Implementierung eines Kampfes
     *
     * @param m Erben der Klassen Mutant
     * @return Ausgang des Kampfes in Form eines Booleans
     */
    public abstract boolean kaempfe(Mutant m);

    /**
     * Methode um bei der Ausgabe eines Objektes einen sinnvollen Wert auszugeben
     *
     * @return Einen String zur Beschreibung des Objektes
     */
    @Override
    public String toString() {
        return "Mutant{" +
                "mutation='" + mutation + '\'' +
                "} " + super.toString();
    }
}
