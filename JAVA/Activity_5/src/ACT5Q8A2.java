public class ACT5Q8A2 {
    public static void main(String[] args) {

        // HEADER
        System.out.println("=============================");
        System.out.println("=  SUM OF 1ST 10 NATURALS   =");
        System.out.println("=============================\n");
        
        // VARIABLES
        int sum = 0;

        // PROCESS AND OUTPUT
        for (int i = 1; i <= 10; i++) {
            System.out.print(i);
            if (i < 10) System.out.print(" + ");
            sum += i;
            if (i == 5) System.out.println();
        }
        System.out.println("\n= " + sum);
        
        // FOOTER
        System.out.println("\n=============================");
        System.out.println("PROGRAMMER: CUENZA, RICKY S.");
        System.out.println("=============================");

    }
}
