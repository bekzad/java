package bookpacknext;
// Demonstration of protected members
// Subclasses from different packages can access protected views

class ExtBook extends bookpack.Book {
    private String publisher;

    public ExtBook(String t, String a, int d, String p) {
        super(t, a, d);
        publisher = p;
    }

    public void show() {
        super.show();
        System.out.println(publisher);
        System.out.println();
    }

    public String getPublisher() { return publisher; }
    public void setPublisher(String p) { publisher = p; }

    // These are ok because subclass can access a protected member
    public String getTitle() { return title; }
    public void setTitle(String t) { title = t; }
    public String getAuthor() { return author; }
    public void setAuthor(String a) { author = a; }
    public int getPubDate() { return pubDate; }
    public void setPubDate(int d) { pubDate = d; }

}

public class ProtectDemo {
    public static void main(String args[]) {
        ExtBook books[] = new ExtBook[3];

        books[0] = new ExtBook("Ride with the wind", "Someone", 1969, "Eton");
        books[1] = new ExtBook("War and peace", "Leo Tolstoy", 1700, "HBR");
        books[2] = new ExtBook("Book", "Someone", 1478, "Pearson");

        for (int i = 0; i < books.length; i++) {
            books[i].show();
        }

        System.out.println(books[0].getTitle());

        // Cannot access protected field by non-subclass
//        books[0].title = "Hello world";
    }
}
