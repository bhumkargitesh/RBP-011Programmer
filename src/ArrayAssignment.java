import java.util.Scanner;

public class ArrayAssignment {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int k = 7;
        int arr[] = new int[k];

        System.out.println("enter the 7 inputs number from user");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();

        }

        // minimum value
        int minValue = arr[0];


          for (int i = 0; i < arr.length; i++) {


              if (arr[i] < minValue)

                  minValue = arr[i];
          }

          System.out.println(
                  "Smallest element present in given array: "
                          + minValue);





        //descending order

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    int g = arr[i];
                    arr[i] = arr[j];
                    arr[j] = g;

                }

            }
        }
        System.out.println("sorted array:=");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + "");

        }
    }
}