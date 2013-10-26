package fue.oot1.own_samples.a;

public class A {
    int wert = 5;

    public static void main(String[] args) {
        f(100);
    }

    public static void f(int wert) {
        //Hier würde nun 100 ausgegeben werden, da wer überdeckt wird.
        System.out.println(wert);
        B b = new B();
        b.f(2);
        b.f(2, 3);
        b.f(2, 3, 4);
    }
}