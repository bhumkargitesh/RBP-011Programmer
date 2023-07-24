public class SuperDemo {
    public static void main(String[] args) {
        Derived d1 =new Derived();
        d1.printIJ();

    }
}
class Base {
    protected int i; //instance variable

    //constractor
    Base() {
        i = 10;
    }

     public void printI() {
        System.out.println(i);
    }
}
class Derived extends Base{
    private int j;
    Derived(){
       super.i = 20;
       this.j=30;
    }
    public void printIJ(){
        super.printI();
        System.out.println(j);
    }
}





