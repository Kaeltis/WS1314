package fue.oot1.own_samples.k;

public class Main {

    public static void main(String[] args) {
        ZahlenAddierer za = new ZahlenAddierer();
        System.out.println(za.zahlenAddieren(1, 2, 3));
        System.out.println(za.zahlenAddieren(1, 2, 3, 4));
        System.out.println(za.zahlenAddieren(1, 2, 3, 4, 5));
        System.out.println(za.zahlenAddieren(1, 2, 3, 4, 5, 6));


    }

}
