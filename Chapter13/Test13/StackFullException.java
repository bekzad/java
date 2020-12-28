package Test13;

public class StackFullException extends Exception {

    private int size;
    StackFullException(int size) {
        this.size = size;
    }

    public String toString() {
        return "Stack is full. Maximum size is: " + size;
    }
}
