package Activity_2;

public class ACT2Q10A03 {
    public static void main(String[] args) {

        // HEADER
        System.out.println("===================================");
        System.out.println("= WORKER'S GROSS PAY CALCULATOR  =");
        System.out.println("===================================\n");

        // VARIABLES
        String workerName = "Juan Dela Cruz";
        double hoursWorked = 40;
        double hourlyRate = 215.75;
        double grossPay = hoursWorked * hourlyRate;
        
        // OUTPUT
        System.out.println("Worker Name: " + workerName);
        System.out.println("Hours Worked: " + hoursWorked);
        System.out.println("Hourly Rate: " + hourlyRate);
        System.out.println("Gross Pay: " + grossPay);

        // FOOTER
        System.out.println("\n===================================");
        System.out.println("PROGRAMMER: CUENZA, RICKY S.");
        System.out.println("===================================");
        
    }
}