public class Exception_Handling {
    public static void main(String[] args) {
        //this is a method

        try {
            int i = 10;
            int j = i / 2;
            System.out.println(j);
        } catch (Exception e) {
            System.out.println("Application is interupted" +e);
        } finally {

            System.out.println("Application is launched");
        }
    }

}
