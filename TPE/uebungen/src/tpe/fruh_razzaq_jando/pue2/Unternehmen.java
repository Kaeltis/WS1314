package tpe.fruh_razzaq_jando.pue2;

/**
 * Abstrakte Klasse um ein Unternehmen zu verwalten
 */
public abstract class Unternehmen {
    /**
     * Membervariable um den Namen zu verwalten
     */
    private String name;
    /**
     * Membervariable um den Gewinn zu verwalten
     */
    private int gewinn;

    /**
     * Konstruktor der Klasse Unternehmen
     *
     * @param name   Name des Unternehmens
     * @param gewinn Gewinn des Unternehmens
     */
    protected Unternehmen(String name, int gewinn) {
        this.name = name;
        this.gewinn = gewinn;
    }

    /**
     * Getter der Membervariable Name
     *
     * @return Den Namen des Unternehmens
     */
    public String getName() {
        return name;
    }

    /**
     * Getter der Membervariable Gewinn
     *
     * @return Den Gewinn des Unternehmens
     */
    public int getGewinn() {
        return gewinn;
    }
}
