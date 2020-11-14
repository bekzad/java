package Test9;

class Stack {
    private char[] a;
    private int index;

    Stack(int size) {
        a = new char[size];
        index = 0;
    }

    boolean push(char c) throws StackFullException {
        if (index == a.length) {
            throw new StackFullException(a.length);
        }

        a[index++] = c;
        return true;
    }

    char pop() throws StackEmptyException {

        if (isInRange(index - 1)) {
            return a[--index];
        }

        throw new StackEmptyException();
    }

    private boolean isInRange(int n) {
        if (n >= 0 && n < a.length) {
            return true;
        }
        return false;
    }
}

class StackDemo {
    public static void main(String args[]) {
        Stack stack = new Stack(7);

        try {
            stack.push('c');
            stack.push('b');
            System.out.println(stack.pop());
            stack.push('d');
//            stack.push('d');
//            stack.push('d');
//            stack.push('d');
            System.out.println(stack.pop());
            System.out.println(stack.pop());
            System.out.println(stack.pop());
        } catch (StackFullException | StackEmptyException e) {
            System.out.println(e);
        }
    }
}

