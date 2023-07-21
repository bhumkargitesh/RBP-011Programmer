import java.util.Scanner;

public class ArrayPracticeQuestion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = 5;
        int arr[] = new int[m];
        System.out.println("enter the 5 input element from user");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        //smallest number
        int minimumValue = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (minimumValue > arr[i])
                arr[i] = minimumValue;
        }
        System.out.println("Display the  smallest number :" + minimumValue);
        // Descending order

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    int b = arr[i];
                    arr[i] = arr[j];
                    arr[j] = b;

                }
            }
        }
        System.out.println("sorted array :=");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + "");
        }
        //ascending order

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int b = arr[i];
                    arr[i] = arr[j];
                    arr[j] = b;
                }
            }
        }
        System.out.println("sorted array :=");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + "");
        }



        }


    }

