import java.util.Scanner;

public class ACT4Q10A02 {
    public static void main(String[] args) {
        
        // HEADER
        System.out.println("=============================");
        System.out.println("=   DIVISIBLE BY 5 CHECK    =");
        System.out.println("=============================\n");
        
        // INPUT & OUTPUT
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        if (num % 5 == 0) {
            System.out.println("DIVISIBLE");
        } else {
            System.out.println("NOT DIVISIBLE");
        }

        // FOOTER
        System.out.println("\n=============================");
        System.out.println("PROGRAMMER: CUENZA, RICKY S.");
        System.out.println("=============================");

        scanner.close(); // Close the scanner to prevent resource leaks
    }
}
