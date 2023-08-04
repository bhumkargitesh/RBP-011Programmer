
import java.util.LinkedList;

    public class CollectionDemo {
        public static void main(String[] args) {
            LinkedList<PersonCollectionDemo> l1 = new LinkedList<>();

            l1.add(new PersonCollectionDemo("jhon","21","Bussinessman","Paris"));
            l1.add(new PersonCollectionDemo("jason","21","Bussinessman","london"));
            l1.add(new PersonCollectionDemo("jacob","21","Bussinessman","tokyo"));
            l1.add(new PersonCollectionDemo("johnson","21","Bussinessman","sydney"));
            l1.add(new PersonCollectionDemo("johnnycake","21","Bussinessman","Berlin"));
            l1.add(new PersonCollectionDemo("Harry","21","Bussinessman","Madrid"));
            l1.add(new PersonCollectionDemo("Homer","21","Bussinessman","venice"));
            l1.add(new PersonCollectionDemo("Ram","21","Bussinessman","Delhi"));
            l1.add(new PersonCollectionDemo("Shyam","21","Bussinessman","mumbai"));
            l1.add(new PersonCollectionDemo("hari","21","Bussinessman","kolkata"));
            //this is the for-each statement
            for(PersonCollectionDemo p : l1){
                System.out.println(p);
            }
            for (PersonCollectionDemo p :l1){
                System.out.println(p);
            }
            //lamda expression for for-each
            l1.forEach(p -> System.out.println(p.name));
//        Stream s1 = l1.stream();
//        s1.forEach(p -> System.out.println(p));
//        s1.forEach(p -> System.out.println(p));
            //stream api
            l1.stream().forEach(p-> System.out.println(p));
            //new stream object is created

            l1.stream().forEach(p-> System.out.println(p));
            System.out.println();
            l1.stream().forEach(p-> System.out.println(p.age) );

        }
    }
    class PersonCollectionDemo{
        String name;
        String age;
        String occupation;
        String address;

        public PersonCollectionDemo(String n,String a, String o, String ad){
            this.name = n;
            this.age = a;
            this.occupation=o;
            this.address = ad;
        }

        @Override
        public String toString() {
            return
                    "name='" + name + '\'' +
                            ", age='" + age + '\'' +
                            ", occupation='" + occupation + '\'' +
                            ", address='" + address + '\'' ;
        }
    }




