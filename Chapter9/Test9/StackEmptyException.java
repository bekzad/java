package Test9;

public class StackEmptyException extends Exception {
    @Override
    public String toString() {
        return "Stack is empty.";
    }
}
