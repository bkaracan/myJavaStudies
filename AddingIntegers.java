/*************************************************************************************
 * This program read 2 integer values from keyboard
 * 
 * Then, this 2 integer values add up
 * 
 * %d ---> allows you to print integer values.
 * 
 * Finally, the total value of this 2 integers print with printf command to display. 
 *
 * @author Burak Karacan
 *
 ************************************************************************************/
import java.util.Scanner;

public class AddingIntegers {

	public static void main(String[] args) {
		
		try (Scanner input = new Scanner(System.in)) {
			System.out.print("ENTER THE 1ST VALUE : ");
			
			int firstNumber = input.nextInt();
			
			System.out.print("ENTER THE 2ND VALUE : ");
			
			int secondNumber = input.nextInt();
			
			System.out.printf("TOTAL VALUE IS = %d", (firstNumber + secondNumber));
		}

	}

}
