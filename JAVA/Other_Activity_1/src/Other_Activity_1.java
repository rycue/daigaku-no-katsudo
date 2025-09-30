package Other_Activity_1.src;
import java.util.Scanner;

public class Other_Activity_1 {
    public static void main(String[] args) {

        // INSTANCES
        Scanner scanner = new Scanner(System.in);

        // VARIABLES
        int $noOfBagsSold;
        double pricePerPound = 5.99, salesTax = 0.0725;
        double weightPerBag = 0.0,  totalPrice = 0.0, totalPriceWithTax = 0.0, salesTaxInPercent = (salesTax * 100);

        // HEADER
        System.out.println("=======================================");
        System.out.println("=       COFFEE SALES CALCULATOR      =");
        System.out.println("=======================================\n");

        
        // INPUT
        System.out.print("NO. OF BAGS SOLD:             ");
        $noOfBagsSold = scanner.nextInt();
        System.out.print("WEIGHT PER BAG (POUNDS):      ");
        weightPerBag = scanner.nextDouble();
        
        // PROCESSING
        totalPrice = weightPerBag * $noOfBagsSold * pricePerPound;
        totalPriceWithTax = totalPrice + (totalPrice * salesTax);
        
        // OUTPUT
        System.out.println("PRICE PER POUND:              " + pricePerPound);
        System.out.printf("SALES TAX:                    %.2f", salesTaxInPercent);
        System.out.println("%");
        System.out.println("TOTAL PRICE WITH TAX:         " + totalPriceWithTax);

        // FOOTER
        System.out.println("\n=======================================");
        System.out.println("PROGRAMMER: CUENZA, RICKY S.");
        System.out.println("=======================================");

        scanner.close();
    }
}
