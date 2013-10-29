package tpe.fruh_razzaq_jando.pue2;

public class Buerger extends Mensch implements Einkommensteuer {

    public Buerger(String name, int einkommen, int alter) {
        super(name, einkommen, alter);
    }

    @Override
    public int berechneEinkommensteuer() {
        int einkommen = this.getEinkommen();
        int steuer = 0;
        if (einkommen > Konstanten.ONEHUNDREDTWENTYTHOUSAND) {
            steuer += ((einkommen - Konstanten.ONEHUNDREDTWENTYTHOUSAND) / 100) * 50;
            einkommen -= (einkommen - Konstanten.ONEHUNDREDTWENTYTHOUSAND);
        }
        if (einkommen > Konstanten.SIXTYTHOUSAND) {
            steuer += ((einkommen - Konstanten.SIXTYTHOUSAND) / 100) * 35;
            einkommen -= (einkommen - Konstanten.SIXTYTHOUSAND);
        }
        if (einkommen > Konstanten.TWENTYTHOUSAND) {
            steuer += (((einkommen - Konstanten.TWENTYTHOUSAND) / 100) * 25);
            einkommen -= (einkommen - Konstanten.TWENTYTHOUSAND);
        }
        if (einkommen > Konstanten.ZERO) {
            steuer += (einkommen / 100) * 10;
            einkommen -= einkommen;
        }

        return steuer;
    }


}
