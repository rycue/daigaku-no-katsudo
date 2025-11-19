import java.util.Scanner;

public class ACTIVITY_6 {
    public static void main(String[] args) {
        
        // HEADER
        System.out.println("==================================");
        System.out.println("=         BMI CALCULATOR         =");
        System.out.println("==================================\n");

        // INSTANCE
        Scanner scanner = new Scanner(System.in);

        // VARIABLES
        double weightInPounds = 0, heightFeet = 0, heightInches = 0,
            weightInKilograms = 0, heightInMeters = 0, bmi = 0;
        String bmiCategory = "";
        
        // INPUT
        System.out.print("Enter your weight in pounds:\n===> ");
        weightInPounds = scanner.nextDouble();
        System.out.print("\nEnter your height in feet followed\n" +
            "by a space then additional inches:\n===> ");
        heightFeet = scanner.nextDouble();
        heightInches = scanner.nextDouble();

        // PROCESS
        weightInKilograms = weightInPounds / 2.2; // convert lb into kg
        
        heightInches = (heightFeet * 12) + heightInches; // convert ft into in
        heightInMeters = heightInches * 0.0254; // convert in into m

        bmi = weightInKilograms / (heightInMeters * heightInMeters); // calculate the BMI

        if (bmi < 18.5) bmiCategory = "Underweight";
        else if (bmi < 25) bmiCategory = "Normal weight";
        else if (bmi < 30) bmiCategory = "Overweight";
        else if (bmi >= 30) bmiCategory = "Obese";

        // OUTPUT
        System.out.println("\nYour BMI is " + bmi);
        System.out.println("Your risk category is " + bmiCategory);
    
        // FOOTER
        System.out.println("\n==================================");
        System.out.println("PROGRAMMER: CUENZA, RICKY S.");
        System.out.println("==================================");

        scanner.close();
    }
}
