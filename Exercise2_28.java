/*************************************************************************************
 * Exercise 2_28 is on page 117.
 * 
 * Write an application that reads from  Write an application that inputs from the user 
 * 
 * the radius of a circle as an integer and prints the circle’s diameter, circumference 
 * 
 * and area using the floating-point value 3.14159 for π. 
 * 
 * Do not store the results of each calculation in a variable. Rather, specify each 
 * 
 * calculation as the value that will be output in a System.out.printf statement. 
 * 
 * The values produced by the circumference and area calculations are floating-point numbers. 
 * 
 * Such values can be output with the format specifier %f in a System.out.printf statement.
 * 
 * @author Burak Karacan
 *
 ************************************************************************************/

import java.util.Scanner;

public class Exercise2_28 {

	public static void main(String[] args) {
		
		try (Scanner input = new Scanner (System.in)) {
			System.out.print("Enter the radius of the circle : ");
			
			double radiusValue = input.nextDouble();
			
			System.out.println();
			
			System.out.printf("Diameter :\s%f\n\nCircumference :\s%f\n\nArea :\s%f", (2 * radiusValue), (2 * Math.PI * radiusValue), 
					
			(Math.PI * radiusValue * radiusValue));
		}
		
	}

}
