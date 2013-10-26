package tpe.fruh_razzaq_jando.fue_oo1;

public class Uebungen {

    /*
    a)
        -public: Öffentlich, jeder darf darauf zugreifen. Z.B. für eine Klasse Bruch und man möchte von ausserhalb
                 den Kehrwert eines Bruches berechnen.

        -protected: "Geschützt" Nur erbende Klasse dürfen darauf zugreifen. BSP: Man hat eine Klasse Auto, dort drinn
                    enthalten sind Membervariablen, die man gerne auch in allen Klassen benutzen möchte, welche ein
                    Auto sind. Also RandomClass extends Auto {}. Würde man die Felder private setzten, wären sie
                    zwar in der erbenden Klasse vorhanden, jedocn nicht sichtbar und könnten somit nicht benutzt werden.

        -private: Das was private gemacht wurde kann nur innerhalb der Klasse verwendet werden. So schützt man den
                  Zugriff von aussen.
                  BPS: Man möchte 2 Brüche miteinander addieren, und hat dafür eine Methode geschrieben, welche dies
                       implementiert. Hier reicht es vollkommen aus, eine Methode public zu machen, die dann in einem
                       weiteren Schritt die Methode aufruft, welche es schließlich berechnet. Es interessiert niemanden
                       von aussen wwie man den Bruch addiert. --> Hauptsache es stimmt


    b)

        -Verdecken: Verdeckt werden kann z.B. eine lokale Variable in einem Namensraum.
            BPS:
            public class A {
            int wert = 5;

            public static void main(String[] args){
                f(100);
            }
                public static void f(int wert){
                    //Hier würde nun 100 ausgegeben werden, da wer überdeckt wird.
                    System.out.println(wert);
                }
            }


        -Überladen: Überladene Methoden haben den gleichen Namen, Rückgabetyp jedoch unterschiedliche
                    Paramaterlisten.
                    BSP:

                    public class B {
                        void f(int wert){ .. };
                        void f(int wert, int wert2){ .. };
                        void f(int wert, int wert2, int wert3){ .. };
                    }

                    Ruft man jetzt nacheinander die Methoden auf, erhält man das folgende
                    Ergebnis:
                    2
                    2 3
                    2 3 4

                    Beachte:
                    Überadene Methoden beachten ausschließlich die Signatur(Name und Parameterliste) eine Methode.
                    Es kann also nicht folgendes existieren:

                    public void f(int wert){ .. }
                    //Hier schlägt der Compiler Alarm mit der Meldung: f(int)is already defined in ...
                    public int  f(int wert){ .. }

        -Überschrieben: Überschriebene Methoden sind in Java exakt identisch, erst zur Laufzeit schaut der Compiler
                        welche Methode er jetzt nimmt
                        BPS:

                        public class Auto {
                             void fahren(int dauer){
                                System.out.println("Ich bin die Klasse: " + this.getClass().getSimpleName() +
                                " und fahre " +dauer+ " Stunden");
                             }
                        }

                        public class Audi extends Auto {
                            void fahren(int dauer){
                                System.out.println("Ich bin die Klasse: " + this.getClass().getSimpleName() +
                                " und fahre " +dauer+ " Stunden");
                            }
                        }

                        public class Main {
                            public static void main(String[] args) {
                                Auto auto = new Auto();
                                Audi audi = new Audi();
                                Auto polymorphie = new Audi();
                                audi.fahren(10);
                                auto.fahren(5);
                                polymorphie.fahren(100);
                            }
                        }

                        Lässt man jetzt das Main Programm laufen bekommt man die Ausgabe:
                        Ich bin die Klasse: Audi und fahre 10 Stunden
                        Ich bin die Klasse: Auto und fahre 5 Stunden
                        Ich bin die Klasse: Audi und fahre 100 Stunden


    c)
        Es wird A() ausgegeben

    d)
        Gar nichts, denn der Konstruktor kann nicht aufgerufen werden, da er ausserhalb der Klasse nicht sichtbar ist

    e)
        Sollte man das Programm starten wollen, erscheint ein Fehler. Das Problem ist, das der erste Aufruf im
        Konstruktor von B() super() ist, der Konstruktor von A aber nur einen Parameterbehafteten Konstruktor besitzt.
        super() erzeugt demnach die Fehlermeldung: There is no default constructor available in package.A .

        Beheben könnte man das ganze mit verschiedenen Ansätzen:

        Möglichkeit 1: Im Konstruktor in B einen expliziten super-call mit Paramatern  durchführen.
                       Z.B. super(34);

        Möglichkeit 2: Einen Default Konstruktor zu A hinzufügen , sodass der versteckte Aufruf super() wieder
                       funktioniert


    f)
        Ausgabe: A
                 A
                 C

        Begründung: Bei überdeckten Methoden interessiert ausschließlich der dynamische Typ(das ist der Rechte ;)).
                    Da die Klasse B keine Methode methode hat, wirddie vererbte von A genommen und somit ausgegeben.



    g)
        public class Figur {

            protected double flaeche;

            protected Figur() {

            }

            protected double getFlaeche() {
                return flaeche;
            }


        }

        public class Rechteck extends Figur {
            Rechteck(int breite, int hoehe) {
                flaeche = breite * hoehe;
            }
        }

    h)

        public class Figur {

            private double flaeche;

            protected Figur(double flaeche) {
                this.flaeche = flaeche;
            }

            protected double getFlaeche() {
                return flaeche;
            }
        }


        public class Rechteck extends Figur {

            Rechteck(int breite, int hoehe) {
                super(breite * hoehe);
            }
        }

    i)
        Jedglich ein Default-Konstruktr genügt um eine Figur ohne Fläche anzulegen
        Legt man nun eine Figur mit dem Default Konstruktor an greift der Default-Wert von
        Double.

        public class Figur {

            private double flaeche;

            protected Figur(){}

             protected Figur(double flaeche) {
                this.flaeche = flaeche;
            }

            protected double getFlaeche() {
                return flaeche;
            }
        }

    j)
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


    k)
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

    l)

        public class Lebewesen {

            public void bewegen(){

            }
        }

        public class Amoebe extends Lebewesen {

            public void bewegen(){
                System.out.println("Schleimen");
            }

        }

        public class Dackel extends Lebewesen {

            public void bewegen() {
                System.out.println("Auf kurzen Beinen vorwärts wackeln");
            }

            public void bellen() {
                System.out.println("Wau wau wau");
            }

        }

        public class TestLebewesen {

            public static void main(String[] args) {

                Lebewesen l1 = new Dackel();
                Lebewesen l2 = new Amoebe();

                l1.bewegen();
                l2.bewegen();

                if (l1 instanceof Dackel) {
                    ((Dackel) l1).bellen();
                }

            }
        }


    m)

    public class A {

        int methode(int k) {
            return 4;
        }
    }


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
*/




}
