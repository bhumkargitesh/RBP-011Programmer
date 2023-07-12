//1) Java Program to print the elements of an array
public class Day10_practice {
   public static void main(String[] args) {

        // Ques 1) 1) Java Program to print the elements of an array.

        int[] arr = {-7, -5, 5, 10, 0, 3, 20, 25, 12};

        System.out.print("Elements of given array are: ");


        for (int i = 0; i < arr.length; i++) {

            System.out.print(arr[i] + " ");
        }
    }
}





        /*  //Ques 2) Java Program to find the frequency of each element in the array

          int[] arr = new int[]{1, 2, 8, 3, 2, 2, 2, 5, 1};
          //Array fr will store frequencies of element
          int[] fr = new int[arr.length];
          int visited = -1;
          for (int i = 0; i < arr.length; i++) {
              int count = 1;
              for (int j = i + 1; j < arr.length; j++) {
                  if (arr[i] == arr[j]) {
                      count++;
                      //To avoid counting same element again
                      fr[j] = visited;
                  }
              }
              if (fr[i] != visited)
                  fr[i] = count;
          }


          System.out.println("---------------------------------------");
          System.out.println(" Element | Frequency");
          System.out.println("---------------------------------------");
          for (int i = 0; i < fr.length; i++) {
              if (fr[i] != visited)
                  System.out.println("    " + arr[i] + "    |    " + fr[i]);
          }
          System.out.println("----------------------------------------");

      }
  }

         */


       /*   //Ques 3) Java Program to print the largest element in an array

          double[] numArray = {23.4, -34.5, 50.0, 33.5, 55.5, 43.7, 5.7, -66.5};
          double largest = numArray[0];

          for (double num : numArray) {
              if (largest < num)
                  largest = num;
          }

          System.out.format("Largest element = %.2f", largest);

      }
  }

        */


       /*   // Ques 4) 4) Java Program to print the smallest element in an array

          int[] initializedArray
                  = new int[]{25, 110, 74, 75, 5};

          System.out.println("Given array ");

          for (int i = 0; i < initializedArray.length; i++) {

              System.out.println(initializedArray[i]);
          }


          int minValue = initializedArray[0];


          for (int i = 0; i < initializedArray.length; i++) {


              if (initializedArray[i] < minValue)

                  minValue = initializedArray[i];
          }

          System.out.println(
                  "Smallest element present in given array: "
                          + minValue);
      }
  }

        */


        //Ques 5 )Java Program to print the elements of an array present on an even position

       /*   //  Comment out the public class and Public Class and psvm

          class EvenPosition {
              public static void main(String[] args) {

                  int[] arr = new int[]{1, 2, 3, 4, 5, 6};


                  for (int i = 1; i < arr.length; i = i + 2) {


                      System.out.println(arr[i]);
                  }
              }
          }

        */


       /*   // Ques 6) Java Program to print the elements of an array in reverse order\

          int[] arr = new int[]{1, 2, 3, 4, 5};
          System.out.println("Original array: ");
          for (int i = 0; i < arr.length; i++) {
              System.out.print(arr[i] + " ");
          }
          System.out.println();
          System.out.println("Array in reverse order: ");

          for (int i = arr.length - 1; i >= 0; i--) {
              System.out.print(arr[i] + " ");
          }
      }
  }

        */


       /*   // Ques 7) Java Program to print the elements of an array present on odd position

          int[] arr = new int[]{1, 2, 3, 4, 5};
          System.out.println("Elements of given array present on odd position: ");

          for (int i = 0; i < arr.length; i = i + 2) {
              System.out.println(arr[i]);
          }
      }
  }

        */


        /*  // Ques 8) Java Program to print the duplicate elements of an array

          int[] arr = new int[]{1, 2, 3, 4, 2, 7, 8, 8, 3};
          System.out.println("Duplicate elements in given array: ");

          for (int i = 0; i < arr.length; i++) {
              for (int j = i + 1; j < arr.length; j++) {
                  if (arr[i] == arr[j])
                      System.out.println(arr[j]);
              }
          }
      }
  }

         */


        /*  // Ques 9) Java Program to sort the elements of an array in ascending order

          int[] arr = new int[]{5, 2, 8, 7, 1};
          int temp = 0;


          System.out.println("Elements of original array: ");
          for (int i = 0; i < arr.length; i++) {
              System.out.print(arr[i] + " ");
          }


          for (int i = 0; i < arr.length; i++) {
              for (int j = i + 1; j < arr.length; j++) {
                  if (arr[i] > arr[j]) {
                      temp = arr[i];
                      arr[i] = arr[j];
                      arr[j] = temp;
                  }
              }
          }

          System.out.println();


          System.out.println("Elements of array sorted in ascending order: ");
          for (int i = 0; i < arr.length; i++) {
              System.out.print(arr[i] + " ");
          }
      }
  }

         */





    /*   // Ques 10) Find 2nd Largest Number in an Array

        //  Comment out the public class and Public Class and psvm

         class SecondLargestInArrayExample {
             public static int getSecondLargest(int[] a, int total) {
                 int temp;
                 for (int i = 0; i < total; i++) {
                     for (int j = i + 1; j < total; j++) {
                         if (a[i] > a[j]) {
                             temp = a[i];
                             a[i] = a[j];
                             a[j] = temp;
                         }
                     }
                 }
                 return a[total - 2];
             }

             public static void main(String args[]) {
                 int a[] = {1, 2, 5, 6, 3, 2};
                 int b[] = {44, 66, 99, 77, 33, 22, 55};
                 System.out.println("Second Largest: " + getSecondLargest(a, 6));
                 System.out.println("Second Largest: " + getSecondLargest(b, 7));
             }
         }

     */







