import java.util.Scanner;

public class ACTIVITY7 {
    public static void main(String[] args) {

        // HEADER - - - - - - - - - - - - - - - - - - - - - - - - - - - //
        System.out.println("=========================================");
        System.out.println("=            BMR CALCULATOR             =");
        System.out.println("=========================================\n");
        
        // INSTANCE - - - - - - - - - - - - - - - - - - - - - - - - - - - //
        Scanner scanner = new Scanner(System.in);


        // VARIABLES - - - - - - - - - - - - - - - - - - - - - - - - - - //
        String[] name = new String[4];

        int[]
            age = new int[4],
            lifestyleNo = new int[4];

        double[]
            weightInPounds = new double[4],
            heightInInches = new double[4],
            lifestyleModifier = new double[4],
            BMR = new double[4],
            newBMR = new double[4];

        char[] gender = new char[4];

        boolean invalidInput = false;

        char response;


        for (int i = 0; i < 4; i++) {

            // INPUT - - - - - - - - - - - - - - - - - - - - - - - - - - - - //
            System.out.print("ENTER YOUR NAME:\n> ");
            name[i] = scanner.nextLine();

            System.out.print("\nENTER YOUR AGE:\n> ");
            age[i] = scanner.nextInt();
            scanner.nextLine();

            System.out.print("\nENTER YOUR WEIGHT (In pounds):\n> ");
            weightInPounds[i] = scanner.nextDouble();

            System.out.print("\nENTER YOUR HEIGHT (In inches):\n> ");
            heightInInches[i] = scanner.nextDouble();

            System.out.print("\nENTER YOUR GENDER (M or F):\n> ");
            gender[i] = scanner.next().toUpperCase().charAt(0);


            // PROCESS - - - - - - - - - - - - - - - - - - - - - - - - - - - - //
            if (gender[i] == 'F')
                BMR[i] = 655 + (4.3 * weightInPounds[i])
                        + (4.7 * heightInInches[i])
                        - (4.7 * age[i]);
            else if (gender[i] == 'M')
                BMR[i] = 660 + (6.3 * weightInPounds[i])
                        + (12.9 * heightInInches[i])
                        - (6.8 * age[i]);
            else {
                System.out.println("\n(Invalid input. Please, restart)");
                BMR[i] = 0.0;
                invalidInput = true;
                break;
            }

            
            if (!invalidInput) {

                // OUPUT - - - - - - - - - - - - - - - - - - - - - - - - - - - - //
                System.out.printf("\n    - -     YOUR BMR IS  %.2f     - -\n", BMR[i]);


                // INPUT II - - - - - - - - - - - - - - - - - - - - - - - - - - - //
                System.out.println("\nENTER YOUR LIFESTYLE:");
                System.out.println("\t1. SEDENTARY (SOMEWHAT INACTIVE)");
                System.out.println("\t2. SOMEWHAT ACTIVE (EXERCISE OCCASIONALLY)");
                System.out.println("\t3. ACTIVE (EXERCISE 3-4 DAYS A WEEK)");
                System.out.println("\t4. HIGHLY ACTIVE (EXERCISE EVERYDAY)");
                System.out.print("> ");
                lifestyleNo[i] = scanner.nextInt();
                

                // PROCESS II - - - - - - - - - - - - - - - - - - - - - - - - - - //
                switch (lifestyleNo[i]) {
                    case 1:
                        lifestyleModifier[i] = 0.2;
                        break;
                    case 2:
                        lifestyleModifier[i] = 0.3;
                        break;
                    case 3:
                        lifestyleModifier[i] = 0.4;
                        break;
                    case 4:
                        lifestyleModifier[i] = 0.5;
                        break;
                    default:
                        lifestyleModifier[i] = 0.0;
                        System.out.println("\n(Invalid input. Please, restart)");
                        invalidInput = true;
                }
                newBMR[i] = BMR[i] + (BMR[i] * lifestyleModifier[i]);

                // OUPUT II - - - - - - - - - - - - - - - - - - - - - - - - - - - //
                if (!invalidInput) System.out.printf("\n    - -     YOUR NEW BMR IS" +
                    "   %.2f   - -\n", newBMR[i]);


                // INPUT III
                if (i < 3) {
                    System.out.print("\nInput more? (Y / N):\n> ");
                    response = scanner.next().toUpperCase().charAt(0);
                    if (response != 'Y') break;
                }

                
                // "NEW ENTRY"
                System.out.println("\n- - - - - - - - - - - - - - - - - - - - -\n");
                scanner.nextLine();
            }            
        }
        

        // FOOTER - - - - - - - - - - - - - - - - - - - - - - - - - - -  - //
        System.out.println("\n=========================================");
        System.out.println("PROGRAMMER: Cuenza, Ricky S.");
        System.out.println("=========================================");
        scanner.close();
    }
}
