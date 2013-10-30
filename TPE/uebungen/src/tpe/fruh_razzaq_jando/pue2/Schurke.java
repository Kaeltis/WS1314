package tpe.fruh_razzaq_jando.pue2;

public class Schurke extends Mutant implements Einkommensteuer {
    private Superkraft superkraft;

    public Schurke(String name, int einkommen, String mutation, Superkraft superkraft) {
        super(name, einkommen, mutation);
        this.superkraft = superkraft;
        Finanzamt.addEinkommensteuerpflichtig(this);
    }

    public Superkraft getSuperkraft() {
        return superkraft;
    }

    @Override
    public boolean kaempfe(Mutant m) {
        if (m instanceof Schurke) {
            throw new IllegalArgumentException("Schurke darf nicht gegen einen anderen Schurken kämpfen!");
        } else {
            return !((Superheld) m).getSuperkraefte().contains(this.superkraft);
        }
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
