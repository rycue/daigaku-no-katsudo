package Activity_2;

public class ACT2Q10A10 {
    public static void main(String[] args) {

        // HEADER
        System.out.println("====================================");
        System.out.println("= INTEREST CALCULATION FOR 30 DAYS =");
        System.out.println("====================================\n");

        // VARIABLES
        double moneyBank = 250000;
        float rate = 0.12f; // 12% annual rate
        float time = 30f / 365f; // approximately 8% of a year
        float withholdingTaxRate = 0.10f; // 10% withholding tax

        // DISPLAY: Info
        System.out.printf("Principal Amount: %.2f PHP\n", moneyBank);
        System.out.printf("Annual Interest Rate: %.2f%%\n", rate * 100);
        System.out.printf("Time Period: %.0f days\n\n", time * 365);

        // PROCESS: Calculate interest
        double interest = moneyBank * rate * time;

        // PROCESS: Calculate withholding tax
        double withholdingTax = interest * withholdingTaxRate;

        // PROCESS: Calculate net interest
        double netInterest = interest - withholdingTax;

        // DISPLAY: Results
        System.out.printf("Total Interest: %.2f PHP\n", interest);
        System.out.printf("Withholding Tax: %.2f PHP\n", withholdingTax);
        System.out.printf("Net Interest: %.2f PHP\n", netInterest);

        // FOOTER
        System.out.println("\n====================================");
        System.out.println("= PROGRAMMER: CUENZA, RICKY S.     =");
        System.out.println("====================================");

    }
}