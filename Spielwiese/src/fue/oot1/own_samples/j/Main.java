package fue.oot1.own_samples.j;

public class Main {

    public static void main(String[] args) {
        ZahlenAddierer za = new ZahlenAddierer();
        System.out.println(za.addition(1, 2));
        System.out.println(za.addition(1, 2, 3));
        System.out.println(za.addition(1, 2, 3, 4));
        System.out.println(za.addition(1, 2, 3, 4, 5));
    }

}
