/*********************************************************************************************
 * Exercise 3.6 is on 155. page
 * 
 * Combine the statements that you wrote in Exercise 3.5 into a Java application that calculates 
 * 
 * and prints the sum of the integers from 1 to 10. Use a while statement to loop through the 
 * 
 * calculation and increment statements. The loop should terminate when the value of x becomes 11.
 
 * @author Burak Karacan
 
 *
 ***********************************************************************************************/
public class Exercise3_6 {

	public static void main(String[] args) {
		
		int sum = 0;
		
		int x = 1;
		
		while(x <= 10) {
			
			sum += x;
			
			x++;
		}
		
		System.out.println("The total value of numbers between 1 and 10 equals = " + sum);

	}

}
