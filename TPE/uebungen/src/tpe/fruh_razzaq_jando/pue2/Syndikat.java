package tpe.fruh_razzaq_jando.pue2;

import java.util.LinkedList;

public class Syndikat implements Koerperschaftsteuer {
    private String name;
    private LinkedList<Schurke> mitglieder = new LinkedList<Schurke>();

    public Syndikat(String name, LinkedList<Schurke> mitglieder) {
        this.name = name;
        this.mitglieder = mitglieder;
        Finanzamt.addKoerperschaftsteuerpflichtig(this);
    }

    public String getName() {
        return name;
    }

    public LinkedList<Schurke> getMitglieder() {
        return mitglieder;
    }

    @Override
    public int berechneKoerperschaftssteuer() {
        int summe = 0;
        for (Schurke s : this.mitglieder) {
            summe += s.getEinkommen();
        }
        return (summe / 100) * 25;
    }
}
