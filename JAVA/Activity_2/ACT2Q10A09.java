package Activity_2;

import java.util.Scanner;

public class ACT2Q10A09 {
    public static void main(String[] args) {

        // HEADER
        System.out.println("============================");
        System.out.println("= FEET TO INCHES CONVERTER =");
        System.out.println("============================\n");

        // INSTANCE
        Scanner scanner = new Scanner(System.in);

        // VARIABLES
        double feet, inches;

        // USER INPUT
        System.out.print("Enter number in feet: ");
        feet = scanner.nextDouble();
        
        // PROCESSING
        inches = feet * 12;

        // OUTPUT
        System.out.printf("%.2f feet is %.2f inches\n", feet, inches);

        // FOOTER
        System.out.println("\n============================");
        System.out.println("PROGRAMMER: CUENZA, RICKY S.");
        System.out.println("============================");

        scanner.close(); // Close the scanner to prevent resource leaks

    }
}