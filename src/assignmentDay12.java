public class assignmentDay12 {
    public static void main(String[] args) {
        if (args.length < 3) {
            System.out.println("Please provide three integer values for a, b, and c.");
            return;
        }

        // Parse the command line arguments
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);

        // Calculate the discriminant
        int delta = b * b - 4 * a * c;

        // Check if the roots are real or complex
        if (delta < 0) {
            System.out.println("The roots are complex.");
        } else {
            // Calculate the roots
            double root1 = (-b + Math.sqrt(delta)) / (2 * a);
            double root2 = (-b - Math.sqrt(delta)) / (2 * a);

            // Print the roots
            System.out.println("Root 1: " + root1);
            System.out.println("Root 2: " + root2);
        }
    }

}
