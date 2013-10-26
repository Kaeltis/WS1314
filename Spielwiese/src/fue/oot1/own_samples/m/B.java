package fue.oot1.own_samples.m;


public class B extends A {

    //1
    // Aufrufbar, aber nicht zulässig. Würde eine Klasse von B erben
    // ist die Methode von A überdeckt und nicht mehr sichtbar
    //private int methode(int j){return 4;}

    //2
    // Aufrufbar, aber nicht zulässig. Würde eine Klasse von B erben
    // ist die Methode von A überdeckt und nicht mehr sichtbar
    //private int methode(int k){return 5;}

    //3
    //Beim Überdecken muss alles gleich sein. Double geht hier nicht
    //private double methode(int k){return 4.0;}

    //4
    //Gültig da die Methode überladen ist. Würde man jetzt jedoch eine Klasse von B erben lassen
    //so müsste man die Methode mindestens auf protected setzten
    //private int methode(double k){return 4;}

    //5
    //Gültig da die Methode überladen ist. Würde man jetzt jedoch eine Klasse von B erben lassen
    //so müsste man die Methode mindestens auf protected setzten
    //double methode(int k, int j){return 4.0;}

    //6
    //Gültig da die Methode überladen ist. Würde man jetzt jedoch eine Klasse von B erben lassen
    //so müsste man die Methode mindestens auf protected setzten
    //private int methode(int k, int j){return 4;}

    //7
    //Korrekt aus A überschrieben und richtige Sichtbarkeit
    //protected int methode(int k){return 4;}

    //8
    //Das geht nicht, da es bereits aus A eine Methode mit
    //dieser Signatur gibt
    //protected double methode(int k){return 4.0;}

    //9
    //Korrekt überladen, Sichtbarkeit nicht eingeschränkt
    //protected int methode(double k){return 4;}

    //10
    //Korrekt überladen, Sichtbarkeit nicht eingeschränkt
    //protected double methode(int k, int j) {return 4.0;}

    //11
    //Korrekt überladen, Sichtbarkeit nicht eingeschränkt
    //protected int methode(int k, int j){return 4;}

    //12
    //Korrekt überschrieben, Sichtbarkeit nicht eingeschränkt
    //public int methode(int k){return 4;}

    //13
    //Das geht nicht, da es bereits aus A eine Methode mit
    //dieser Signatur gibt
    //public double methode(int k){return 4.0;}

    //14
    //Korrekt überladen, Sichtbarkeit nicht eingeschränkt
    //public int methode(double k){return 4;}

    //15
    //Korrekt überladen, Sichtbarkeit nicht eingeschränkt
    //public double methode(int k, int j){return 4.0;}

    //16
    //Korrekt überladen, Sichtbarkeit nicht eingeschränkt
    //public int methode(int k, int j){return 4;}
}
