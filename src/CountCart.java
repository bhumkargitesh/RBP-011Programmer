import java.util.ArrayList;
import java.util.HashMap;

public class CountCart {
    public static void main(String[] args) {

        Milk m1 =new Milk("chitale",30,"1L");
        Milk m2 = new Milk("Gokul",35,"1l");
        Milk m3 = new Milk("katraj",28,"1L");
        Milk m4 = new Milk("coco",25,"1L");
        ArrayList<Milk> l1 = new ArrayList<>();
        l1.add(m1);
        l1.add(m2);
        l1.add(m3);
        l1.add(m4);
        System.out.println(l1);
        System.out.println();
        HashMap<Integer,Milk> cart = new HashMap<>();
        cart.put(01,m2);
        cart.put(02,m3);

        System.out.println(cart);
        System.out.println();
        System.out.println("totalcartprice:" +(m2.price+m3.price));

    }

}
class Milk{
    String brandName;
    int price;
    String  liter;

    public Milk(String brandName, int price, String liter) {
        this.brandName = brandName;
        this.price = price;
        this.liter = liter;
    }

    @Override
    public String toString() {
        return "Milk{" +
                "brandName='" + brandName + '\'' +
                ", price='" + price + '\'' +
                ", liter=" + liter +
                '}';
    }
}