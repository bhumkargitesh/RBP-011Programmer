import java.util.LinkedList;
public class CollectionDemo2 {
    public static void main(String[] args) {

        LinkedList<HotelRoom> l1 = new LinkedList<>();
       // HashMap<Integer,HotelRoom> hmap = new HashMap<>();
     //   hmap.put(101,new HotelRoom(101,"gitesh"))



        l1.add(new HotelRoom(101,"gitesh","8444542277","M", "pune","yes","1500"));
        l1.add(new HotelRoom(102,"arun","9944542277","M", "mumbai","yes","1800"));
        l1.add(new HotelRoom(103,"akash","8844542277","M", "latur","yes","2700"));
        l1.add(new HotelRoom(104,"gita","7774542277","F", "solapur","no","2500"));
        l1.add(new HotelRoom(105,"ganesh","8004542277","M", "nashik","yes","900"));
        l1.add(new HotelRoom(106,"gitesh","8414542277","M", "lonavala","yes","12000"));
        l1.add(new HotelRoom(107,"rahul","8440542277","M", "satara","no","2100"));
        l1.add(new HotelRoom(108,"sonal","8441212277","F", "pune","yes","1200"));
        l1.add(new HotelRoom(109,"Akarsh","7044542277","M", "mumbai","no","1210"));
        l1.add(new HotelRoom(110,"Akanksha","9844542277","F", "pune","yes","1100"));
        l1.add(new HotelRoom(111,"Aish","9994542277","F", "pune","no","1000"));


        for(HotelRoom h : l1) {
            System.out.println(h);
        }
        //lamda expression for for-each
        //all room booking Status  yes/no(available)
        System.out.println("all room Status ");
        l1.forEach(H -> System.out.println(H.book));
        System.out.println();
        System.out.println("Display Booked Room ");
        l1.stream().filter(h ->h.book.equals("yes")).forEach(h->System.out.println("Booked Room Number and Status:" +h.roomNo+ " " +h.book));
        System.out.println();
        System.out.println("Display Available Room ");
        l1.stream().filter(h->h.book.equals("no")).forEach(h-> System.out.println( "Available Room Number and Status:"    +h.roomNo+ " "  +h.book));
    }
}
class HotelRoom {
    int roomNo;

    String name;
    String mobileno;
    String gender;
    String address;
    String book;
    String prise;

    public HotelRoom(int roomNo, String name, String mobileno, String gender, String address, String book, String prise) {
        this.roomNo = roomNo;
        this.name = name;
        this.mobileno = mobileno;
        this.gender = gender;
        this.address = address;
        this.book = book;
        this.prise = prise;
    }

    @Override
    public String toString() {
        return "HotelRoom{" +
                "roomNo=" + roomNo +
                ", name='" + name + '\'' +
                ", mobileno='" + mobileno + '\'' +
                ", Gander='" + gender + '\'' +
                ", address='" + address + '\'' +
                ", book='" + book + '\'' +
                ", prise='" + prise + '\'' +
                '}';
    }
}


