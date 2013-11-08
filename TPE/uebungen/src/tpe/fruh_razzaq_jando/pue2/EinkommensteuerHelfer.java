package tpe.fruh_razzaq_jando.pue2;

import static tpe.fruh_razzaq_jando.pue2.Konstanten.*;

/**
 * Abstrakte Klasse um die Einkommensteuer der Verwender  des Interfaces Einkommenssteuer zu berechnen
 * Auslagerung in Helferklasse um Code-Dopplung zu vermeiden
 *
 * @author TPE_UIB_01
 */
public abstract class EinkommensteuerHelfer {

    /**
     * Methode, welche die Eikommensteuer nach einer Formel berechnet
     *
     * @param wert Den Wert, auf welchem die Steuer berechnet werden soll
     * @return Die Steuer in Abhängigkeit den übergebenen Wertes
     */
    public static int berechneEinkommensteuer(int wert) {
        int steuer = 0;
        if (wert > ONEHUNDREDTWENTYTHOUSAND) {
            steuer += ((wert - ONEHUNDREDTWENTYTHOUSAND) / 100) * 50;
            wert -= (wert - ONEHUNDREDTWENTYTHOUSAND);
        }
        if (wert > SIXTYTHOUSAND) {
            steuer += ((wert - SIXTYTHOUSAND) / 100) * 35;
            wert -= (wert - SIXTYTHOUSAND);
        }
        if (wert > TWENTYTHOUSAND) {
            steuer += (((wert - TWENTYTHOUSAND) / 100) * 25);
            wert -= (wert - TWENTYTHOUSAND);
        }
        steuer = steuer + (wert / 100) * 10;
        return steuer;

    }

}
