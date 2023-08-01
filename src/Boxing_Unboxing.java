public class Boxing_Unboxing {
    public static void main(String[] args) {
        int x = 10;
        int y = 40;
        int z = 70;
        //Boxing { primitive data type is converted into object}
        Integer a = x;
        System.out.println(a);
        Integer b = y;
        System.out.println(b);
        Integer c = z;
        System.out.println(c);
       // Unboxing {object type is converted into primitive data type}
        int a1 = a;
        System.out.println(a1);
        int b2 = b;
        System.out.println(b2);
        int c2 = c;
        System.out.println(c2);

    }
}
