public class ForEachLoopD13 {
    public static void main(String[] args) {
//        int arr[] = new int[10];
//        arr[0] = 10;
//        arr[1] = 20;
//        arr[2] = 30;
//        arr[3] = 40;
//        arr[4] = 50;
//        arr[5] = 80;
//        arr[6] = 90;
//        arr[7] = 100;
//        arr[8] = 120;
//        arr[9] = 140;
//
//            for (int i : arr) {
//                System.out.println(i);
//            }
        int arr1[][] = new int[3][3];
        arr1[0][0] = 1;
        arr1[0][1] = 2;
        arr1[0][2] = 3;
        arr1[1][0] = 4;
        arr1[1][1] = 5;
        arr1[1][2] = 6;
        arr1[2][0] = 7;
        arr1[2][1] = 8;
        arr1[2][2] = 9;

        for (int[] i : arr1) {
            for (int j : i) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

    }
}
