/*************************************************************************************
 * This program calculates the product of 3 integers that read from user.
 *  
 *  Exercise 2.5 / it's on page 115.
 * 
 * @author Burak Karacan
 *
 ************************************************************************************/

import java.util.Scanner;

public class Exercise2_5 {

	public static void main(String[] args) {
		
		// Reading the values from user phase
		
		try (Scanner input = new Scanner(System.in)) {
			
		// Defining the variables phase	
			
			System.out.print("ENTER THE 1st INTEGER : ");
			
			int x = input.nextInt();
			
			System.out.print("ENTER THE 2nd INTEGER : ");
			
			int y = input.nextInt();
			
			System.out.print("ENTER THE 3rd INTEGER : ");
			
			int z = input.nextInt();
			
			// Defining the result phase
			
			int product = x * y * z;
			
			// Print phase
			
			System.out.printf("Product is = %d", product);
		}

	}

}
