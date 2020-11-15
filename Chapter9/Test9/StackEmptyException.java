package Test9;

public class StackEmptyException extends Exception {
    StackEmptyException() {
        super("Stack is empty.");
    }
//    @Override
//    public String toString() {
//        return "Stack is empty.";
//    }
}
