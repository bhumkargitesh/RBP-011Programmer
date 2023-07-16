
// P_Finite
public class Recursion_Method {
    static int count = 0;

    static void p() {
        count++;
        if (count <= 5) {
            System.out.println("Hello : " + count);
            p();

        }
    }
    // factorial demo method ( recursive function)
    static int factorial(int n){
        if (n==1) {
            return 1;
        }
        else {
            return n * factorial(n - 1);
        }
    }


    public static void main(String[] args) {
        p();
            System.out.println("The value is : " + factorial(5));

    }
}
