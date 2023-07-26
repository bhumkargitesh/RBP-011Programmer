
    import java.util.LinkedList;
import java.util.Scanner;

    public class CustomLinkedList {
        public static void main(String[] args) {

            LinkedList<Integer> customList = new LinkedList<>();

            // Taking 3 inputs from the user
            Scanner scan = new Scanner(System.in);
            System.out.print("Enter the first number: ");
            int num1 = scan.nextInt();
            System.out.print("Enter the second number: ");
            int num2 = scan.nextInt();
            System.out.print("Enter the third number: ");
            int num3 = scan.nextInt();

            customList.add(num1);
            
            addElements(customList, num2, num3);

            // Printing the custom LinkedList
            System.out.println("Custom LinkedList: " + customList);
        }

        public static void addElements(LinkedList<Integer> list, int num2, int num3) {
            // Adding element at the 2nd position
            list.add(1, num2);

            // Adding element at the 3rd position
            list.add(2, num3);
        }
    }



