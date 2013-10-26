package fue.oot1.own_samples.j;

public class ZahlenAddierer {


    public double addition(double wert1, double wert2) {
        return wert1 + wert2;
    }

    public double addition(double wert1, double wert2, double wert3) {
        return addition(wert1, wert2) + wert3;
    }

    public double addition(double wert1, double wert2, double wert3, double wert4) {
        return addition(wert1, wert2, wert3) + wert4;
    }

    public double addition(double wert1, double wert2, double wert3, double wert4, double wert5) {
        return addition(wert1, wert2, wert3, wert4) + wert5;
    }

}
