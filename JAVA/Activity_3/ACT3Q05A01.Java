package Activity_3;

import java.util.Scanner;

public class ACT3Q05A01 {
    public static void main(String[] args) {

        // INSTANCES
        Scanner scanner = new Scanner(System.in);

        // VARIABLES
        float inches, feet, centimeters;

        // HEADER
        System.out.println("=============================");
        System.out.println("INCHES TO FEET & CENTIMETERS");
        System.out.println("=============================\n");

        // INPUT & OUTPUT
        System.out.print("ENTER MEASUREMENT IN INCHES: ");
        inches = scanner.nextFloat();
        feet = inches / 12;
        centimeters = inches * 2.54f;
        System.out.printf("EQUIVALENT IN FEET: %.2f ft\n", feet);
        System.out.printf("EQUIVALENT IN CENTIMETERS: %.2f cm\n", centimeters);

        // FOOTER
        System.out.println("\n=============================");
        System.out.println("PROGRAMMER: CUENZA, RICKY S.");
        System.out.println("=============================");

        scanner.close(); // Close the scanner to prevent resource leaks

    }
}