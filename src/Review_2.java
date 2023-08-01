import java.util.HashMap;

class Students {

        public int ID;

        public String name;
        public String phoneNumber;
        public String department;

        public Students(int ID, String name, String phoneNumber, String department) {
            this.ID = ID;
            this.name = name;
            this.phoneNumber = phoneNumber;
            this.department = department;
        }

        @Override
        public String toString() {
            return "Student{" +
                    "ID=" + ID +
                    ", name='" + name + '\'' +
                    ", phoneNumber='" + phoneNumber + '\'' +
                    ", department='" + department + '\'' +
                    '}';
        }

    }


public class Review_2 {


    public static void main(String[] args) {
        HashMap<Integer, Students> studentMap = new HashMap<>();

        // Create student objects
        Students student1 = new Students(1, "gitesh", "1234567890", "Computer Science");
        Students student2 = new Students(2, "Ganesh", "9876543210", "Electrical Engineering");

        // Store instances in the HashMap using student ID as the key
        studentMap.put(student1.ID, student1);
        studentMap.put(student2.ID, student2);

        // Retrieve a student by ID
        int studentID = 2;
        Students student = studentMap.get(studentID);
        if (student != null) {
            System.out.println("Student ID: " + student.ID);
            System.out.println("Name: " + student.name);
            System.out.println("Phone Number: " + student.phoneNumber);
            System.out.println("Department: " + student.department);
        } else {
            System.out.println("Student with ID " + studentID + " not found.");
        }
    }
}


