/*************************************************************************************
 * Exercise 2_31 is on page 118.
 * 
 * (Table of Squares and Cubes) Using only the programming techniques you learned in 
 * 
 * this chapter, write an application that calculates the squares and cubes of the 
 * 
 * numbers from 0 to 10 and prints the resulting values in table format, as shown below.
 * 
 * @author Burak Karacan
 *
 ************************************************************************************/


public class Exercise2_31 {

	public static void main(String[] args) {
		
		System.out.println("number\tsquare\tcube");
		
		for(int i = 0; i <= 10; i++) {
			
			System.out.printf("%d\t%d\t%d\t\n", (int)Math.pow(i, 1), (int)Math.pow(i, 2), (int)Math.pow(i, 3));
			
		}

	}

}
