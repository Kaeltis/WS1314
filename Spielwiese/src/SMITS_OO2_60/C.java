package SMITS_OO2_60;

public class C {
    void method(A a) {
        System.out.println(a.wert);
    }

    public static void main(String[] args) {

        new C().method(new B());
    }
}

