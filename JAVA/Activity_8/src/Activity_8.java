import java.util.Scanner;

public class Activity_8 {

    // METHOD 1: Main
    public static void main(String[] args) {

        // VARIABLES AND INSTANCES
        Scanner scanner = new Scanner(System.in);
        int[] transactionNo = new int[1];
        double[] grandTotalCharge = new double[10];

        // HEADER
        System.out.println("\tHIJK POSTAL SERVICES");
        System.out.println("\tROXAL BOULEVARD, MANILA\n");

        process(scanner, transactionNo, grandTotalCharge);

        scanner.close();
    }
    
    // METHOD 2: Interaction
    static void process(Scanner scanner,
                        int[] transactionNo,
                        double[] grandTotalCharge) {

        while (true) {
            // VARIABLES
            int cityCode = 0;
            double totalCharge = 0;
            char response;

            // UPDATE
            transactionNo[0]++;

            // INPUT
            System.out.print("CITIES: ");
            cityCode = Integer.parseInt(scanner.nextLine());

            System.out.println("\t\t\tCHARGES:");
            System.out.println("\t1 - MANILA\t\t175");
            System.out.println("\t2 - PASAY\t\t150");
            System.out.println("\t3 - QUEZON\t\t200");
            System.out.println("\t4 - TAGUIG\t\t250");
            System.out.println("\t5 - MAKATI\t\t275\n");

            // INPUT
            System.out.print("\tEXPRESS DELIVER? (Y/N): ");
            response = scanner.nextLine().toUpperCase().charAt(0);

            // PROCESS
            if (response == 'Y') totalCharge += 150;

            switch (cityCode) {
                case 1: totalCharge += 175; break;
                case 2: totalCharge += 150; break;
                case 3: totalCharge += 200; break;
                case 4: totalCharge += 250; break;
                case 5: totalCharge += 275; break;
                default:
                    System.out.println("\n-- Invalid City Code."
                                     + "Try again. --\n");
                    transactionNo[0]--;
                    continue;
            }

            grandTotalCharge[transactionNo[0] - 1] = totalCharge;

            // OUTPUT
            System.out.println("\nTOTAL CHARGE: " + totalCharge);

            // INPUT
            System.out.print("\nPROCESS ANOTHER? (Y/N): ");
            response = scanner.nextLine().toUpperCase().charAt(0);

            //  CONDITION: LOOP AGAIN
            if (response != 'Y') break;

            displayHorizontalLine();
        }

        // PROCESS
        double sum = 0;
        for (int i = 0; i < transactionNo[0]; i++) {
            sum += grandTotalCharge[i];
        }

        // OUTPUT
        displayHorizontalLine();
        System.out.println("TOTAL COLLECTION FOR THE DAY: " + sum);
        System.out.println("\nTOTAL NUMBER OF TRANSACTION: "
                            + transactionNo[0]);
        System.out.println("\nPROGRAMMER: RICKY S. CUENZA");
    }

    // Method 3: Display
    static void displayHorizontalLine() {
        System.out.println("\n- - - - - - - - - - - - - - - - - -\n");
    }
}
