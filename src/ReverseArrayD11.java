public class ReverseArrayD11 {
    public static void main(String[] args) {
        int arr[] = new int[]{11,12,15,14,20,55,};
        System.out.println("original order");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        System.out.println("reverse oder");
        for (int i= arr.length-1;i>=0;i--){
            System.out.println(arr[i]);
        }
    }
    }
