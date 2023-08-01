//public class Multilevel_Inheritance_Demo {
//    public static void main(String[] args) {
//        Persons p = new Persons();
//        Emp ep1 = new Emp();
//        FullTimeEmp fte2 = new FullTimeEmp();
//        p.setPerson("gitesh", "latur");
//        ep1.setEmp("ganesh", "bidar", "E555", "software development");
//        fte2.setFullTimeEmp("arundhati", "pune", "E143", "software testing", 40000);
//        p.printPerson();
//        ep1.printEmp();
//        fte2.printFullTimeEmp();
//    }
//}
//
//
//class Person{
//    private String name;
//    private String address;
//    public void setPerson(String name, String address){
//        this.name = name;
//        this.address = address;
//    }
//    public void printPerson(){
//        System.out.println("Persion name:" +name);
//        System.out.println("Persion adress:"  +address);
//    }
//}
//class Emp extends Persons {
//    private String empId;
//    private String department;
//    public void setEmp(String name, String address, String empId,String department){
//        setPerson(name,address);
//        this.empId=empId;
//        this.department=department;
//    }
//    public void printEmp(){
//        printPerson();
//        System.out.println("Employee empid:" +empId);
//        System.out.println("Employee Department:" +department);
//    }
//}
//class FullTimeEmp extends Emp{
//    private double salary;
//    public void setFullTimeEmp(String name, String address, String empId,String department,double salary){
//        setEmp(name,address,empId,department);
//        this.salary=salary;
//    }
//    public void printFullTimeEmp(){
//        printEmp();
//        System.out.println("Full time employee:" +salary);
//
//    }
//}
//
//
