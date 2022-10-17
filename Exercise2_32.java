/*************************************************************************************
 * Exercise 2_32 is on page 118.
 * 
 * (Negative, Positive and Zero Values) Write a program that inputs five numbers 
 * 
 * and determines and prints the number of negative numbers input, the number of 
 * 
 * positive numbers input and the number of zeros input.
 * 
 * @author Burak Karacan
 *
 ************************************************************************************/

import java.util.Scanner;

public class Exercise2_32 {

	public static void main(String[] args) {
		
		int positiveCounter = 0;
		
		int negativeCounter = 0;
		
		int zeroCounter = 0;
		
		try (Scanner input = new Scanner (System.in)) {
			
			System.out.print("Enter the first integer :");
			
			int firstValue = input.nextInt();
			
			System.out.print("Enter the second integer : ");
			
			int secondValue = input.nextInt();
			
			System.out.print("Enter the third integer : ");
			
			int thirdValue = input.nextInt();
			
			System.out.print("Enter the fourth integer : ");
			
			int fourthValue = input.nextInt();
			
			System.out.print("Enter the fifth integer : ");
			
			int fifthValue = input.nextInt();
			
			if(firstValue > 0) {
				
				positiveCounter++;
			}
			
			if(secondValue > 0) {
				
				positiveCounter++;
				
			}

			if(thirdValue > 0) {
	
				positiveCounter++;
				
			}

			if(fourthValue > 0) {
	
				positiveCounter++;
	
			}

			if(fifthValue > 0) {
	
				positiveCounter++;
	
			}

			if(firstValue < 0) {
	
				negativeCounter++;
				
			}

			if(thirdValue < 0) {
	
				negativeCounter++;
	
			}

			if(fourthValue < 0) {
	
				negativeCounter++;
				
			}

			if(fifthValue < 0) {
	
				negativeCounter++;
				
			}
			
			if(secondValue < 0) {
	
				negativeCounter++;
				
			}

			if(firstValue == 0) {
	
				zeroCounter++;
				
			}

			if(secondValue == 0) {
				
				zeroCounter++;
	
			}

			if(thirdValue == 0) {
	
				zeroCounter++;
	
			}

			if(fourthValue == 0) {
	
				zeroCounter++;
				
			}

			if(fifthValue == 0) {

				zeroCounter++;
	
			}
			
			System.out.println();
			
			System.out.println("The number of the positive values : " + positiveCounter + "\n");
			
			System.out.println("The number of the negative values : " + negativeCounter + "\n");
			
			System.out.println("The number of the zero values : " + zeroCounter + "\n");
			
		}
		
		
		
	}

}
