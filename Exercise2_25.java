/*************************************************************************************
 * Exercise 2_25 is on page 117.
 * 
 * Write an application that reads an integer 
 * 
 * and determines and prints whether it's divisible by 3 or not.
 * 
 * @author Burak Karacan
 *
 ************************************************************************************/
import java.util.Scanner;

public class Exercise2_25 {

	public static void main(String[] args) {
		
		try (Scanner input = new Scanner (System.in)) {
			int userValue;
			
			System.out.print("Enter an integer value : ");
			
			if((userValue = input.nextInt()) % 3 == 0) {
				
				System.out.print(userValue + " " + "is divisible by 3 !");
			}
			
			else {
				
				System.out.print(userValue + " " + "is not divisible by 3!");
			}
		}

	}

}
