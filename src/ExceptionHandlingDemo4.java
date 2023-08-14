import java.io.IOException;

public class ExceptionHandlingDemo4 {
    void m1(int a) throws IOException{
        if (a<0) {
            throw new IOException();
        }
            System.out.println("Valid value a :" + a);
        }

    public static void main(String[] args) {
        ExceptionHandlingDemo4 obj = new ExceptionHandlingDemo4();
        int val =Integer.parseInt(args[0]);
        try {


        obj.m1(val);

    }
        catch (Exception e) {
            System.out.println("try again");


        }
        }

    }

