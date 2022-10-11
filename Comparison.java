/*************************************************************************************
 * This program compares 2 integer values that reads from user with using if statement.
 * 
 * Relational and equality operators are mentioned in this code 
 * 
 * like ==, !=, <, >, <=, >=
 * 
 * Finally the results print to display with printf format.   
 * 
 * @author Burak Karacan
 *
 ************************************************************************************/

import java.util.Scanner;

public class Comparison {

	public static void main(String[] args) {
		
		try (Scanner input = new Scanner(System.in)) {
			
			System.out.print("ENTER THE 1st INTEGER : ");
			
			int firstInteger = input.nextInt();
			
			System.out.print("ENTER THE 2nd INTEGER : ");
			
			int secondInteger = input.nextInt();
			
			if(firstInteger == secondInteger) 	// is equal?
				
				
			{									
				
				System.out.printf("%d == %d%n", firstInteger, secondInteger);
				
																				}
			
			if(firstInteger != secondInteger) 	// is not equal?
				
				
			{
				
				System.out.printf("%d != %d%n", firstInteger, secondInteger);
																				}
			
			if(firstInteger < secondInteger) 	// is less than ?
				
				
			{
				
				System.out.printf("%d < %d%n", firstInteger, secondInteger);
																				}
			
			if(firstInteger > secondInteger) 	// is greater than?
				
				
			{
				
				System.out.printf("%d > %d%n", firstInteger, secondInteger);
																				}
			
			if(firstInteger <= secondInteger) 	 // is less than or equal?
				
				
			{
				
				System.out.printf("%d <= %d%n", firstInteger, secondInteger);
																				}

			if(firstInteger >= secondInteger)	 // is bigger than or equal?


			{

				System.out.printf("%d >= %d%n", firstInteger, secondInteger);
				
																				}
			
		}
		
	}

}
