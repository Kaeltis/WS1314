package tpe.fruh_razzq_jando.fue1.taschenRechner;
/**
 * @author: Max Jando
 * Date: 29.09.13
 * Time: 09:50
 * Diese Klasse symbolisiert einen Taschenrechner. Gültige Operatoren sind +,-,*,/
 */
public class Taschenrechner {

    public static void main(String[] args) {
        Taschenrechner t = new Taschenrechner();
        System.out.println(t.rechne(3, 5, '+'));
        System.out.println(t.rechne(8, 6, '-'));
        System.out.println(t.rechne(3, 3, '*'));
        System.out.println(t.rechne(20, 10, '/'));
    }

    private double rechne(double ersterSummand, double zweiterSummand, char operator) {
        double ergebnis;
        switch (operator) {
            case '+':
                ergebnis = ersterSummand + zweiterSummand;
                break;
            case '-':
                ergebnis = ersterSummand - zweiterSummand;
                break;
            case '*':
                ergebnis = ersterSummand * zweiterSummand;
                break;
            case '/':
                ergebnis = ersterSummand / zweiterSummand;
                break;
            default:
                ergebnis = Double.NaN;
        }
        return ergebnis;
    }

}
