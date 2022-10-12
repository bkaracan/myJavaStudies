/*************************************************************************************
 * Exercise 2_16 is on page 116.
 * 
 * (Comparing Integers) Write an application that asks the user to enter one integer, 
 * 
 * obtains it from the user and displays whether the number and its square are greater 
 * 
 * than, equal to, not equal to, or less than the number 100
 * 
 * @author Burak Karacan
 *
 ************************************************************************************/
import java.util.Scanner;

public class Exercise2_16 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		
		System.out.println("ENTER AN INTEGER : ");
		
		int userNumber = input.nextInt();
		
		
		if(userNumber > 100)
			
			
		{													
			
			System.out.println(userNumber + " is greater than 100!\n");
			
																		}
		
		if(userNumber == 100)
			
		
		{		
			
			System.out.println(userNumber + " is equal to 100!\n");
			
																		}
		
		if(userNumber != 100)
			
			
		{
			
			System.out.println(userNumber + " is not equal to 100!\n");
			
																		}
		
		if(userNumber < 100)
			
		
		{																
			
			System.out.println(userNumber + " is less than 100!\n");
			
																		}
		
		if(userNumber * userNumber > 100)
			
			
		{													
			
			System.out.println(userNumber * userNumber + " is greater than 100!\n");
			
																		}
		
		if(userNumber * userNumber == 100)
			
			
		{		
			
			System.out.println(userNumber * userNumber+ " is equal to 100!\n");
			
																		}
		
		if(userNumber * userNumber != 100)
			
			
		{
			
			System.out.println(userNumber * userNumber + " is not equal to 100!\n");
			
																		}
		
		if(userNumber * userNumber < 100)
			
			
		{																
			
			System.out.println(userNumber * userNumber + " is less than 100!\n");
			
																		}
		
		
		

	}

}
