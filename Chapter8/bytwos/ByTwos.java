package bytwos;

public class ByTwos implements series.Series {
    private int start;
    private int val;
    private int prev;

    ByTwos() {
        start = 0;
        val = 0;
        prev = -2;
    }

    public int getNext() {
        prev = val;
        val += 2;
        return val;
    }

    public void reset() {
        val = start;
        prev = start - 2;
    }

    public void setStart(int x) {
        start = x;
        val = x;
        prev = x - 2;
    }

    // Own method not from an interface
    public int getPrevious() {
        return prev;
    }
}
