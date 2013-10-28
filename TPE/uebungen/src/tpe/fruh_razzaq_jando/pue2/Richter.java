package tpe.fruh_razzaq_jando.pue2;

public class Richter extends Mensch {
    private boolean korrupt;

    public Richter(String name, int einkommen, int alter, boolean korrupt) {
        super(name, einkommen, alter);
        this.korrupt = korrupt;
    }

    public boolean isKorrupt() {
        return korrupt;
    }

    public boolean verurteilen() {
        return !isKorrupt();
    }

    @Override
    public String toString() {
        return "Richter{" +
                "korrupt=" + korrupt +
                "} " + super.toString();
    }
}
