package oot.fruh_jando.geometrie;

/**
 * Klasse, welche eine halbwertige Figur implementiert.
 * Eine halbwertige Figur hat nur einen Flächeninhalt
 *
 * @author OOT_UIB_Jando_Fruh
 */
public class HalbwertigeFigur extends Geo {

    //Wichtig für die Vererbung zu deklarieren.
    //Eine Halbwertige Figur hat einen Umfang und keine Fläche
    protected double flaeche;

    protected double getFlaeche() {
        return this.flaeche;
    }


}
