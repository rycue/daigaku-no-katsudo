package Activity_3;

import java.util.Scanner;

public class ACT3Q05A05 {
    public static void main(String[] args) {

        // INSTANCES
        Scanner scanner = new Scanner(System.in);

        // VARIABLES
        double payRate, grossIncome, tax, netIncome;
        double clothes, supplies, remaining, savingsBonds, parentsBonds;
        int totalHours = 0;

        // HEADER
        System.out.println("=============================");
        System.out.println("SUMMER JOB INCOME CALCULATOR");
        System.out.println("=============================\n");

        // INPUT
        System.out.print("Enter your hourly pay rate: $");
        payRate = scanner.nextDouble();
        for (int i = 1; i <= 5; i++) {
            System.out.print("Enter hours worked for week " + i + ": ");
            totalHours += scanner.nextInt();
        }

        // CALCULATIONS
        grossIncome = payRate * totalHours;
        tax = grossIncome * 0.14;
        netIncome = grossIncome - tax;
        clothes = netIncome * 0.10;
        supplies = netIncome * 0.01;
        remaining = netIncome - (clothes + supplies);
        savingsBonds = remaining * 0.25;
        parentsBonds = savingsBonds * 0.5;

        // OUTPUT
        System.out.printf("\nIncome before taxes: $%.2f\n", grossIncome);
        System.out.printf("Income after taxes: $%.2f\n", netIncome);
        System.out.println("\nMoney spent on:");
        System.out.printf("- Clothes and accessories: $%.2f\n", clothes);
        System.out.printf("- School supplies: $%.2f\n", supplies);
        System.out.printf("- Savings bonds: $%.2f\n", savingsBonds);
        System.out.printf("- Additional savings bonds (parents): $%.2f\n", parentsBonds);

        // FOOTER
        System.out.println("\n=============================");
        System.out.println("PROGRAMMER: CUENZA, RICKY S.");
        System.out.println("=============================");

        scanner.close(); // Close the scanner to prevent resource leaks
        
    }
}