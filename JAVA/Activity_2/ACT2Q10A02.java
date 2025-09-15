package Activity_2;

import java.util.Scanner;

public class ACT2Q10A02 {
    public static void main(String[] args) {

        // VARIABLES
        final double PI = 3.14159;
        
        // INSTANCES
        Scanner scanner = new Scanner(System.in);

        // HEADER
        System.out.println("===============================");
        System.out.println("= VOLUME OF SPHERE CALCULATOR =");
        System.out.println("===============================\n");

        // USER INPUT & PROCESSING
        System.out.print("Enter the radius of the sphere: ");
        double radius = scanner.nextDouble();

        // CALCULATION & OUTPUT (without Math library)
        double vsphere = (4.0 / 3.0) * PI * radius * radius * radius;
        vsphere = ((int)(vsphere * 100)) / 100.0;
        System.out.println("Volume of sphere with radius " + radius + " is: " + vsphere);

        // FOOTER
        System.out.println("\n===============================");
        System.out.println("PROGRAMMER: CUENZA, RICKY S.");
        System.out.println("===============================");

        scanner.close(); // Close the scanner to prevent resource leaks
        
    }
}