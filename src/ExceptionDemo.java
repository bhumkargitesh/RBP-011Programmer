public class ExceptionDemo {
    public static void main(String[] args) throws ClassNotFoundException{
        //this is a method
        Class.forName("java");
        try {
            int i = 10;
            int j = i/2;
            System.out.println(j);
        }catch (Exception e){
            e.printStackTrace();
            System.out.println("Application is interupted");
            try{
                throw new RuntimeException();
            }catch (Exception f){
                f.printStackTrace();
            }
        }
        finally {
            System.out.println("Application is launched");
        }
    }
}
