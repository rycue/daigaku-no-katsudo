import java.util.Scanner;

public class ACT4Q10A08 {
    public static void main(String[] args) {
        
        // INSTANCES
        Scanner scanner = new Scanner(System.in);
        
        // VARIABLES
        int noOfRegistrants = 0;
        float feePerPerson = 0.0f, totalAmount = 0.0f;
        boolean displayOutput = true;

        // HEADER
        System.out.println("=============================");
        System.out.println("=   SEMINAR REGISTRATION    =");
        System.out.println("=============================\n");

        // DISPLAY TABLE
        System.out.println(" No. of Registrants  |   Fee per Person");
        System.out.println("---------------------|------------------");
        System.out.println("      1 - 4          |      500.00");
        System.out.println("      5 - 10         |      400.00");
        System.out.println("     11 or more      |      300.00\n");
        
        // INPUT 
        System.out.print("Enter number of registrants:\n> ");
        noOfRegistrants = scanner.nextInt();

        // PROCESSING
        if (noOfRegistrants < 1) {
            System.out.println("\nError. Invalid amount of registrants");
            displayOutput = false;
        }
        else if (noOfRegistrants >= 1 && noOfRegistrants <= 4) feePerPerson = 500;
        else if (noOfRegistrants >= 5 && noOfRegistrants <= 10) feePerPerson = 400;
        else feePerPerson = 300;
        totalAmount = noOfRegistrants * feePerPerson;

        // OUTPUT
        if (displayOutput) {
            System.out.printf("\nFee per person: %.2f", feePerPerson);
            System.out.printf("\nTotal amount: %.2f\n", totalAmount);
        }

        // FOOTER
        System.out.println("\n=============================");
        System.out.println("PROGRAMMER: CUENZA, RICKY S.");
        System.out.println("=============================");

        scanner.close(); // Close the scanner to prevent resource leaks
    }
}
