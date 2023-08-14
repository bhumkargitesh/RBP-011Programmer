import java.util.ArrayList;
import java.util.HashMap;

public class Reservation {
    public static void main(String[] args) {
        Customer1 cc1 = new Customer1("git","24",78975555);
        Customer1 cc2 = new Customer1("gitesh","28",78975555);
        Customer1 cc3 = new Customer1("ganesh","32",78975555);
        Customer1 cc4 = new Customer1("aru","22",78975555);
        Customer1 cc5 = new Customer1("amar","27",78975555);
        ArrayList<Integer> Seats = new ArrayList<>();
        Seats.add(01);
        Seats.add(02);
        Seats.add(03);
        Seats.add(04);
        Seats.add(05);
        HashMap<Integer,Customer1> SeatAolltment = new HashMap<>();
        Reservation res = new Reservation();
        res.putCustomer1(01,Seats,SeatAolltment);
        System.out.println(SeatAolltment);
        res.putCustomer1(01,Seats,SeatAolltment);
    }
    public void putCustomer1(Integer seatNo,ArrayList r,HashMap<Integer,Customer1> h1){
        if (r.isEmpty()){
            System.out.println("all seat are booked");
        }
        if (r.contains(seatNo)){
            h1.put(seatNo, new Customer1("jon","36",252545));
            r.remove(seatNo);
        }else {
            System.out.println("seat is not book ");
        }

    }

}
class  Customer1{
    String name;
    String age;
    int mobileNo;

    public Customer1(String name, String age, int mobileNo) {
        this.name = name;
        this.age = age;
        this.mobileNo = mobileNo;
    }

    @Override
    public String toString() {
        return "Customer1{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", mobileNo=" + mobileNo +
                '}';
    }
}