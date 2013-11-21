package tpe.fruh_razzaq_jando.fue_generics.a;

public class SimpleStack<T> {
    private T[] stack;
    private int pos;

    @SuppressWarnings("unchecked")
    public SimpleStack(int size) {
        stack = (T[]) new Object[size];
        pos = 0;
    }

    public void push(T o) {
        stack[pos++] = o;
    }

    public T pop() {
        return stack[--pos];
    }

    public int getSize() {
        return pos - 1;
    }


}