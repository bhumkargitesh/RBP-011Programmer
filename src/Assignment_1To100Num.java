public class Assignment_1To100Num {
        public static void printNumbers(int n) {
            if (n <= 100) {
                System.out.println(n);
                printNumbers(n + 1);
            }
        }

        public static void main(String[] args) {
            int startNumber = 1;
            printNumbers(startNumber);
        }
    }

