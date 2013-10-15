package oot.fruh_jando.geometrie;

public class Raute extends Viereck {

    public Raute(double a) {
        this.a = a;
        super.berechneUmfang(this.a, this.a, this.a, this.a);
        super.berechneFlaeche(this.a, this.a);
    }

}
