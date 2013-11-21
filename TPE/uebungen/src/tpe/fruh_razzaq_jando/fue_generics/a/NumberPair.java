package tpe.fruh_razzaq_jando.fue_generics.a;


public class NumberPair<T extends Number> extends Pair<T, T> {

    public NumberPair(T first, T second) {
        super(first, second);
    }
}
