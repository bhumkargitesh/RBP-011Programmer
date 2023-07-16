import java.util.Scanner;

public class PrimeNumberCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number from user");
        int num = sc.nextInt();
        boolean flag = true;
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                flag = false;
            }
            }
            if (flag == true) {
                System.out.println(num + " it is a prime number");
            } else {
                System.out.println(num + " it is a not prime number");
            }


        Scanner sc2 = new Scanner(System.in);
        System.out.println("enter the number from user2");
        int num1 = sc2.nextInt();
        boolean flag1 = true;
        for (int i = 2; i <(int)num1/2; i++) {
            if (num1 % i == 0) {
                flag1 = false;
            }
        }
        if (flag1 == true) {
            System.out.println(num1  + " it is a prime number1");
        } else {
            System.out.println(num1 + " it is a not prime number1");
        }


        }
    }







