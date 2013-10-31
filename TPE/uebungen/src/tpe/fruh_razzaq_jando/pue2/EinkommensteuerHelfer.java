package tpe.fruh_razzaq_jando.pue2;


public abstract class EinkommensteuerHelfer {

    public static int berechneEinkommensteuer(int wert) {
        int steuer = 0;
        if (wert > Konstanten.ONEHUNDREDTWENTYTHOUSAND) {
            steuer += ((wert - Konstanten.ONEHUNDREDTWENTYTHOUSAND) / 100) * 50;
            wert -= (wert - Konstanten.ONEHUNDREDTWENTYTHOUSAND);
        }
        if (wert > Konstanten.SIXTYTHOUSAND) {
            steuer += ((wert - Konstanten.SIXTYTHOUSAND) / 100) * 35;
            wert -= (wert - Konstanten.SIXTYTHOUSAND);
        }
        if (wert > Konstanten.TWENTYTHOUSAND) {
            steuer += (((wert - Konstanten.TWENTYTHOUSAND) / 100) * 25);
            wert -= (wert - Konstanten.TWENTYTHOUSAND);
        }
        steuer = steuer + (wert / 100) * 10;
        return steuer;

    }

}
