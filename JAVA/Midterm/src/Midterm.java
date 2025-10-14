import java.util.Scanner;

public class Midterm {
    public static void main(String[] args) {

        // HEADER
        System.out.println("================================");
        System.out.println("= END OF YEAR BONUS CALCULATOR =");
        System.out.println("================================\n");

        // INSTANCES
        Scanner scanner = new Scanner(System.in);

        // DECLARATION AND INITIALIZATION
        double employeeSalary, employeeBonus = 0.0;
        int employeRating;

        // INPUT
        System.out.print("EMPLOYEE NAME:\n> ");
        scanner.nextLine();
        System.out.print("EMPLOYEE SALARY:\n> $");
        employeeSalary = scanner.nextDouble();
        System.out.print("EMPLOYEE RATING:\n> ");
        employeRating = scanner.nextInt();
            
        // PROCESS AND OUTPUT
        switch (employeRating) {
            case 1:
                employeeBonus = (employeeSalary * 0.25);
                break;
            case 2:
                employeeBonus = (employeeSalary * 0.15);   
                break;
            case 3:
                employeeBonus = (employeeSalary * 0.10);    
                break;
        }

        if ( !(employeRating > 3) ) System.out.println("\nEMPLOYEE BONUS: $" + employeeBonus);
        else System.out.println("EMPLOYEE BONUS: None");
        ]
        
        
        // FOOTER
        System.out.println("\n================================");
        System.out.println("PROGRAMMER: CUENZA, RICKY S.");
        System.out.println("================================");

        scanner.close();
    }
}
