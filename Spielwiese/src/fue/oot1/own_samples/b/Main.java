package fue.oot1.own_samples.b;

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
