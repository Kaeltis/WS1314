package tpe.fruh_razzaq_jando.pue2;

import java.util.LinkedList;

public class Personengesellschaft extends Unternehmen implements Einkommensteuer, Gewerbesteuer {
    public static final int GEWERBESTEUERABZUG = 1000;
    private LinkedList<Buerger> inhaber = new LinkedList<Buerger>();

    public Personengesellschaft(String name, int gewinn, LinkedList<Buerger> inhaber) {
        super(name, gewinn);
        this.inhaber = inhaber;
    }

    public LinkedList<Buerger> getInhaber() {
        return inhaber;
    }

    @Override
    public int berechneEinkommensteuer() {
        int gewinn = this.getGewinn();
        int steuer = 0;
        if (gewinn > Konstanten.ONEHUNDREDTWENTYTHOUSAND) {
            steuer += ((gewinn - Konstanten.ONEHUNDREDTWENTYTHOUSAND) / 100) * 50;
            gewinn -= (gewinn - Konstanten.ONEHUNDREDTWENTYTHOUSAND);
        }
        if (gewinn > Konstanten.SIXTYTHOUSAND) {
            steuer += ((gewinn - Konstanten.SIXTYTHOUSAND) / 100) * 35;
            gewinn -= (gewinn - Konstanten.SIXTYTHOUSAND);
        }
        if (gewinn > Konstanten.TWENTYTHOUSAND) {
            steuer += (((gewinn - Konstanten.TWENTYTHOUSAND) / 100) * 25);
            gewinn -= (gewinn - Konstanten.TWENTYTHOUSAND);
        }
        if (gewinn > Konstanten.ZERO) {
            steuer += (gewinn / 100) * 10;
            gewinn -= gewinn;
        }

        return steuer;
    }

    @Override
    public int berechneGewerbesteuer() {
        int steuer = (this.getGewinn() / 100) * 10;
        if (steuer >= GEWERBESTEUERABZUG) {
            return steuer - GEWERBESTEUERABZUG;
        } else {
            return 0;
        }
    }

    @Override
    public String toString() {
        return "Personengesellschaft{" +
                "inhaber=" + inhaber +
                "} " + super.toString();
    }
}
