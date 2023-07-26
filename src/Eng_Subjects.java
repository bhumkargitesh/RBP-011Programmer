import java.util.ArrayList;
import java.util.List;
//step-1 create class
    class Subject {
        //assiane data type
        private String subjectCode;      //keys
        private String subjectName;       //values

    //step2 //create a constructor and define parameter
        public Subject(String subjectCode, String subjectName) {
            this.subjectCode = subjectCode;
            this.subjectName = subjectName;
        }
//using get syntax for retrieve data(for keys and values)
        public String getSubjectCode() {
            return subjectCode;
        }

        public String getSubjectName() {
            return subjectName;
        }

        // Override toString() to easily display subject information
        @Override
        public String toString() {
            return "Subject Code: " + subjectCode + ", Subject Name: " + subjectName;
        }
    }

    public class Eng_Subjects {
        public static void main(String[] args) {
            // Create an ArrayList to store subjects
            List<Subject> subjectsList = new ArrayList<>();

            // Adding engineering subjects to the list
            subjectsList.add(new Subject("ENG101", "Introduction to Engineering"));
            subjectsList.add(new Subject("MATH201", "Calculus"));
            subjectsList.add(new Subject("ELEC301", "Electronics"));
            subjectsList.add(new Subject("MECH401", "Mechanical Engineering"));

            // Displaying the list of subjects
            for (Subject subject : subjectsList) {
                System.out.println(subject);
            }
        }
    }

