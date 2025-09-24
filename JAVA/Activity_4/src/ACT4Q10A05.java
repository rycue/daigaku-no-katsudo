import java.util.Scanner;

public class ACT4Q10A05 {
    public static void main(String[] args) {

        // INSTANCES
        Scanner scanner = new Scanner(System.in);

        // VARIABLES
        char gender;
        
        // HEADER
        System.out.println("=============================");
        System.out.println("   GENDER GREETING PROGRAM   ");
        System.out.println("=============================\n");
        
        // INPUT
        System.out.print("Enter 'm' for male or 'f' for female:\n> ");
        gender = scanner.next().toLowerCase().charAt(0);

        // PROCESSING & OUTPUT
        System.out.println("");
        if (gender == 'm') {
            System.out.println("HELLO SIR");
        } else if (gender == 'f') {
            System.out.println("HELLO MADAM");
        } else {
            System.out.println("Invalid input.");
        }

        // FOOTER
        System.out.println("\n=============================");
        System.out.println("PROGRAMMER: CUENZA, RICKY S.");
        System.out.println("=============================");

        scanner.close(); // Close the scanner to prevent resource leaks
    }
}
