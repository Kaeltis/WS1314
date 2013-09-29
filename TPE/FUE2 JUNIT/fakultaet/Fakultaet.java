public class Fakultaet {
    /**
     * Berechnet die Fakultat fuer die gegebene Zahl.
     *
     * @param n Zahl fur die die Fakultat berechnet werden soll.
     * @return die Fakultat
     */
    public int fact(int n) {
        return (n == 0) ? 1 : n * fact(n - 1);
    }
}