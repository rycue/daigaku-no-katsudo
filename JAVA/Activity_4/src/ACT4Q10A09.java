import java.util.Scanner;

public class ACT4Q10A09 {
    public static void main(String[] args) {
        
        // INSTANCES
        Scanner scanner = new Scanner(System.in);
        
        // VARIABLES
        int productID;
        float price = 0.0f;
        boolean displayPrice = true;

        // HEADER
        System.out.println("=============================");
        System.out.println("=   PRODUCT PRICE CHECKER    =");
        System.out.println("=============================\n");

        // DISPLAY TABLE
        System.out.println(" Product ID  |   Price");
        System.out.println("-------------|-----------");
        System.out.println("     1       |   50.55");
        System.out.println("     2       |   25.75");
        System.out.println("     5       |   11.46");
        System.out.println("     7       |   11.46");
        System.out.println("     9       |   12.35");
        System.out.println("     11      |   11.46\n");

        // INPUT
        System.out.print("Enter Product ID:\n> ");
        productID = scanner.nextInt();

        // PROCESSING
        switch (productID) {
            case 1:
                price = 50.55f;
                break;
            case 2:
                price = 25.75f;
                break;
            case 5:
            case 7:
            case 11:
                price = 11.46f;
                break;
            case 9:
                price = 12.35f;
                break;
            default: displayPrice = false;
            // If product ID is not found
            System.out.println("\nProduct not found.");
        }

        // Display price if product ID is valid
        if (displayPrice) System.out.println("\nProduct Price: " + price);
            
        // FOOTER
        System.out.println("\n=============================");
        System.out.println("PROGRAMMER: CUENZA, RICKY S.");
        System.out.println("=============================");
            
        scanner.close(); // Close the scanner to prevent resource leaks
    }
}
