package tpe.fruh_razzaq_jando.pue2;

import java.util.LinkedList;

public class Superheld extends Mutant {
    private LinkedList<Superkraft> superkraefte = new LinkedList<Superkraft>();

    public Superheld(String name, int einkommen, String mutation, LinkedList<Superkraft> superkraefte) {
        super(name, einkommen, mutation);
        this.superkraefte = superkraefte;
    }

    public LinkedList<Superkraft> getSuperkraefte() {
        return superkraefte;
    }

    @Override
    public boolean kaempfe(Mutant m) {
        if (m instanceof Superheld) {
            throw new IllegalArgumentException("Superheld darf nicht gegen einen anderen Superhelden kämpfen!");
        } else {
            return !this.getSuperkraefte().contains(((Schurke) m).getSuperkraft());
        }
    }
}