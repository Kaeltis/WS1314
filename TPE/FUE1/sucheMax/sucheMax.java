package suchemax;

/**
 * @author Max Jando
 *         Klasse welche ein int-Array ubergeben bekommt und die grote Zahl aus diesem heraussucht und zuruckgibt
 */
public class SucheMax {

    public static void main(String[] args) {

        int[] zahlenArray = generiereZufallsArray();
        gebeArrayAus(zahlenArray);
        ermittleGroessteZahl(zahlenArray);


    }

    private static void ermittleGroessteZahl(int[] zahlenArray) {
        int groessteZahl = zahlenArray[0];
        for (int zahlenStelle = 1; zahlenStelle < zahlenArray.length; zahlenStelle++) {
            groessteZahl = (zahlenArray[zahlenStelle] > groessteZahl) ? zahlenArray[zahlenStelle] : groessteZahl;
        }
        System.out.println("Die goresste Zahl im Array ist demnach: " + groessteZahl);
    }

    private static int[] generiereZufallsArray() {
        int arrayGroeße = (int) (Math.random() * 29 + 1);
        int[] zahlenArray = new int[arrayGroeße];

        //Schleife durchläuft ein Int-Array um es mit Zahlen zu füllen
        for (int zahlenStelle = 0; zahlenStelle < zahlenArray.length; zahlenStelle++) {
            zahlenArray[zahlenStelle] = (int) (Math.random() * 499 + 1);
        }
        return zahlenArray;
    }

    private static void gebeArrayAus(int[] array) {
        for (int stelle : array) {
            System.out.print(" " + stelle);
        }
        System.out.println("\n");
    }

}
