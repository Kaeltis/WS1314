package tpe.fruh_razzaq_jando.pue2;

public abstract class Einwohner {
    private String name;
    private int einkommen;

    protected Einwohner(String name, int einkommen) {
        this.name = name;
        this.einkommen = einkommen;
    }

    public String getName() {
        return this.name;
    }

    public double getEinkommen() {
        return einkommen;
    }
}
