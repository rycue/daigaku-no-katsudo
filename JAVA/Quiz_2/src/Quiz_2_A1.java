import java.util.Scanner;

public class Quiz_2_A1 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        final double BAG_PRICE = 5.50;
        String again = "Y";

        int[] sampleBags = {20, 30, 75, 125, 175, 250};
        double[] totalCostArr = new double[sampleBags.length];
        double[] discountArr = new double[sampleBags.length];
        double[] finalChargeArr = new double[sampleBags.length];

        System.out.println("======================================");
        System.out.println("      Garden Supply Company");
        System.out.println("     Bulk Garden Soil Order Form");
        System.out.println("======================================\n");

        while (again.equalsIgnoreCase("Y")) {

            System.out.print("Enter number of bags ordered:\n> ");
            int bags = sc.nextInt();

            double totalCost = bags * BAG_PRICE;
            double discountRate = getDiscountRate(bags);
            double discount = totalCost * discountRate;
            double finalCharge = totalCost - discount;

            System.out.println();
            System.out.println("NUMBER OF BAGS ORDERED: " + bags);
            System.out.printf("TOTAL COST: $ %.2f%n", totalCost);
            System.out.printf("DISCOUNT: $ %.3f%n", discount);
            System.out.printf("\nYOUR TOTAL CHARGE IS: $ %.3f%n", finalCharge);

            System.out.print("\n\nProcess another? (Y or N): ");
            again = sc.next();
            if (again.equalsIgnoreCase("Y")) System.out.println("\n--------------------------------------\n");
        }

        System.out.println("\n--------------------------------------------------");
        System.out.println("COMPUTED TABLE OUTPUT");
        System.out.println("--------------------------------------------------");

        System.out.print("NUMBER OF BAGS ORDERED:\t");
        for (int bags : sampleBags) {
            System.out.print(bags + "\t");
        }
        System.out.println();

        System.out.print("TOTAL COST:\t\t");
        for (int i = 0; i < sampleBags.length; i++) {
            totalCostArr[i] = sampleBags[i] * BAG_PRICE;
            System.out.printf("%.2f\t", totalCostArr[i]);
        }
        System.out.println();

        System.out.print("DISCOUNT:\t\t");
        for (int i = 0; i < sampleBags.length; i++) {
            double rate = getDiscountRate(sampleBags[i]);
            discountArr[i] = totalCostArr[i] * rate;
            System.out.printf("%.3f\t", discountArr[i]);
        }
        System.out.println();

        System.out.print("YOUR TOTAL CHARGE IS:\t");
        for (int i = 0; i < sampleBags.length; i++) {
            finalChargeArr[i] = totalCostArr[i] - discountArr[i];
            System.out.printf("%.3f\t", finalChargeArr[i]);
        }
        System.out.println();

        System.out.println("\n======================================");
        System.out.println("PROGRAMMER: CUENZA, RICKY S.");
        System.out.println("======================================");

        sc.close();
    }

    public static double getDiscountRate(int bags) {
        if (bags <= 25) return 0.05;
        else if (bags <= 50) return 0.06;
        else if (bags <= 100) return 0.07;
        else if (bags <= 150) return 0.08;
        else if (bags <= 200) return 0.09;
        else return 0.10;
    }
}
