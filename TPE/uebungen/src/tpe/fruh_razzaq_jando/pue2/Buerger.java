package tpe.fruh_razzaq_jando.pue2;

public class Buerger extends Mensch implements Einkommensteuer {

    public Buerger(String name, int einkommen, int alter) {
        super(name, einkommen, alter);
        Finanzamt.addEinkommensteuerpflichtig(this);
    }

    public int berechneEinkommensteuer() {
        return EinkommensteuerHelfer.berechneEinkommensteuer(this.getEinkommen());
    }


}
