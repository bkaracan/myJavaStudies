/*************************************************************************************
 * Exercise 2_17 is on page 116.
 * 
 * 	(Arithmetic, Smallest and Largest) Write an application that inputs three integers 
 * 	from the user and displays the sum, average, product, smallest and largest 
 *  of the numbers. [Note: The calculation of the average in this exercise should result 
 *  in an integer representation of the average. So, if the sum of the values is 7, the 
 *  average should be 2, not 2.3333….]
 * 
 * @author Burak Karacan
 *
 ************************************************************************************/
import java.util.Scanner;

public class Exercise2_17 {

	public static void main(String[] args) {
			
		try (Scanner input = new Scanner (System.in)) {
			System.out.print("ENTER THE 1st INTEGER : ");
			
			// Reading values from user phase...
			
			int firstInteger = input.nextInt();
			
			System.out.print("ENTER THE 2nd INTEGER : ");
			
			int secondInteger = input.nextInt();
			
			System.out.print("ENTER THE 3rd INTEGER : ");
			
			int thirdInteger = input.nextInt();
			
			int sumOfTheValues = firstInteger + secondInteger + thirdInteger;
			
			int avgOfTheValues = (firstInteger + secondInteger + thirdInteger) / 3;
			
			int productOfTheValues = firstInteger * secondInteger * thirdInteger;
			
			System.out.println("THE SUM OF THE VALUES = " + sumOfTheValues + "\n");
			
			System.out.println("THE AVG OF THE VALUES = " + avgOfTheValues + "\n");
			
			System.out.println("THE PRODUCT OF THE VALUES = " + productOfTheValues + "\n");
			
			
			if(firstInteger > secondInteger && secondInteger > thirdInteger)
				
				
			{
				
				System.out.println("THE LARGEST VALUE IS = " + firstInteger + "\n");
				
				System.out.println("THE SMALLEST VALUE IS = " + thirdInteger + "\n");
			
																					}
			
			if(secondInteger > firstInteger && firstInteger > thirdInteger)
				
				
			{
				
				System.out.println("THE LARGEST VALUE IS = " + secondInteger + "\n");
				
				System.out.println("THE SMALLEST VALUE IS = " + thirdInteger + "\n");
																					}
			
			
			if(thirdInteger > secondInteger && secondInteger > firstInteger)
				
				
			{
				
				System.out.println("THE LARGEST VALUE IS = " + thirdInteger + "\n");
				
				System.out.println("THE SMALLEST VALUE IS = " + firstInteger + "\n");
																					}
			
			
			if(thirdInteger > firstInteger && firstInteger > secondInteger)
				
				
			{
				
				System.out.println("THE LARGEST VALUE IS = " + thirdInteger + "\n");
				
				System.out.println("THE SMALLEST VALUE IS = " + secondInteger + "\n");
																					}
			
			if(firstInteger > thirdInteger && thirdInteger > secondInteger)
				
				
			{
				
				System.out.println("THE LARGEST VALUE IS = " + firstInteger + "\n");
				
				System.out.println("THE SMALLEST VALUE IS = " + secondInteger + "\n");
																					}
			
			if(secondInteger > firstInteger && thirdInteger > firstInteger)
				
				
			{
				
				System.out.println("THE LARGEST VALUE IS = " + secondInteger + "\n");
				
				System.out.println("THE SMALLEST VALUE IS = " + firstInteger + "\n");
																					}
		}
		
		

	}

}
