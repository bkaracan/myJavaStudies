/*************************************************************************************
 * Fig. 3.10: Analysis.java
 * 
 * Page 145.
 * 
 * Analysis of examination results using nested control statements.
 * 
 1 Initialize passes to zero
 * 
 2 Initialize failures to zero
 
 3 Initialize student counter to one
 
 4
 
 5 While student counter is less than or equal to 10
 
 6 Prompt the user to enter the next exam result
 
 7 Input the next exam result
 8
 9 If the student passed
 
 10 Add one to passes
 
 11 Else
 
 12 Add one to failures
 13
 14 Add one to student counter
 15
 16 Print the number of passes
 
 17 Print the number of failures
 
 18
 
 19 If more than eight students passed 
 
 20 Print “Bonus to instructor!”
 * 
 * @author Burak Karacan
 *
 ************************************************************************************/

import java.util.Scanner;

public class Analysis {

	public static void main(String[] args) {
		
		int failureCounter = 0;
		
		int passedCounter = 0;
		
		int studentCounter = 1;
		
		Scanner input = new Scanner (System.in);
		
		while(studentCounter <= 10) {
			
			System.out.print("Enter the exam result of the " + studentCounter + " . student ( passed(1) / failure(0) ) : ");
			
			int examResult = input.nextInt();
			
			if(examResult == 1) {
				
				passedCounter ++;
			}
			
			else {
				
				failureCounter ++;
			}
			
			studentCounter ++;
		}
		
		System.out.println();
		
		System.out.println("The number of the students who passed the exam is equals = " + passedCounter);
		
		System.out.println();
		
		System.out.println("The number of the students who failed the exam is equals = " + failureCounter);
		
		if(passedCounter > 8) {
			
			System.out.println();
			
			System.out.println("Bonus to instructor!");
		}
		
		
		
	}

}
