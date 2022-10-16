/*************************************************************************************
 * Exercise 2_24 is on page 117.
 * 
 * Write an application that prompts the user 5 integer value, 
 * 
 * find the maximum and minimum values,
 * 
 * finally print them.
 * 
 * @author Burak Karacan
 *
 ************************************************************************************/


import java.util.Scanner;

public class Exercise2_24 {

	public static void main(String[] args) {
		
		try (Scanner input = new Scanner (System.in)) {
			int theArray[] = new int[5];
			int tempMax = -2147483648;
			int tempMin =  2147483647;
			
			for(int i = 0; i < theArray.length; i++) {
				
				System.out.print("Enter the" + " " + (i+1) + ". value : ");
				
				int userValue = input.nextInt();
				
				theArray[i] = userValue;
				
			}
			
			for(int i = 0; i < theArray.length; i++) {
				
				if(theArray[i] > tempMax) {
					
					tempMax = theArray[i];
				}
			}
			
			System.out.print("The maximum value is = " + tempMax);
			
			for(int i = 0; i < theArray.length; i++) {
				
				if(theArray[i] < tempMin) {
					
					tempMin = theArray[i];
				}
			}
			
			System.out.print("The minimum value is = " + tempMin);
			
		}

	}

}
