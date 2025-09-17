package Activity_3;

import java.util.Scanner;

public class ACT3Q05A02 {
    public static void main(String[] args) {

        // INSTANCES
        Scanner scanner = new Scanner(System.in);

        // VARIABLES
        int baskets, eggs;

        // HEADER
        System.out.println("=============================");
        System.out.println("EGG BASKET CALCULATOR");
        System.out.println("=============================\n");

        // INPUT
        System.out.print("Enter the number of eggs in each basket:\n> ");
        eggs = scanner.nextInt();
        System.out.print("Enter the number of baskets:\n> ");
        baskets = scanner.nextInt();

        // OUTPUT
        System.out.println("\nIf you have\n" + eggs + " eggs per basket and");
        System.out.println(baskets + " baskets, then");
        System.out.println("the total number of eggs is " + (eggs * baskets) + ".");
        System.out.println("Now we take two eggs out of each basket.");
        System.out.println("Now you have");
        System.out.println((eggs - 2) + " eggs per basket and");
        System.out.println(baskets + " baskets.");
        System.out.print("The new total number of eggs is ");
        System.out.println((eggs - 2) * baskets + ".");
        System.out.println("Thank you!");

        // FOOTER
        System.out.println("\n=============================");
        System.out.println("PROGRAMMER: CUENZA, RICKY S.");
        System.out.println("=============================");

        scanner.close(); // Close the scanner to prevent resource leaks

    }
}