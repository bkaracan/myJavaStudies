/*************************************************************************************
 * Exercise 2_33 is on page 118.
 * 
 * Create a BMI calculator that reads the user’s weight in pounds and height in inches 
 * 
 * (or, if you prefer, the user’s weight in kilograms and height in meters), 
 * 
 * then calculates and displays the user’s body mass index. Also, display the BMI categories 
 * 
 * and their values from the National Heart Lung and Blood Institute
 * 
 * @author Burak Karacan
 *
 ************************************************************************************/
import java.util.Scanner;

public class Exercise2_33 {

	public static void main(String[] args) {
		
		try (Scanner input = new Scanner (System.in)) {
			System.out.print("Enter your weight (kg) : ");
			
			double userWeight = input.nextDouble();
			
			System.out.println();
			
			System.out.print("Enter your height (m) : ");
			
			double userHeight = input.nextDouble();
			
			double bodyMassIndex = userWeight / (userHeight * userHeight);
			
			System.out.println();
			
			System.out.println("Your BMI = " + bodyMassIndex);
			
			System.out.println();
			
			if(bodyMassIndex < 18.5) {
				
				System.out.print("You're underweight.");
			}
			
			if(bodyMassIndex >= 18.5 && bodyMassIndex <= 24.9) {
				
				System.out.println("You're normal weight.");
			}
			
			if(bodyMassIndex >= 25.0 && bodyMassIndex <= 29.9) {
				
				System.out.println("You're overweight.");
			}
			
			if(bodyMassIndex >= 30.0) {
				
				System.out.println("OBESITY !!!");
			}
		}

	}

}
