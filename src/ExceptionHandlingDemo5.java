public class ExceptionHandlingDemo5 {
    public static void main(String[] args) throws StringMatchingException {
        String s1 = "aru";
        if (s1.equals("Aru")){
            System.out.println("String is correct");
        }
        else{
            System.out.println("not correct");
          throw new  StringMatchingException("String is not match");
        }
    }
}
class StringMatchingException extends Exception{
    public StringMatchingException(String s1){
        super(s1);
    }
}
