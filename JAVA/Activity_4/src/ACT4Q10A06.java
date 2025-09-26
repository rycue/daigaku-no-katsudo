import java.util.Scanner;

public class ACT4Q10A06 {
    public static void main(String[] args) {
        
        // INSTANCES
        Scanner scanner = new Scanner(System.in);
        
        // VARIABLES
        int number;

        // HEADER
        System.out.println("=============================");
        System.out.println("=   EVEN OR ODD CHECKER     =");
        System.out.println("=============================\n");

        // INPUT
        System.out.print("Enter a number:\n> ");
        number = scanner.nextInt();

        // PROCESSING & OUTPUT
        if (number % 2 == 0) {
            System.out.println("\nThe number " + number + " is EVEN.");
        } else {
            System.out.println("\nThe number " + number + " is ODD.");
        }

        // FOOTER
        System.out.println("\n=============================");
        System.out.println("PROGRAMMER: CUENZA, RICKY S.");
        System.out.println("=============================");

        scanner.close(); // Close the scanner to prevent resource leaks
    }
}
