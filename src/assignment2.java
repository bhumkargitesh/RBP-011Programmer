import java.util.Scanner;

public class assignment2 {

    public static void main(String[] args) {

        Scanner sc  = new Scanner(System.in);
         int n = 10;
        int arr[] = new int[n];
        System.out.println("enter the 10 element array");
        for(int i = 0;i< arr.length;i++) {
            arr[i] = sc.nextInt();
        }
        for(int i= 0; i< arr.length;i++){
            for(int j=i+1; j< arr.length;j++){
                if(arr[i]>arr[j]){
                    int t = arr[i];
                    arr[i]=arr[j];
                    arr[j] =t;
                }
            }

        }
        System.out.println("sorted array:=");
        for (int i= 0; i< arr.length;i++){
            System.out.println(arr[i] + "");
        }

    }
}
