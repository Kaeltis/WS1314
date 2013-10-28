package tpe.fruh_razzaq_jando.pue2;

public abstract class Mutant extends Einwohner {
    private String mutation;

    protected Mutant(String name, int einkommen, String mutation) {
        super(name, einkommen);
        this.mutation = mutation;
    }

    public String getMutation() {
        return mutation;
    }

    public abstract boolean kaempfe(Mutant m);
}
