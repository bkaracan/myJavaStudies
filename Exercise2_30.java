/*************************************************************************************
 * (Separating the Digits in an Integer) Write an application that inputs one number 
 * 
 * consisting of five digits from the user, separates the number into its individual 
 * 
 * digits and prints the digitsseparated from one another by three spaces each. 
 * 
 * @author Burak Karacan
 *
 ************************************************************************************/

import java.util.Scanner;

public class Exercise2_30 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		
		System.out.println("Enter the integer value : ");
		
		int userValue = input.nextInt();
		
		int firstDigit = 0;
		
		int secondDigit = 0;
		
		int thirdDigit = 0;
		
		int fourthDigit = 0;
		
		int fifthDigit = 0;
		
		if(userValue >= 10000 && userValue <= 99999) {
			
			firstDigit = userValue % 10;
			
			userValue = userValue / 10;
			
			secondDigit = userValue % 10;
			
			userValue = userValue / 10;
			
			thirdDigit = userValue % 10;
			
			userValue = userValue / 10;
			
			fourthDigit = userValue % 10;
			
			userValue = userValue / 10;
			
			fifthDigit = userValue % 10;
			
			userValue = userValue / 10;
			
			System.out.println(fifthDigit + "   " + fourthDigit + "   " + thirdDigit + "   " + secondDigit + "   " + firstDigit);
			
		}
		
		else {
			
			System.out.print("Error! Invalid value, please enter a 5-digit value.");
		}
		
		
		
	}

}
