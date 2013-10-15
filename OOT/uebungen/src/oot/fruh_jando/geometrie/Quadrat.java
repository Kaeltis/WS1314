package oot.fruh_jando.geometrie;

public class Quadrat extends Viereck {

    Quadrat(double a) {
        this.a = a;
        super.berechneFlaeche(this.a, this.a);
        super.berechneUmfang(this.a, this.a, this.a, this.a);
    }

}
