
// Assignment 15-7-23 "Write 10 classes and create 5 objects of each class, some parameterized some non parameterized and practice upcasting and down-casting"
public class AssignmentPractice_15_7_2023 {

        public static void main(String[] args) {
            Stud s = new Stud("Gitesh","Bhumkar", 1);
            Stud s1 = new Stud("Ganesh","Bhumkar", 5);
            Stud s2 = new Stud("Arundhati","Bhumkar", 11);
            Stud s3 = new Stud("Amar","Patil", 3);
            Stud s4 = new Stud("Rohit","Mahajan", 4);

              Emp emp1 = new Emp("Gitesh","Bhumkar",125);
              Emp emp2 = new Emp("Ganesh","Bhumkar",112);
              Emp emp3 = new Emp("Aru","Bhumkar",366);

               Samsung  sam = new Samsung("Samsung galaxy a50","White",16500);
               Samsung  sam1 = new Samsung("Samsung galaxy a51"," Black",22100);
               Samsung  sam2 = new Samsung("Samsung galaxy A50 plus","White",25500);


                FourWheeler car = new FourWheeler("MahindraXuv700","White",1900000);
                FourWheeler car1 = new FourWheeler("MahindraTUV500","White",1100000);
               FourWheeler car2 = new FourWheeler("TATA Safari","Black",2200000);

               Notebook nb = new Notebook("Winner",80,180);
               Notebook nb1 = new Notebook("Sundram",70,180);
               Notebook nb2 = new Notebook("Rough",40,200);


                 Pen p = new Pen("fine grip","cello","Blue",10);
                 Pen p1 = new Pen("fine","cello","Blue",10);
                  Pen p2 = new Pen("lexi","cello","Black",10);



            Laptop l1=new Laptop("81WQ00NMQIN","Lenovo IdeaPad","Black",31000);
            EarBud e2=new EarBud("Cell Phone","In-ear","Boat");
            SmartWatches sw = new SmartWatches("Ultra Series 8",1,50,"Multicolour","Android and IOS");
            BlueTooth b2=new BlueTooth("YESTRONICS ET max Bluetooth","ABS Plastic","Wireless","Audio Player",1);


            System.out.println(s);
            System.out.println(s1);
            System.out.println(s2);
            System.out.println(s3);
            System.out.println(s4);

              System.out.println(emp1);
              System.out.println(emp2);
              System.out.println(emp3);

              System.out.println(sam);
              System.out.println(sam1);
              System.out.println(sam2);

              System.out.println(car);
              System.out.println(car1);
              System.out.println(car2);

              System.out.println(nb);
              System.out.println(nb1);
              System.out.println(nb2);

              System.out.println(p);
              System.out.println(p1);
               System.out.println(p2);


            System.out.println(l1);
            System.out.println(e2);
            System.out.println(sw);
            System.out.println(b2);


        }
    }
    class Stud{
        String firstName ;
        String lastName ;
        int rollNo ;

        Stud(String f, String l,int r ){                       //PARAMETERIZE CONSTRUCTOR
            firstName = f;
            lastName = l;
            rollNo = r;
        }

        @Override                                       //TO DISPLAY SYSTEMATIC OUTPUT
        public String toString() {
            return "First Name : "+firstName + "\nLastName : "+ lastName+ "\nRoll No : " + rollNo;
        }
    }
    class Emp {
        String firstName;
        String lastName;
        int ID;

        Emp(String fn, String ln, int id) {                       //PARAMETERIZE CONSTRUCTOR
            firstName = fn;
            lastName = ln;
            ID = id;
        }

        @Override                                       //TO DISPLAY SYSTEMATIC OUTPUT
        public String toString() {
            return "First Name : " + firstName + "\n  LastName : " + lastName + "\n id : " + ID;

        }
    }
    class  Samsung{
        String ModelName;
        String colour;
        int price;

        Samsung(String MN, String c, int p) {                       //PARAMETERIZE CONSTRUCTOR
            ModelName = MN;
            colour = c;
            price= p;
        }

        @Override                                       //TO DISPLAY SYSTEMATIC OUTPUT
        public String toString() {
            return "ModelName : " + ModelName + "\n Colour : " + colour + "\n Price : " + price;

        }

    }

    class FourWheeler {
        String BrandName;
        String colour;
        int price;

        FourWheeler(String bn, String c, int p) {                       //PARAMETERIZE CONSTRUCTOR
            BrandName = bn;
            colour = c;
            price= p;
        }

        @Override                                       //TO DISPLAY SYSTEMATIC OUTPUT
        public String toString() {
            return "BrandName : " + BrandName + "\nColour : " + colour + "\n Price : " + price;

        }

    }

    class Notebook {
        String Name;
        int price;
        int pages;

        Notebook(String N,  int pr,int p) {                       //PARAMETERIZE CONSTRUCTOR
            Name=N;
            price= pr;
            pages = p;
        }

        @Override                                       //TO DISPLAY SYSTEMATIC OUTPUT
        public String toString() {
            return "Name : " + Name + " \n  Price : " + price +"\n pages: "+pages;

        }

    }

    class Pen{
        String PenName;
        String brand;
        String inkcolour;
        int  price;

        Pen(String pn, String b, String ink,int p) {                       //PARAMETERIZE CONSTRUCTOR
            PenName = pn;
            brand = b;
            inkcolour = ink;
            price = p;
        }

        @Override                                       //TO DISPLAY SYSTEMATIC OUTPUT
        public String toString() {
            return "PenName : " +PenName + "\n Brand : " + brand + "\n inkcolour : " + inkcolour +"\n price: "+ price;

        }

    }
        class Laptop{
        String styleName ;
        String patternName ;
        String colour ;
        int price;

        Laptop(String sN, String pN,String c,int p ){                       //PARAMETERIZE CONSTRUCTOR
            styleName = sN;
            patternName = pN;
            colour = c;
            price=p;
        }

        @Override                                       //TO DISPLAY SYSTEMATIC OUTPUT
        public String toString() {
            return "StyleName : "+styleName + "\nPatternName : "+patternName + "\nColour : " + colour+"\n Price: "+ price;
        }
    }

    class EarBud{
        String use ;
        String form ;
        String brand ;

        EarBud(String u, String f,String b){                       //PARAMETERIZE CONSTRUCTOR
            use= u;
            form= f;
            brand= b;
        }

        @Override                                       //TO DISPLAY SYSTEMATIC OUTPUT
        public String toString() {
            return "Use : "+use + "\nForm : "+ form+ "\nBrand  : " + brand;
        }
    }

    class SmartWatches{
        String name;
        int batteryChargeTime ;
        int batteryLife ;
        String colour ;
        String compatibleOS;

        SmartWatches(String n,int bCT,int bL, String cl,String co){                       //PARAMETERIZE CONSTRUCTOR
            name= n;
            batteryChargeTime= bCT;
            batteryLife= bL;
            colour=cl;
            compatibleOS=co;
        }

        @Override                                       //TO DISPLAY SYSTEMATIC OUTPUT
        public String toString() {
            return "Name : "+name + "\nBatteryChargeTime : "+ batteryChargeTime+ "\nBatteryLife  : " + batteryLife+ "\nColour: "+colour+ "\nComparableOS : "+compatibleOS;
        }
    }

    class BlueTooth {
        String name;
        String material;
        String type;
        String compatibility;
        int netQuality;


        BlueTooth(String n, String m, String t, String c, int nQ) {                       //PARAMETERIZE CONSTRUCTOR
            name = n;
            material = m;
            type = t;
            compatibility = c;
            netQuality = nQ;
        }

        @Override                                       //TO DISPLAY SYSTEMATIC OUTPUT
        public String toString() {
            return "Name : " + name + "\nMaterial : " + material + "\nType  : " + type + "\nCompatibility: " + compatibility + "\nNetQuality : " + netQuality;
        }
    }

