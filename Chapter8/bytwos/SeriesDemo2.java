package bytwos;
import interfaces.Series;
// Accessing objects through interface reference variable

public class SeriesDemo2 {
    public static void main(String args[]) {
        ByTwos byTwos = new ByTwos();
        ByThrees byThrees = new ByThrees();

        /* Here this Series interface variable has access only to
           those methods declared in it, so it doesn't have access for
           getprevious method declared in byTwos class only
         */
        Series ob;

        for(int i = 0; i < 5; i++) {
            ob = byTwos;
            System.out.println("Getting next of ByTwos: " + ob.getNext());

            ob = byThrees;
            System.out.println("Getting next of ByThrees: " + ob.getNext());
            System.out.println();
        }
        System.out.println();
    }
}
