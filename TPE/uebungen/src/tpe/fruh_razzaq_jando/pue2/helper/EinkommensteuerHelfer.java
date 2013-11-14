package tpe.fruh_razzaq_jando.pue2.helper;

import static tpe.fruh_razzaq_jando.pue2.helper.Konstanten.*;


/**
 * Abstrakte Klasse um die Einkommensteuer der Verwender
 * des Interfaces Einkommenssteuer zu berechnen.
 * Auslagerung in Helferklasse um Code-Dopplung zu vermeiden.
 *
 * @author TPE_UIB_01
 */
public abstract class EinkommensteuerHelfer {

    /**
     * Methode, welche die Eikommensteuer nach einer Formel berechnet.
     *
     * @param wert Den Wert, auf welchem die Steuer berechnet werden soll
     * @return Die Steuer in Abhängigkeit den übergebenen Wertes
     */
    public static int berechneEinkommensteuer(int wert) {
        int steuer = 0;
        if (wert > ONEHUNDREDTWENTYTHOUSAND) {
            steuer += ((wert - ONEHUNDREDTWENTYTHOUSAND) / HUNDRED) * FIFTY;
            wert -= (wert - ONEHUNDREDTWENTYTHOUSAND);
        }
        if (wert > SIXTYTHOUSAND) {
            steuer += ((wert - SIXTYTHOUSAND) / HUNDRED) * THIRTYFIVE;
            wert -= (wert - SIXTYTHOUSAND);
        }
        if (wert > TWENTYTHOUSAND) {
            steuer += (((wert - TWENTYTHOUSAND) / HUNDRED) * TWENTYFIVE);
            wert -= (wert - TWENTYTHOUSAND);
        }
        steuer = steuer + (wert / HUNDRED) * TEN;
        return steuer;

    }

}
