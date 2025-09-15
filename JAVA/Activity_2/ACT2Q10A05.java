package Activity_2;

import java.util.Scanner;

public class ACT2Q10A05 {
    public static void main(String[] args) {

        // HEADER
        System.out.println("======================================");
        System.out.println("= STUDENT'S AVERAGE GRADE CALCULATOR =");
        System.out.println("======================================\n");

        // INSTANCE
        Scanner scanner = new Scanner(System.in);

        // VARIABLES
        double prelim, midterm, finals, average;

        // USER INPUT
        System.out.print("Enter Prelim grade: ");
        prelim = scanner.nextDouble();
        System.out.print("Enter Midterm grade: ");
        midterm = scanner.nextDouble();
        System.out.print("Enter Finals grade: ");
        finals = scanner.nextDouble();

        // PROCESSING
        average = (prelim + midterm + finals) / 3.0;

        // OUTPUT
        System.out.printf("Average grade: %.2f\n", average);

        // FOOTER
        System.out.println("\n======================================");
        System.out.println("PROGRAMMER: CUENZA, RICKY S.");
        System.out.println("======================================");

        scanner.close(); // Close the scanner to prevent resource leaks
        
    }
}