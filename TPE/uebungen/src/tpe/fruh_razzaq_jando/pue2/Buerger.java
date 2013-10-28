package tpe.fruh_razzaq_jando.pue2;

public class Buerger extends Mensch implements Einkommensteuer {

    public Buerger(String name, int einkommen, int alter) {
        super(name, einkommen, alter);
    }

    @Override
    public int berechneEinkommensteuer() {
        return 0;  //TODO Implement  berechneEinkommensteuer()
    }
}
