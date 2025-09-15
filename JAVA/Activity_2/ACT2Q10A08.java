package Activity_2;

import java.util.Scanner;

public class ACT2Q10A08 {
    public static void main(String[] args) {

        // HEADER
        System.out.println("===========================================");
        System.out.println("= RECTANGLE AREA AND PERIMETER CALCULATOR =");
        System.out.println("===========================================\n");
        
        // INSTANCE
        Scanner scanner = new Scanner(System.in);

        // VARIABLES
        double length, width, area, perimeter;

        // USER INPUT
        System.out.print("Enter length: ");
        length = scanner.nextDouble();

        System.out.print("Enter width: ");
        width = scanner.nextDouble();

        // PROCESSING
        area = length * width;
        perimeter = 2 * (length + width);
        
        // OUTPUT
        System.out.printf("Area of rectangle: %.2f\n", area);
        System.out.printf("Perimeter of rectangle: %.2f\n", perimeter);

        // FOOTER
        System.out.println("\n===========================================");
        System.out.println("PROGRAMMER: CUENZA, RICKY S.");
        System.out.println("===========================================");
        
        scanner.close(); // Close the scanner to prevent resource leaks

    }
}