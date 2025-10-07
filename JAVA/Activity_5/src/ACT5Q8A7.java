import java.util.Scanner;

public class ACT5Q8A7 {
    public static void main(String[] args) {

        // HEADER
        System.out.println("=============================");
        System.out.println("=   LOOPED SUM CALCULATOR   =");
        System.out.println("=============================\n");

        // INSTANCE
        Scanner scanner = new Scanner(System.in);

        // VARIABLE
        int sum = 0;
        char response = 'N';
            
        do {
            // INPUT & PROCESS
            sum = 0;
            System.out.print("Enter two numbers (separated with a space):\n> ");
            sum += scanner.nextInt();
            sum += scanner.nextInt();

            // OUTPUT
            System.out.println("\nSum: " + sum);
            System.out.print("\nDo you wish to operate again? (Y or N)\n> ");

            // INPUT & PROCESS: Loop Continuation
            response = scanner.next().charAt(0);
            if (response == 'N' || response == 'n') break;
            else System.out.println("\n-----------------------------\n");
        } while (true);
        
        // FOOTER
        System.out.println("\n=============================");
        System.out.println("PROGRAMMER: CUENZA, RICKY S.");
        System.out.println("=============================");

        scanner.close(); // close scanner to prevent memory leak
    }
}
