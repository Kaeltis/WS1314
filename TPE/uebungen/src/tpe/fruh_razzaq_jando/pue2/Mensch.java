package tpe.fruh_razzaq_jando.pue2;

/**
 * Abstrakte Klasse zur Verwaltung eines Menschen
 */
public abstract class Mensch extends Einwohner {
    /**
     * Membervariable für das Alter eines Menschen
     */
    private int alter;

    /**
     * Konstruktor der Klasse Mensch
     *
     * @param name      Name des Menschen
     * @param einkommen Einkommen des Menschen
     * @param alter     Alter des Menschen
     */
    protected Mensch(String name, int einkommen, int alter) {
        super(name, einkommen);
        this.alter = alter;
    }

    /**
     * Getter der Membervariable Alter
     *
     * @return Das Alter des Menschen
     */
    public int getAlter() {
        return alter;
    }

    /**
     * Methode um bei der Ausgabe eines Objektes einen sinnvollen Wert auszugeben
     *
     * @return Einen String zur Beschreibung des Objektes
     */
    @Override
    public String toString() {
        return "Mensch{" +
                "alter=" + alter +
                "} " + super.toString();
    }

}
