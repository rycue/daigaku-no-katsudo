package Activity_2;

import java.util.Scanner;


public class ACT2Q10A06 {
    public static void main(String[] args) {

        // HEADER
        System.out.println("================================");
        System.out.println("=       SWAP TWO NUMBERS       =");
        System.out.println("================================\n");

        // VARIABLES
        int temp, num1, num2;

        // INSTANCE
        Scanner scanner = new Scanner(System.in);

        // USER INPUT
        System.out.print("Enter first number: ");
        num1 = scanner.nextInt();
        System.out.print("Enter second number: ");
        num2 = scanner.nextInt();

        // PROCESSING
        temp = num1;
        num1 = num2;
        num2 = temp;

        // OUTPUT
        System.out.println("\n(Swapping)\n");
        System.out.println("First number: " + num1);
        System.out.println("Second number: " + num2);

        // FOOTER
        System.out.println("\n================================");
        System.out.println("PROGRAMMER: CUENZA, RICKY S.");
        System.out.println("================================");

        scanner.close(); // Close the scanner to prevent resource leaks

    }
}