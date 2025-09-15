package Activity_2;

import java.util.Scanner;

public class ACT2Q10A04 {
    public static void main(String[] args) {

        // HEADER
        System.out.println("===================================");
        System.out.println("= SIMPLE CALCULATOR PROGRAM       =");
        System.out.println("===================================\n");

        // INSTANCES
        Scanner scanner = new Scanner(System.in);

        // VARIABLES
        int num1, num2;

        // USER INPUT
        System.out.print("Enter first number: ");
        num1 = scanner.nextInt();
        System.out.print("Enter second number: ");
        num2 = scanner.nextInt();

        // PROCESSING
        int sum = num1 + num2;
        int product = num1 * num2;

        // OUTPUT
        System.out.println("Sum: " + sum);
        System.out.println("Product: " + product);

        // FOOTER
        System.out.println("\n===================================");
        System.out.println("PROGRAMMER: CUENZA, RICKY S.");
        System.out.println("===================================");

        scanner.close(); // Close the scanner to prevent resource leaks
        
    }
}