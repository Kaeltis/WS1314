package tpe.fruh_razzaq_jando.pue3;


import java.util.Iterator;

public class ListImpl<T> implements List<T> {

    private T root;
    private T next;

    public ListImpl() {
        root = null;
    }

    @Override
    public boolean contains(Object e) {
        return this.contains(e);
    }

    @Override
    public boolean add(T e) {
        return this.add(e);
    }

    @Override
    public void addFirst(T element) {
        root = element;
    }

    @Override
    public T peekFirst() {
        return root;
    }

    @Override
    public boolean isEmpty() {
        return root != null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public T pollFirst() {
        return null;
    }

    @Override
    public void clear() {
        this.root = null;
    }

    @Override
    public Iterator<T> iterator() {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }
}
