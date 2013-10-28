package tpe.fruh_razzaq_jando.pue2;

public abstract class Mensch extends Einwohner {
    private int alter;

    protected Mensch(String name, int einkommen, int alter) {
        super(name, einkommen);
        this.alter = alter;
    }

    public int getAlter() {
        return alter;
    }
}
