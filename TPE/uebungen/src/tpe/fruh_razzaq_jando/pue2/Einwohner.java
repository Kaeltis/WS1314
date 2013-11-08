package tpe.fruh_razzaq_jando.pue2;

/**
 * Abstrakte Klasse zur Implementierung eines einwohners
 *
 * @author TPE_UIB_01
 */
public abstract class Einwohner {
    /**
     * Membervariable für den Namen des Einwohners
     */
    private String name;
    /**
     * Membervariable für den Gewinn des Einwohners
     */
    private int einkommen;

    /**
     * Konstruktor der Klasse Einwohner
     *
     * @param name      Name des Einwohner
     * @param einkommen Einkommen des Einkommer
     */
    protected Einwohner(String name, int einkommen) {
        this.name = name;
        this.einkommen = einkommen;
    }

    /**
     * Getter der Membervariable Name
     *
     * @return Den Namen des Einwohners
     */
    public String getName() {
        return this.name;
    }

    /**
     * Getter der Membervariable Einkommen
     *
     * @return Das Einkommen des Einwohners
     */
    public int getEinkommen() {
        return einkommen;
    }

    /**
     * Methode um bei der Ausgabe eines Objektes einen sinnvollen Wert auszugeben
     *
     * @return Einen String zur Beschreibung des Objektes
     */
    @Override
    public String toString() {
        return "Einwohner{" +
                "name='" + name + '\'' +
                ", einkommen=" + einkommen +
                '}';
    }
}
