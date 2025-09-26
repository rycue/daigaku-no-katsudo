import java.util.Scanner;

public class ACT4Q10A03 {
    public static void main(String[] args) {

        // INSTANCES
        Scanner scanner = new Scanner(System.in);

        // VARIABLES
        int num;

        // HEADER
        System.out.println("=============================");
        System.out.println("=   MONTH NAME FINDER       =");
        System.out.println("=============================\n");

        // INPUT
        System.out.print("Enter a number (1-12): ");
        num = scanner.nextInt();

        // PROCESSING & OUTPUT
        System.out.print("Month: ");
        switch (num) {
            case 1:  System.out.println("January"); break;
            case 2:  System.out.println("February"); break;
            case 3:  System.out.println("March"); break;
            case 4:  System.out.println("April"); break;
            case 5:  System.out.println("May"); break;
            case 6:  System.out.println("June"); break;
            case 7:  System.out.println("July"); break;
            case 8:  System.out.println("August"); break;
            case 9:  System.out.println("September"); break;
            case 10: System.out.println("October"); break;
            case 11: System.out.println("November"); break;
            case 12: System.out.println("December"); break;
            default: System.out.println("Invalid input! Please enter a number from 1 to 12.");
        }

        // FOOTER
        System.out.println("\n=============================");
        System.out.println("PROGRAMMER: CUENZA, RICKY S.");
        System.out.println("=============================");

        scanner.close(); // Close the scanner to prevent resource leaks
    }
}
