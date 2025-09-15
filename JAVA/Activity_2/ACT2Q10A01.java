package Activity_2;

import java.util.Scanner;

public class ACT2Q10A01 {
    public static void main(String[] args) {

        // INSTANCES
        Scanner scanner = new Scanner(System.in);
        
        // VARIABLES
        float dollarToPeso = 50.75f;

        // HEADER
        System.out.println("=============================");
        System.out.println("= DOLLAR TO PESO CONVERTER  =");
        System.out.println("=============================\n");
        
        // INPUT & OUTPUT
        System.out.println("(Enter amount in USD)");
        System.out.print("> ");
        float inputDollars = scanner.nextFloat();
        float outputPesos = inputDollars * dollarToPeso;
        System.out.println("\n" + inputDollars + " USD is equivalent to " + outputPesos + " PHP.");

        // FOOTER
        System.out.println("\n=============================");
        System.out.println("PROGRAMMER: CUENZA, RICKY S.");
        System.out.println("=============================");

        scanner.close(); // Close the scanner to prevent resource leaks
        
    }
}