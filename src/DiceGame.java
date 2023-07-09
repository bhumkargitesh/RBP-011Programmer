import java.util.Scanner;

public class DiceGame {
    public static void main(String[] args){
        System.out.println("welcome to dices game");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();
        if (num>=6){
            System.out.println("you won the game");
        }else{
            System.out.println("you lost the game");
        }
    }
}
