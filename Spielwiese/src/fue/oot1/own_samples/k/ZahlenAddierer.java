package fue.oot1.own_samples.k;

public class ZahlenAddierer {

    public double addition(double wert1, double wert2) {
        return wert1 + wert2;
    }

    public double addition(double wert1, double wert2, double wert3) {
        return addition(wert1, wert2) + wert3;
    }

    public double zahlenAddieren(double...werte) {
        double ergebnis = 0.0;
        for (Double d : werte) {
            ergebnis += d;
        }
        return ergebnis;
    }

}
