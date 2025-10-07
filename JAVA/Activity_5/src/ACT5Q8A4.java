import java.util.Scanner;

public class ACT5Q8A4 {
    public static void main(String[] args) {

        // HEADER
        System.out.println("=============================");
        System.out.println("=   SUM OF EVEN AND ODD     =");
        System.out.println("=============================\n");
        
        // INSTANCES
        Scanner scanner = new Scanner(System.in);

        // VARIABLES
        int setCount = 0, inputNum = 0, sumEven = 0, sumOdd = 0;
        

        // INPUT
        System.out.print("\nHow many set of integers?\n> ");
        setCount = scanner.nextInt();
        System.out.print("\nEnter " + setCount + " numbers:\n> ");

        // PROCESS
        for (int i = 0; i < setCount; i++) {
            inputNum = scanner.nextInt();
            if (inputNum % 2 == 0) sumEven += inputNum;
            else sumOdd += inputNum;
        }

        // OUTPUT
        System.out.println("\nSum of Even: " + sumEven);
        System.out.println("Sum of Odd: " + sumOdd);        
        
        // FOOTER
        System.out.println("\n=============================");
        System.out.println("PROGRAMMER: CUENZA, RICKY S.");
        System.out.println("=============================");

        scanner.close(); // close scanner to prevent memory leak
    }
}
