import java.util.Scanner;

public class ACT4Q10A07 {
    public static void main(String[] args) {
        
        // INSTANCES
        Scanner scanner = new Scanner(System.in);
        
        // VARIABLES
        int age;

        // HEADER
        System.out.println("=============================");
        System.out.println("=   VOTER QUALIFICATION     =");
        System.out.println("=============================\n");
        
        // INPUT
        System.out.print("Enter your age:\n> ");
        age = scanner.nextInt();

        // PROCESSING & OUTPUT
        if (age < 18) {
            System.out.println("\nYOU ARE NOT QUALIFIED TO VOTE");
        } else {
            System.out.println("\nYOU ARE QUALIFIED TO VOTE");
        }

        // FOOTER
        System.out.println("\n=============================");
        System.out.println("PROGRAMMER: CUENZA, RICKY S.");
        System.out.println("=============================");

        scanner.close(); // Close the scanner to prevent resource leaks
    }
}
