package Activity_3;

import java.util.Scanner;

public class ACT3Q05A04 {
    public static void main(String[] args) {

        // INSTANCES
        Scanner scanner = new Scanner(System.in);

        // VARIABLES
        float litersOfMilkProduced;
        int milkCartons;
        double costProduction, profit;

        // HEADER
        System.out.println("=============================");
        System.out.println("TITLE: MILK PRODUCTION");
        System.out.println("=============================\n");

        // INPUT
        System.out.print("Enter the total amount of milk produced in the morning.\n> ");
        litersOfMilkProduced = scanner.nextFloat();

        // CALCULATIONS & OUTPUT
        milkCartons = (int) Math.ceil(litersOfMilkProduced / 3.78);
        System.out.println("\nNumber of milk cartons needed: " + milkCartons);
        costProduction = litersOfMilkProduced * 0.38;
        System.out.printf("\nCost of production: $%.2f\n", costProduction);
        profit = milkCartons * 0.27;
        System.out.printf("\nProfit: $%.2f\n", profit);

        // FOOTER
        System.out.println("\n=============================");
        System.out.println("PROGRAMMER: CUENZA, RICKY S.");
        System.out.println("=============================");

        scanner.close(); // Close the scanner to prevent resource leaks

    }
}