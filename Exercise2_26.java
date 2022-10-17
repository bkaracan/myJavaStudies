/*************************************************************************************
 * Exercise 2_26 is on page 117.
 * 
 * Write an application that reads two integer 
 * 
 * and determines and prints whether it's divisible by 3 or not.
 * 
 * @author Burak Karacan
 *
 ************************************************************************************/

import java.util.Scanner;

public class Exercise2_26 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the first value : ");
		
		int firstValue = input.nextInt();
		
		System.out.print("Enter the second value : ");
		
		int secondValue = input.nextInt();
		
		if((firstValue * 3) % (secondValue * 2) == 0) {
			
			System.out.print("Multiple");
		}
		
		else {
			
			System.out.print("Not multiple");
		}
	}

}
