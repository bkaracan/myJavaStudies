/*********************************************************************************************
 * Exercise 3.7 is on 155. page
 * 
 * Determine the value of the variables in the statement product *= x++; after the calculation 
 * 
 * is performed. Assume that all variables are type int and initially have the value 5.
 
 * @author Burak Karacan
 
 *
 ***********************************************************************************************/

public class Exercise3_7 {

	public static void main(String[] args) {
		
		int x = 5;
		
		int y = 5;
		
		
		y *= x++;  // equals 25 because the value of x has incremented after assignment process
		
		System.out.println("The last value of x is equals = " + x);
		
		System.out.println("The result equals = " + y);

	}

}
