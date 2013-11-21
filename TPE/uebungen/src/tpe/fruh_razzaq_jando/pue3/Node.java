package tpe.fruh_razzaq_jando.pue3;


import java.util.ArrayList;

public class Node<T> {

    private String name;
    private Node<T> daten;
    private ArrayList<Node<T>> kinder;

    public Node(String name, Node<T> daten, ArrayList<Node<T>> kinder) {
        this.name = name;
        this.daten = daten;
        this.kinder = kinder;
    }

    public void addChild(Node<T> kind) {
        this.kinder.add(kind);
    }

    public String getName() {
        return this.name;
    }

    public Node<T> getValue() {
        return daten;
    }

    public ArrayList<Node<T>> getChildren() {
        return kinder;
    }

}
