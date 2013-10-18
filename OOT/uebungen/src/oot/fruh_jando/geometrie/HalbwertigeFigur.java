package oot.fruh_jando.geometrie;

/**
 * Klasse, welche eine halbwertige Figur implementiert.
 * Eine halbwertige Figur hat nur einen Flächeninhalt
 *
 * @author OOT_UIB_Jando_Fruh
 */
public class HalbwertigeFigur extends Geo {

    /**
     * <p>Wichtig für die Vererbung zu deklarieren.
     * Eine Halbwertige Figur hat einen Umfang und keine Fläche
     * </p>
     */
    protected double flaeche;

    /**
     * <p>Methode zum Ausgeben der Fläche von allen Klassen, welche von
     * Halbwertige Figur erben --> Vererbung!<p/>
     *
     * @return Die Fläche der geomtrischen auf welcher getFlaeche() aufgerufen wurde
     */
    protected double getFlaeche() {
        return this.flaeche;
    }


}
