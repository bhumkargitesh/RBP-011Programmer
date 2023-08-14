// exception handling  example using throw exception.
import java.util.Scanner;

public class ExceptionHandlingDemo3 {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("enter the first number");
            int a = sc.nextInt();
            System.out.println("enter the second number");

            int b = sc.nextInt();
            if (b == 0) {
                throw new ArithmeticException();
            }
                int c = a / b;

                System.out.println("the c is :" + c);

        }
        catch (ArithmeticException e){
            System.out.println("sorry don`t divided by zero");

        }
    }
}
