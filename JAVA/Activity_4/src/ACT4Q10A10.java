import java.util.Scanner;

public class ACT4Q10A10 {
    public static void main(String[] args) {

        // INSTANCES
        Scanner scanner = new Scanner(System.in);

        // VARIABLES
        String input, message;

        // HEADER
        System.out.println("=============================");
        System.out.println("=   LETTER GRADE CONVERTER  =");
        System.out.println("=============================\n");

        // DISPLAY TABLE
        System.out.println(" Letter Grade\t|    Message");
        System.out.println("----------------|----------------");
        System.out.println("       A       \t|  EXCELLENT");
        System.out.println("       B       \t|  ABOVE AVERAGE");
        System.out.println("       C       \t|  AVERAGE");
        System.out.println("       D       \t|  BELOW AVERAGE");
        System.out.println("       F       \t|  FAILED\n");

        // INPUT
        System.out.print("Enter Letter Grade (A-F):\n> ");
        input = scanner.nextLine().toUpperCase();

        // PROCESSING & OUTPUT
        switch (input) {
            case "A":
                message = "EXCELLENT";
                break;
            case "B":
                message = "ABOVE AVERAGE";
                break;
            case "C":
                message = "AVERAGE";
                break;
            case "D":
                message = "BELOW AVERAGE";
                break;
            case "F":
                message = "FAILED";
                break;
            default:
                message = "Invalid letter grade!";
        }
        System.out.println("\n" + message);

        // FOOTER
        System.out.println("\n=============================");
        System.out.println("PROGRAMMER: CUENZA, RICKY S.");
        System.out.println("=============================");

        scanner.close(); // Close the scanner to prevent resource leaks
    }
}
