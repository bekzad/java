package Test;

class Stack {
    private char[] a;
    private int index;

    Stack(int size) {
        a = new char[size];
        index = 0;
    }

    boolean push(char c) {
        if (index == a.length) {
            System.out.println("Stack is full!");
            return false;
        }

        a[index++] = c;
        return true;
    }

    char pop() {

        if (isInRange(index - 1)) {
            return a[--index];
        }

        System.out.println("Stack is empty!");
        return (char) 0;
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
        Stack stack = new Stack(4);

        stack.push('c');
        stack.push('b');

        System.out.println(stack.pop());
        stack.push('d');
        stack.push('d');
        stack.push('d');
        stack.push('d');

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());

    }
}

