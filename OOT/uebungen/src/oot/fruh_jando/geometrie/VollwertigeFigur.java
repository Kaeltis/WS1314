package oot.fruh_jando.geometrie;

/**
 * Klasse, welche eine vollwertige Figur implementiert.
 * Eine vollwertige Figur hat einen Flächeninhalt und einen Umfang.
 * Die Fläche wird vererbt durch HalbwertigeFigur
 *
 * @author OOT_UIB_Jando_Fruh
 */
public class VollwertigeFigur extends HalbwertigeFigur{

    /**
     * <p>Wichtig für die Vererbung.
     //Eine Vollwertige Figur hat einen Umfang und eine Fläche<p/>
     */
    protected double umfang;

    protected double getUmfang() {
        return umfang;
    }


}
