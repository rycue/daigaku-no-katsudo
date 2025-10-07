import java.util.Scanner;

public class ACT5Q8A3 {
    public static void main(String[] args) {

        // HEADER
        System.out.println("=============================");
        System.out.println("=      REVERSE INTEGER      =");
        System.out.println("=============================\n");

        // INSTANCES
        Scanner scanner = new Scanner(System.in);

        // VARIABLES
        int intNum = 0, reversedNum = 0, lastDigit = 0;

        // INPUT
        System.out.print("Enter an integer:\n> ");
        intNum = scanner.nextInt();

        // PROCESS
        while (intNum != 0) {
            lastDigit = intNum % 10; // get the last digit
            reversedNum = reversedNum * 10 + lastDigit; // append last digit
            intNum = intNum / 10; // slice off the last digit
        }
        
        // OUTPUT
        System.out.println("\nReversed: " + reversedNum);

        // FOOTER
        System.out.println("\n=============================");
        System.out.println("PROGRAMMER: CUENZA, RICKY S.");
        System.out.println("=============================");

        scanner.close(); // close scanner to prevent memory leak
    }
}
