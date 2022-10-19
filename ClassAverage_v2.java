/*************************************************************************
 * 
 * 
 * 
 * 	1 Initialize total to zero
 *	2 Initialize counter to zero
 *	3
 *	4 Prompt the user to enter the first grade
 *	5 Input the first grade (possibly the sentinel)
 *	6
 *	7 While the user has not yet entered the sentinel
 *	8 Add this grade into the running total
 *	9 Add one to the grade counter
 *	10 Prompt the user to enter the next grade
 *	11 Input the next grade (possibly the sentinel)
 *	12
 *	13 If the counter is not equal to zero
 *	14 Set the average to the total divided by the counter
 *	15 Print the average
 *	16 Else
 *	17 Print “No grades were entered”
 * 
 * @author burak
 *
 *****************************************************************************/
// Fig. 3.8: ClassAverage.java
 // Solving the class-average problem using sentinel-controlled iteration. 

import java.util.Scanner;

public class ClassAverage_v2 {
	
	public static void main(String[] args) {
		
		int sumOfGrades = 0;
		
		double avgOfGrades = 0;
		
		int gradeCounter = 0;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the grade or press -1 to exit : ");
		
		int studentGrade = input.nextInt();
		
		while(studentGrade != -1) {
			
			sumOfGrades = sumOfGrades + studentGrade;
			
			gradeCounter ++;
			
			System.out.print("Enter grade or press -1 to quit : ");
			
			studentGrade = input.nextInt();
		}
		
		if (gradeCounter != 0) {
			
			avgOfGrades = (double) (sumOfGrades / gradeCounter);
			
			System.out.printf("%nTotal of the %d grades entered is %d%n",  gradeCounter, sumOfGrades);
			
			System.out.printf("Class average is %.2f%n", avgOfGrades);
		}
		
		else {
			
			System.out.println("No grades were entered.");
		}
		
	
	}
}
