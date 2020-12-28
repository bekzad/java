package Test13;

class Stack<T> implements IGenStack<T>{
    private T[] a;
    private int index;

    Stack(T a[]) {
        this.a = a;
        index = 0;
    }

    public void push(T o) throws StackFullException {
        if (index >= a.length) {
            throw new StackFullException(a.length);
        }
        a[index++] = o;
    }

    public T pop() throws StackEmptyException {
        index--;
        if (index < 0) {
            throw new StackEmptyException();
        }
        return a[index];
    }

}

class StackDemo {
    public static void main(String args[]) {
        Character[] a = new Character[7];
        Stack<Character> stack = new Stack<>(a);
        char c;
        try {
            for (int i = 0; i < 8; i++) {
                c = (char) ('a' + i);
                System.out.println("Putting " + c);
                stack.push(c);
            }
        } catch (StackFullException e) {
            System.out.println(e);
        }

        try {
            for (int i = 0; i < 8; i++) {
                System.out.println(stack.pop());
            }
        } catch (StackEmptyException e) {
            System.out.println(e);
        }
    }
}

