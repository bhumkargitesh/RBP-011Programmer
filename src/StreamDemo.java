import java.util.ArrayList;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamDemo {
    public static void main(String[] args) {
        ArrayList<SchoolStudents> listStudents = new ArrayList<>();
        listStudents.add(new SchoolStudents("Deepak",1,60));
        listStudents.add(new SchoolStudents("Ravi",2,90));
        listStudents.add(new SchoolStudents("Sheetal",3,40));
        listStudents.add(new SchoolStudents("Abhishiek",4,72));
        listStudents.add(new SchoolStudents("Vishal",5,38));
        listStudents.add(new SchoolStudents("Shubham",6,82));
        listStudents.add(new SchoolStudents("Aman",7,20));
        listStudents.add(new SchoolStudents("Sourav",8,65));
        listStudents.add(new SchoolStudents("Aditya",9,45));
        listStudents.add(new SchoolStudents("Shivam",10,79));
        listStudents.forEach(i-> System.out.println(i));
        Map<Integer,SchoolStudents> s1 = listStudents.stream().collect(Collectors.toMap(p->p.rollNo, p->p ));

        System.out.println("Using map");
        for(Map.Entry<Integer,SchoolStudents> e : s1.entrySet()){
            System.out.println("Roll No :" +e.getKey()+ " Details  "+ e.getValue());
        }
        System.out.println("Using Stream :");
        listStudents.stream().filter(p->p.totalMarks>=40 &&p.totalMarks<=60).forEach(p -> System.out.println(p));
        System.out.println("Students above 50 marks");
        for(SchoolStudents i : listStudents){
            if(i.totalMarks > 50){
                System.out.println(i);
            }
        }
        System.out.println("Using old for loop");
        for (int i = 0 ; i< listStudents.size();i++){
            SchoolStudents a = listStudents.get(i);
            if(a.totalMarks >50){
                System.out.println(a);
            }
        }
    }
}
class SchoolStudents{
    String name;
    int rollNo;
    int totalMarks;

    SchoolStudents(String n, int r, int t){
        this.name = n;
        this.rollNo = r;
        this.totalMarks = t;
    }

    @Override
    public String toString() {
        return
                "name='" + name + '\'' +
                        ", rollNo=" + rollNo +
                        ", totalMarks=" + totalMarks;
    }
}

