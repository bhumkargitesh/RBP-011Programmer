public class OppsConcepts_D15 {
    public static void main(String[] args) {
        Std s1 = new Std("Ganesh","Bhumkar", 1);
        Std s2 = new Std("Gitesh", "Bhumkar",9);
        System.out.println(s1);
        System.out.println(s2);
    }
}
class Std {
    String firstName;
    String lastName;
    int rollNo;

    Std(String f, String l, int r) {
        firstName = f;
        lastName = l;
        rollNo = r;
    }

    @Override
    public String toString() {
        return "First Name : " + firstName + "\nLastName : " + lastName + "\nRoll No : " + rollNo;
    }
}

//null is the default value of string
//default value of integer is 0\
//modeling


