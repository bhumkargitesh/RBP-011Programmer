import java.util.Scanner;

public class ExceptionExample {
    public static void main(String[] args) throws MatchingException {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the String/Name");
        String a =sc.nextLine();
        if (a.equals("bhumkar")) {
            System.out.println("String is matching");
        }else{
            throw new MatchingException("String is not match");
        }
    }
}
class MatchingException extends Exception{
    public MatchingException(String a){
        super(a);
    }
}
