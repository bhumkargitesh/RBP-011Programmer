import java.util.Scanner;

public class Logical {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the age value from user");
        int age = sc.nextInt();
        if (age >=18 && age <= 60){
         //   if (age >=18 || age <= 60){
            System.out.println("Eligible");
        }
        else{
            System.out.println("Ineligible");
        }

    }


}
