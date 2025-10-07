public class ACT5Q8A8 {
    public static void main(String[] args) {

        // HEADER
        System.out.println("=============================");
        System.out.println("=      BOX AND PYRAMID      =");
        System.out.println("=============================\n");
        
        // PROCESS AND OUTPUT
        System.out.println("I.");
        for (int i = 0; i < 4; i++) {
            System.out.print("   ");
            for (int j = 0; j < 10; j++) System.out.print("*");
            System.out.println();;
        }

        System.out.println("\nII.");
        for (int i = 1; i <= 5; i++) {
            System.out.print("   ");
            for (int j = 0; j < i; j++) System.out.print("*");
            System.out.println();;
        }
        
        // FOOTER
        System.out.println("\n=============================");
        System.out.println("PROGRAMMER: CUENZA, RICKY S.");
        System.out.println("=============================");
    }
}
