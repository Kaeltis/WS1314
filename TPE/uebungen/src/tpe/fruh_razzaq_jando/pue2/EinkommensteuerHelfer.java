package tpe.fruh_razzaq_jando.pue2;

import static tpe.fruh_razzaq_jando.pue2.Konstanten.*;


public abstract class EinkommensteuerHelfer {

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
