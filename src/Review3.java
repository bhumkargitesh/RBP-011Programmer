// explicit example
public class Review3 {


    public static void main(String[] args) {
        try{
             throw new CustomException("gitesh");
        }
        catch(CustomException e){
            System.out.println("custom Exception:" +e.getMessage());


        }
    }

}
class CustomException extends RuntimeException {
    public CustomException(String m){
        super(m);
    }


        }
