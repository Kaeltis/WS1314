package tpe.fruh_razzaq_jando.pue2;

import java.util.LinkedList;

public class Kapitalgesellschaft extends Unternehmen implements Koerperschaftsteuer, Gewerbesteuer {
    private LinkedList<Buerger> gesellschafter = new LinkedList<Buerger>();

    public Kapitalgesellschaft(String name, int gewinn, LinkedList<Buerger> gesellschafter) {
        super(name, gewinn);
        this.gesellschafter = gesellschafter;
        Finanzamt.addKoerperschaftsteuerpflichtig(this);
        Finanzamt.addGewerbesteuerpflichtig(this);
    }

    public LinkedList<Buerger> getGesellschafter() {
        return gesellschafter;
    }

    @Override
    public int berechneKoerperschaftssteuer() {
        return (this.getGewinn() / 100) * 25;
    }

    @Override
    public int berechneGewerbesteuer() {
        return (this.getGewinn() / 100) * 10;
    }

    @Override
    public String toString() {
        return "Kapitalgesellschaft{" +
                "gesellschafter=" + gesellschafter +
                "} " + super.toString();
    }
}
