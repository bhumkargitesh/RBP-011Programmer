import java.util.Scanner;

public class TryCatchFinallyInDetailDemo {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("enter the 1st number");
            int a = sc.nextInt();
            System.out.println("enter the second number");
            int b = sc.nextInt();
            if ((a == 0) || (b == 0)) {
                throw new ArithmeticException();
            }
            if ((a < 0) || (b < 0)) {
                throw new Exception();
            }
            System.out.println("thank u for using class");
        }
        catch (ArithmeticException ae) {
            System.out.println("values enter are zero");
        }catch (ArrayIndexOutOfBoundsException aiob){
            System.out.println("plz provide 2 command line Argument");
        }

        catch (NumberFormatException nfe){
            System.out.println("plz provide integer value only");
        }
        catch (Exception e) {
            System.out.println("either of the value enter is less than zero");
        }
        finally {
            System.out.println("thank u once again");
        }

    }
}
//note :- finally block do not write before catch block -------it is not working its show compile error
//note:- without catch block use finally block dircetly its working and after catch block also working.