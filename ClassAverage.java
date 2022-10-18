/*************************************************************************************
 * Page 132 An Algorithm Example
 * 
 *  1 Set total to zero
 *  2 Set grade counter to one
 *  3
 *  4 While grade counter is less than or equal to ten
 *  5 Prompt the user to enter the next grade
 *  6 Input the next grade
 *  7 Add the grade into the total
 *  8 Add one to the grade counter
 *  9
 *  10 Set the class average to the total divided by ten
 *  11 Print the class average
 * 
 * @author Burak Karacan
 *
 ************************************************************************************/

import java.util.Scanner;

public class ClassAverage {

	public static void main(String[] args) {
		
		double sum = 0;
		
		int counter = 1;
		
		try (Scanner input = new Scanner(System.in)) {
			
			while(counter <= 10) {
				
				System.out.print("Enter the " + counter + ". student's grade : ");
				
				double studentGrade = input.nextDouble();
				
				sum = sum + studentGrade;
				
				counter ++;
			}
			
			double average = sum / (counter - 1);
			
			System.out.println("The total grade of the students equals = " + sum);
			
			System.out.print("The average grade of the students equals =  " + average );
		}
		
	}

}
