/*************************************************************************************
 * Exercise 2_15 is on page 116.
 * 
 * Write an application that asks the user to enter two integers, obtains them 
 * 
 * from the user and prints the square of each, the sum of their squares, and 
 * 
 * the difference of the squares (first number squared minus the second number squared).
 * 
 * @author Burak Karacan
 *
 ************************************************************************************/

import java.util.Scanner;

public class Exercise2_15 {

	public static void main(String[] args) {
		
		try (Scanner input = new Scanner (System.in)) {
			System.out.print("ENTER THE 1st INTEGER : ");
			
			int firstInteger = input.nextInt();
			
			System.out.print("ENTER THE 2nd INTEGER : ");
			
			int secondInteger = input.nextInt();
			
			System.out.println();
			
			System.out.printf( "THE SQUARE OF 1st INTEGER is = %d\n\nTHE SQUARE OF 2nd INTEGER is = %d\n\n", 
					
								firstInteger * firstInteger, secondInteger * secondInteger );
			
			System.out.printf("THE SUM OF SQUARES OF THE INTEGERS is = %d\n\n", 
					
					(firstInteger * firstInteger) + (secondInteger * secondInteger));
			
			System.out.printf("THE DIFFERENCE OF SQUARES OF THE INTEGERS is = %d",
					
					(firstInteger * firstInteger) - (secondInteger * secondInteger));
		}

	}

}
