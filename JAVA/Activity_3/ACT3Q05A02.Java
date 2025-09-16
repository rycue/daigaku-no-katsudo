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

        // INPUT & OUTPUT
        System.out.print("Enter the number of eggs in each basket:\n> ");
        eggs = scanner.nextInt();
        System.out.print("Enter the number of baskets:\n> ");
        baskets = scanner.nextInt();
        System.out.println("\nIf you have\n" + eggs + " eggs per basket and\n" + baskets + " baskets, then");
        System.out.println("you have a total of " + (eggs * baskets) + " eggs.");
        System.out.println("Now we take two eggs out of each basket. Now you have");
        System.out.println((eggs - 2) + " eggs per basket and");
        System.out.println(baskets + " baskets.");
        System.out.println("The new total number of eggs is " + ( (eggs - 2) * baskets) + ".");

        // FOOTER
        System.out.println("\n=============================");
        System.out.println("PROGRAMMER: CUENZA, RICKY S.");
        System.out.println("=============================");

        scanner.close(); // Close the scanner to prevent resource leaks

    }
}