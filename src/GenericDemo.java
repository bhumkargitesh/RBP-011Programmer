import java.util.HashMap;
    public class GenericDemo {
        public static void main(String[] args) {
            HashMap< Integer,String > l1 = new HashMap<>();
            HashMap<Integer,String > l2 = new HashMap<>();
            l1.put(40124,"Math");
            l1.put(45284,"Physics");
            System.out.println(l1);
            System.out.println();
            l2.put(14254,"Analog Communication");
            l2.put(44432,"Computer architecture");
            System.out.println(l2);
        }
    }
