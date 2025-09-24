import java.util.Scanner;

public class ACT4Q10A01 {
    public static void main(String[] args) {
        
        // INSTANCES
        Scanner scanner = new Scanner(System.in);
        
        // VARIABLES
        int number;

        // HEADER
        System.out.println("=============================");
        System.out.println("=   POSITIVE OR NEGATIVE    =");
        System.out.println("=============================\n");
        
        // INPUT & OUTPUT
        System.out.print("Enter a number: ");
        number = scanner.nextInt();

        if (number >= 0) {
            System.out.println("POSITIVE");
        } else {
            System.out.println("NEGATIVE");
        }

        // FOOTER
        System.out.println("\n=============================");
        System.out.println("PROGRAMMER: CUENZA, RICKY S.");
        System.out.println("=============================");

        scanner.close(); // Close the scanner to prevent resource leaks

    }
}
