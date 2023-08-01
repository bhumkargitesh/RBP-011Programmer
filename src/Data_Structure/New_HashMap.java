package Data_Structure;


import java.util.HashMap;

class Man{
    int srnumber;
    String name;
    String age;
    String hight;
    public  Man(int srnumber,String name,String age,String hight){
        this.srnumber=srnumber;
        this.name=name;
        this.age=age;
        this.hight=hight;
    }

    @Override
    public String toString() {
        return "man{" +
                "srnumber=" + srnumber +
                ", name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", hight='" + hight + '\'' +
                '}';
    }
}

public class New_HashMap {
    public static void main(String[] args) {
        HashMap<Integer, Man> manmap = new HashMap<>();
        //Create a Man object
        Man m1 = new Man(2, "gitesh", "28", "165");
        Man m2 = new Man(3, "sonal", "25", "160");
        Man m3 = new Man(1, "Akarsh", "24", "168");
        System.out.println(m1 + " ");
        System.out.println(m2+ " ");
        System.out.println(m3+ " ");

        System.out.println();

        manmap.put(m1.srnumber, m1);
        manmap.put(m2.srnumber, m2);
        manmap.put(m3.srnumber, m3);
        int mansrnumber = 2;
        Man man = manmap.get(mansrnumber);
        if (man != null) {
            System.out.println("Sr Number :" + man.srnumber);
            System.out.println("Man Name: " + man.name);
            System.out.println("Man Age:" + man.age);
            System.out.println("Man Hight:" + man.hight);
        } else {
            System.out.println("Man of srnumber:" + mansrnumber + "Not found");
        }
        System.out.println();

        //search...
        if (manmap.containsKey(1)) {
            System.out.println("key is present");
        } else {
            System.out.println("key is not present");
        }
            System.out.println();

        //display the size of hashmap
        manmap.size();
        System.out.println(manmap.size());

        //hashmap is empty or not

        manmap.isEmpty();
        System.out.println(manmap.isEmpty());

        //check the hashcode
        manmap.hashCode();
        System.out.println(manmap.hashCode());
        }

    }


