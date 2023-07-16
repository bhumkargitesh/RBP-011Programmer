import java.util.Scanner;

public class FPrimeNum {
    public static boolean isPrime(int n) {
        boolean flag = true;
        for (int i = 2; i < (int) n / 2; i++)
            if (n % i == 0) {
                flag = false;

        break;
    }
        return flag;
    }


        public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
            System.out.println("enter the number");
            int num = sc.nextInt();
            if (isPrime(num)) {
                System.out.println(num + " it is a prime number");
            } else {
                System.out.println(num + " it is a not prime number");
            }
        }
    }
