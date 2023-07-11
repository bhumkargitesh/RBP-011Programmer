public class ArraysD10 {
//    public static void main(String[] args) {
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
//        // int max = arr[0];
//
////        for (int i = 1; i < arr.length; i++) {
////            if (arr[i] > max) {
////                max = arr[i];
////            }
////        }
////        System.out.println(max);
//
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i]);
//        }
//    }
//}

    public static void main(String[] args) {
        int arr[][] = new int[3][3];
        arr[0][0] = 1;
        arr[0][1] = 2;
        arr[0][2] = 3;
        arr[1][0] = 4;
        arr[1][1] = 5;
        arr[1][2] = 6;
        arr[2][0] = 7;
        arr[2][1] = 8;
        arr[2][2] = 9;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(arr[i][j] + "\t");
                System.out.print("*" + "\t");
            }
            System.out.println();
        }
    }
}