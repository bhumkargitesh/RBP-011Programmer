//Single Inheritance Example
public class Inheritance_Demo {
    public static void main(String[] args) {
        Employee e2 = new Employee();
        FullTimeEmployee ft = new FullTimeEmployee();
        PartTimeEmployee pt = new PartTimeEmployee();
        e2.setEmployee("E112", "Gitesh");
        ft.setFullTimeEmployee("E101","Ganesh",10000 );
        pt.setPartTimeEmployee("E123","Arundhati",45000,8);
        pt.printPartTimeEmployee();
        e2.printEmployee();
        ft.printFullTimeEmployee();
    }
    }
    class Employee {
        private String empId;
        private String empName;

        public void setEmployee(String empId, String empName) {
            this.empId = empId;
            this.empName = empName;
        }

        public void printEmployee() {
            System.out.println("Employee id:" + empId);
            System.out.println("Employee Name:" + empName);

        }
    }

        class FullTimeEmployee extends Employee {
            private double salary;

            public void setFullTimeEmployee(String empId, String empName, double salary) {
                setEmployee(empId, empName);
                this.salary = salary;
            }

            public void printFullTimeEmployee() {
                printEmployee();
                System.out.println("Employee salary:" + salary);
            }

        }
        class PartTimeEmployee extends Employee{
    private int workingTime;
    public void setPartTimeEmployee(String empId,String empName,double salary, int workingTime){
        setEmployee(empId,empName);
        this.workingTime=workingTime;
    }
    public void printPartTimeEmployee(){
        printEmployee();
        System.out.println("Employee Working Time:" +workingTime);
    }
        }



