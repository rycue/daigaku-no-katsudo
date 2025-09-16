package Activity_3;

import java.util.Scanner;

public class ACT3Q05A03 {
    public static void main(String[] args) {

        // INSTANCES
        Scanner scanner = new Scanner(System.in);

        // VARIABLES
        int wholeNumber1, wholeNumber2;
        float number1, number2;
        String word1, word2, lineOfText;

        // HEADER
        System.out.println("=============================");
        System.out.println("TITLE: TYPE ANYTHING");
        System.out.println("=============================\n");

        // INPUT & OUTPUT:
            // > > > enter two whole numbers.
            System.out.print("Enter the whole numbers\nseperated by a space:\n> ");
            wholeNumber1 = scanner.nextInt();
            wholeNumber2 = scanner.nextInt();
            System.out.println("You entered " + wholeNumber1 + " and " + wholeNumber2 + ".");

            // > > > enter two whatever numbers.
            System.out.print("Next enter two numbers\nA decimal point is OK.\n> ");
            number1 = scanner.nextFloat();
            number2 = scanner.nextFloat();
            System.out.println("You entered " + number1 + " and " + number2 + ".");

            // > > > enter two words.
            System.out.print("Next enter two words:\n> ");
            word1 = scanner.next();
            word2 = scanner.nextLine();
            System.out.println("You entered \"" + word1 + "\" and \"" + word2 + "\"");

            // > > > enter a line of text.
            System.out.print("Next enter a line of text:\n> ");
            lineOfText = scanner.nextLine();
            System.out.println("You entered: \"" + lineOfText + "\"");

        // FOOTER
        System.out.println("\n=============================");
        System.out.println("PROGRAMMER: CUENZA, RICKY S.");
        System.out.println("=============================");

        scanner.close(); // Close the scanner to prevent resource leaks

    }
}