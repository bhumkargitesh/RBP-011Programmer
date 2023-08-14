import java.util.ArrayList;
import java.util.HashMap;

public class HotelManagement {
    public static void main(String[] args) {
        Customer c1 = new Customer("john","1234","xyz",2);
        Customer c2 = new Customer("john","1234","xyz",2);
        Customer c3 = new Customer("john","1234","xyz",2);
        Customer c4 = new Customer("john","1234","xyz",2);
        Customer c5 = new Customer("john","1234","xyz",2);
        ArrayList<Integer> rooms = new ArrayList<>();
        rooms.add(101);
        rooms.add(102);
        rooms.add(103);
        rooms.add(104);
        rooms.add(105);
        rooms.add(106);
        rooms.add(107);
        rooms.add(108);
        HashMap<Integer,Customer> roomAllotment = new HashMap<>();
        HotelManagement h1 = new HotelManagement();
        h1.putCustomer(101,rooms,roomAllotment);
        System.out.println(roomAllotment);
        h1.putCustomer(102,rooms,roomAllotment);
        System.out.println(roomAllotment);
        //HashMap<Integer,Customer> hm = new HashMap<>();
        //hm.put(101,new Customer(""));



    }

    public void putCustomer(Integer roomNo, ArrayList r, HashMap<Integer,Customer> h1) {
        if(r.isEmpty()){
            System.out.println("All room are full");
        }

        if(r.contains(roomNo)){
            h1.put(roomNo,new Customer("gitesh","1234","xyz",1));
            r.remove(roomNo);
        }
        else {
            System.out.println("Room is not empty");
        }


    }
}
class Customer{
    String name;
    String aadharId;
    String address;
    int noOfPeople;

    public Customer(String n,String a, String ad, int p){
        this.name = n;
        this.aadharId = a;
        this.address = ad;
        this.noOfPeople = p;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", aadharId='" + aadharId + '\'' +
                ", address='" + address + '\'' +
                ", noOfPeople=" + noOfPeople +
                '}';
    }
}

