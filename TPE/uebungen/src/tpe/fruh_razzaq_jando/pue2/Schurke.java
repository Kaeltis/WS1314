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
        if (m instanceof Superheld) {
            return !((Superheld) m).getSuperkraefte().contains(this.superkraft);
        } else {
            throw new IllegalArgumentException("Schurke darf nicht gegen einen anderen Schurken kämpfen!");
        }
    }

    @Override
    public int berechneEinkommensteuer() {
        return EinkommensteuerHelfer.berechneEinkommensteuer(this.getEinkommen());
    }
}
