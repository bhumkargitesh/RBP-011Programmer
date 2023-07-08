import java.util.Scanner;

public class DemoCalculatorSwitch {
    public static void main(String[] args){
        System.out.println("using switch case");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number");
        int a = sc.nextInt();
        System.out.println("Enter the second number");
        int b = sc.nextInt();
        System.out.println("Enter \n 1 : addition  \n 2 : Subtraction  \n 3 : multiplication  \n  4 : division");
        int input = sc.nextInt();
        switch (input) {
            case 1 : System.out.println("sum = " + (a + b));
            break;
            case 2: System.out.println("sub = " + (a - b));
            break;
            case 3 : System.out.println("mul = " + (a * b));
            break;
            case 4 : System.out.println("div = " + (a / b));
            break;
            default : System.out.println("invalid");
            break;




        }


    }
}
