import java.util.ArrayList;
import java.util.HashMap;

public class TotalBookPrice {
        public static void main(String[] args) {
            HashMap<Integer, Book1> h1 = new HashMap<>();
            Book1 b1 = new Book1("ShivKhera", "YouCanWin", "Bloomsbury", "Motivation", 399);
            Book1 b2 = new Book1("NapoleanHill", "ThinkAndGrowRich", "Manjul", "Motivation", 499);
            Book1 b3 = new Book1("ChetanBhagat", "HalfGirlfriend", "Abc", "LoveStory", 299);
            Book1 b4 = new Book1("Sam", "LetsGo", "Bloomsbury", "Motivation", 249);
            Book1 b5 = new Book1("JNehru", "TheDiscoveryOfIndia", "PQR", "Biography", 399);
            Book1 b6 = new Book1("Robert", "Monster", "Manjul", "Horror", 599);
            Book1 b7 = new Book1("ShivKhera", "YesYouCanWin", "Bloomsbury", "Motivation", 399);
            Book1 b8 = new Book1("NapoleanHill", "ThinkAndGrowRich", "Manjul", "Motivation", 499);
            Book1 b9 = new Book1("ChetanBhagat", "HalfGirlfriend", "Abc", "LoveStory", 299);
            Book1 b10 = new Book1("AbhilashDutt","Bhavisyat", "Samdarshi", "SciFi", 199);

            ArrayList<Book1> bk = new ArrayList<>();
            bk.add(b1);
            bk.add(b2);
            bk.add(b3);
            bk.add(b4);
            bk.add(b5);
            bk.add(b6);
            bk.add(b7);
            bk.add(b8);
            bk.add(b9);
            bk.add(b10);

            System.out.println(bk);

            ArrayList<Book1> cart = new ArrayList<>();
            cart.add(b1);
            cart.add(b2);
            cart.add(b3);



//        HashMap<Integer,Book1> cart = new HashMap<>();
//        cart.put(01,b1);
//        cart.put(02,b2);
//        cart.put(03,b3);

            System.out.println("The following books have been added to your cart");
            System.out.println(cart);

            System.out.println("Your final cart value is");
            System.out.println(" Total Price :" + (b1.Price+b2.Price+ b3.Price));

        }
    }


    class Book1 {
        String authorName;
        String bookName;
        String publication;
        String genre;
        int Price;

        Book1(String an, String bn, String pub, String gen, int pr) {
            this.authorName = an;
            this.bookName = bn;
            this.publication = pub;
            this.genre = gen;
            this.Price = pr;

        }

        @Override
        public String toString() {
            return "Book{" +
                    "authorName='" + authorName + '\'' +
                    ", bookName='" + bookName + '\'' +
                    ", publication='" + publication + '\'' +
                    ", genre='" + genre + '\'' +
                    ", Price=" + Price +
                    '}';
        }
    }


