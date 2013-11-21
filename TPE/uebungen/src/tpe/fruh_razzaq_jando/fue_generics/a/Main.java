package tpe.fruh_razzaq_jando.fue_generics.a;

/**
 *
 */
public class Main {

    public static void main(String[] args) {

        SimpleStack<String> stack = new SimpleStack<String>(10);

        stack.push("!");
        stack.push("World");
        stack.push("Hello");

        SimpleStack<Integer> stackInteger = new SimpleStack<Integer>(5);
        stackInteger.push(5);
        stackInteger.push(4);
        stackInteger.push(3);

        StackPrinter printer = new StackPrinter();
        printer.printStack(stack);
        printer.printStack(stackInteger);
        SimpleStack<?> wildcard1 = new SimpleStack<String>(10);
    }
}
