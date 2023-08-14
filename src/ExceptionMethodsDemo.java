import java.util.Scanner;

public class ExceptionMethodsDemo {
    public static void main(String[] args) {
        try{
            Scanner sc = new Scanner(System.in);
            System.out.println("enter the first number");
            int a = sc.nextInt();
            System.out.println("enter the second number");
            int b = sc.nextInt();
            int ans = a/b;
            System.out.println("the ans is :" +ans);
        }
        catch (Exception e){
            System.out.println(e.getMessage());
           // System.out.println(e.getStackTrace());
           // e.printStackTrace();
            System.out.println(e.getCause());
        }
    }
}
