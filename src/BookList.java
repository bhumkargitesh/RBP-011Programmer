import java.util.ArrayList;
import java.util.List;

public class BookList {
    public static void main(String[] args) {
        List<Book> cart = new ArrayList<>();

        // Adding books to the list
        cart.add(new Book("Author1", "abc1", "Genre1", 22, "Publication1"));
        cart.add(new Book("Author2", "abc2", "Genre2", 24, "Publication2"));
        cart.add(new Book("Author3", "abc3", "Genre3", 18, "Publication3"));
        cart.add(new Book("Author4", "abc4", "Genre4", 20, "Publication4"));
        cart.add(new Book("Author5", "abc5", "Genre5", 10, "Publication5"));
        cart.add(new Book("Author6", "abc6", "Genre6", 39, "Publication6"));
        cart.add(new Book("Author7", "abc7", "Genre7", 11, "Publication7"));
        cart.add(new Book("Author8", "abc8", "Genre8", 55, "Publication8"));
        cart.add(new Book("Author9", "abc9", "Genre9", 99, "Publication9"));
        cart.add(new Book("Author10", "abc10", "Genre10", 54, "Publication10"));

        cart.forEach(p -> System.out.println(p));
        System.out.println();

           // Printing the details of each book
//            for (Book book: cart) {
//            System.out.println("Author: " + book.authorName);
//            System.out.println("Book Name: " + book.bookName);
//            System.out.println("Genre: " + book.genre);
//            System.out.println("Price: $" + book.price);
//            System.out.println("Publication: " + book.publication);
              System.out.println();

            // Calculating the total price of the cart
            int totalCartPrice = 0;
            for (Book b : cart) {
                totalCartPrice += b.price;
            }
            System.out.println("Total price of the cart: " + totalCartPrice);
        System.out.println();
        }




    }





class Book{
    String authorName;
    String bookName;
    String genre;
    int price;
    String publication;

    public Book(String authorName, String bookName, String genre, int price, String publication) {
        this.authorName = authorName;
        this.bookName = bookName;
        this.genre = genre;
        this.price = price;
        this.publication = publication;
    }

    @Override
    public String toString() {
        return "Book{" +
                "authorName='" + authorName + '\'' +
                ", bookName='" + bookName + '\'' +
                ", genre='" + genre + '\'' +
                ", price=" + price +
                ", publication='" + publication + '\'' +
                '}';
    }
}
