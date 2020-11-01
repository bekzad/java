package series;

public interface Series {
    int getNext(); // The methods are implicitly public
    void reset();
    void setStart(int x);
}
