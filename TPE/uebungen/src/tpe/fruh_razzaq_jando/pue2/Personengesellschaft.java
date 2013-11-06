package tpe.fruh_razzaq_jando.pue2;

import java.util.LinkedList;
import static tpe.fruh_razzaq_jando.pue2.Konstanten.*;

public class Personengesellschaft extends Unternehmen implements Einkommensteuer, Gewerbesteuer {

    private LinkedList<Buerger> inhaber = new LinkedList<Buerger>();

    public Personengesellschaft(String name, int gewinn, LinkedList<Buerger> inhaber) {
        super(name, gewinn);
        this.inhaber = inhaber;
        Finanzamt.addEinkommensteuerpflichtig(this);
        Finanzamt.addGewerbesteuerpflichtig(this);
    }

    public LinkedList<Buerger> getInhaber() {
        return inhaber;
    }

    @Override
    public int berechneEinkommensteuer() {
        return EinkommensteuerHelfer.berechneEinkommensteuer(this.getGewinn());
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
