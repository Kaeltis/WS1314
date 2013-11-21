package tpe.fruh_razzaq_jando.pue3;


import java.util.ArrayList;

public interface SearchStrategy<T> {

    public abstract ArrayList<Node<T>> search (T searchObject, Suchverfahren verfahren);

    public abstract ArrayList<Node<T>> getPath (Suchverfahren verfahren);

}
