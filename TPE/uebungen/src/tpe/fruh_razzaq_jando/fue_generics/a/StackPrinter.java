package tpe.fruh_razzaq_jando.fue_generics.a;

public class StackPrinter {
    public void printStack(SimpleStack<?> stack) {

        for (int i = stack.getSize(); i >= 0; i--) {
            System.out.printf("%d %s%n", i, stack.pop());
        }
    }
}
