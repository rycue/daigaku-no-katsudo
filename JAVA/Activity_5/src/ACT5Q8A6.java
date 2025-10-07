import java.util.Scanner;

public class ACT5Q8A6 {
    public static void main(String[] args) {

        // HEADER
        System.out.println("=============================");
        System.out.println("=    PRIME NUMBER FINDER    =");
        System.out.println("=============================\n");

        // VARIABLES
        int number = 0;
        boolean isPrime = false;

        // INSTANCES
        Scanner scanner = new Scanner(System.in);

        // INPUT
        System.out.print("Enter a positive integer:\n> ");
        number = scanner.nextInt();

        // PROCESS
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                isPrime = true;
                break;
            }
        }
        
        // CONDITIONAL OUTPUT
        if (isPrime) System.out.println("\nResult:\n> Yes! The number " +
            number + " is a prime number.");
        else System.out.println("\nResult:\n> Nope. The number " +
            number + " is NOT a prime number.");

        // FOOTER
        System.out.println("\n=============================");
        System.out.println("PROGRAMMER: CUENZA, RICKY S.");
        System.out.println("=============================");

        scanner.close();
    }
}
