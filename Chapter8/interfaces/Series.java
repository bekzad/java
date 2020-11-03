package interfaces;
/*
   Variables in an interface are public final static
   and must be initialized, thus they are essentially constants
 */
public interface Series {

    int getNext(); // The methods are implicitly public
    void reset();
    void setStart(int x);

    /* Default method usage
        1. It gives you a way to gracefully add new methods over time
         without breaking existing code
        2. It provides optional functionality without requiring a class
        to provide placeholder implementation when that method is not used
     */
    default int[] getNextArray(int n) {
        return getArray(n);
    }

    default int[] skipAndGetNextArray(int skip, int n) {
        getArray(skip);
        return getArray(n);
    }

    // You can create a private method in an interface with JDK9
    private int[] getArray(int n) {
        int[] vals = new int[n];
        for(int i =0; i < n; i++) {
            vals[i] = getNext();
        }
        return vals;
    }
}
