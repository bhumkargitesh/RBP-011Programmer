public class ExceptionHandlingDemo {
     public static void main(String[] args) throws StringMatchException {
            String s="GITESH";

            if(s.equals("GITESH")){
                System.out.println("String is correct");
            }
            else {
                throw new StringMatchException("String is not available");
            }

        }
    }
    class StringMatchException extends Exception{
        public StringMatchException(String s) {

            super(s);
        }
    }

