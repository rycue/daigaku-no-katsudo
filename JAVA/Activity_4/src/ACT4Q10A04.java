import java.util.Scanner;

public class ACT4Q10A04 {
    public static void main(String[] args) {

        // INSTANCES
        Scanner scanner = new Scanner(System.in);
        
        // VARIABLES
        int temperature = 75; // You can change this value to test different cases

        // HEADER
        System.out.println("=============================");
        System.out.println("=   Temperature Checker     =");
        System.out.println("=============================\n");

        // DISPLAY TABLE
        System.out.println("Temperature       | State of Matter");
        System.out.println("------------------|----------------");
        System.out.println("Less than 0       | ICE");
        System.out.println("Between 0 and 100 | WATER");
        System.out.println("Exceeds 100       | STEAM");

        // PROMPT USER FOR TEMPERATURE INPUT
        System.out.print("\nEnter the temperature:\n> ");
        temperature = scanner.nextInt();

        // DETERMINE AND DISPLAY STATE OF MATTER
        System.out.print("\nState of Matter: ");

        if (temperature < 0) {
            System.out.println("ICE");
        } else if (temperature <= 100) {
            System.out.println("WATER");
        } else {
            System.out.println("STEAM");
        }

        // FOOTER
        System.out.println("\n=============================");
        System.out.println("PROGRAMMER: CUENZA, RICKY S.");
        System.out.println("=============================");

        scanner.close(); // Close the scanner to prevent resource leaks

    }
}
