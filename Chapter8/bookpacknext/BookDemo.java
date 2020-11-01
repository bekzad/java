package bookpacknext;

public class BookDemo {
    public static void main(String args[]) {
        bookpack.Book books[] = new bookpack.Book[3];

        books[0] = new bookpack.Book("Ride with the wind", "Someone", 1969);
        books[1] = new bookpack.Book("War and peace", "Leo Tolstoy", 1700);
        books[2] = new bookpack.Book("Book", "Someone", 1478);

        for (int i = 0; i < books.length; i++) {
            books[i].show();
        }
    }
}