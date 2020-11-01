package bookpack;

public class BookDemo {
    public static void main(String args[]) {
        Book books[] = new Book[3];

        books[0] = new Book("Ride with the wind", "Someone", 1969);
        books[1] = new Book("War and peace", "Leo Tolstoy", 1700);
        books[2] = new Book("Book", "Someone", 1478);

        for (int i = 0; i < books.length; i++) {
            books[i].show();
        }

    }
}
