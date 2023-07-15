public class WrapperClass {
    public static void main(String[] args) {
        int a = 10;
        Integer b = 40;
        //upcasting -is not explicit
        double Z = a;
        //downcasting - it should be explicit
        double t = 11.8;
        String s1 = "120";
        String s2 = "145";
        int h = Integer.parseInt(s1);
        System.out.println(h);
        int d = (int) t;
        System.out.println(d);
        int g = Integer.parseInt(s2);
        System.out.println(g);
        double z1 = g;
        System.out.println(z1);
        double d1 = b;
        System.out.println(d1);
    }
}