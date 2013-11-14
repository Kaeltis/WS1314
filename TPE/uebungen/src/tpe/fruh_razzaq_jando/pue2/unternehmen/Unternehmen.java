package tpe.fruh_razzaq_jando.pue2.unternehmen;

/**
 * Abstrakte Klasse um ein Unternehmen zu verwalten.
 */
public abstract class Unternehmen {
    /**
     * Membervariable um den Namen zu verwalten.
     */
    private String name;
    /**
     * Membervariable um den Gewinn zu verwalten.
     */
    private int gewinn;

    /**
     * Konstruktor der Klasse Unternehmen.
     *
     * @param name   Name des Unternehmens
     * @param gewinn Gewinn des Unternehmens
     */
    protected Unternehmen(String name, int gewinn) {
        this.name = name;
        this.gewinn = gewinn;
    }

    /**
     * Getter der Membervariable Name.
     *
     * @return Den Namen des Unternehmens
     */
    public String getName() {
        return name;
    }

    /**
     * Getter der Membervariable Gewinn.
     *
     * @return Den Gewinn des Unternehmens
     */
    public int getGewinn() {
        return gewinn;
    }

    /**
     * Methode um bei der Ausgabe eines Objektes einen
     * sinnvollen Wert auszugeben.
     *
     * @return Einen String zur Beschreibung des Objektes
     */
    @Override
    public String toString() {
        return "Unternehmen{"
                + "name='"
                + name
                + '\''
                + ", gewinn="
                + gewinn
                + "} " + super.toString();
    }
}
