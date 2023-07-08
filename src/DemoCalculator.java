import java.util.Scanner;

public class DemoCalculator {

    public static void main(String[] args){
        System.out.println("Welcome to Calculator");
        Scanner sc = new Scanner(System.in); // this syntax using for given input
        System.out.println("Enter the 1st number");
        int a = sc.nextInt();
        System.out.println("Enter the second number");
        int b = sc.nextInt();
        System.out.println("Enter \n 1 : addition  \n 2 : Subtraction  \n 3 : multiplication  \n  4 : division");
        int input = sc.nextInt();
        if (input == 1){
            System.out.println(" sum = " + (a + b));
        } else if (input == 2) {
            System.out.println(" sub = " + (a - b));
        }else if (input == 3) {
            System.out.println(" mul = " + (a * b));
        }else if (input == 4) {
            System.out.println(" div = " + (a / b));
        }else {
            System.out.println("invalid");
        }


    }
}
