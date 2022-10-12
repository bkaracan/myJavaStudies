/*************************************************************************************
 * Lets get some practice in printf format.
 *  
 *  Exercise 2.10 / it's on page 115.
 * 
 * @author Burak Karacan
 *
 ************************************************************************************/
public class Exercise2_10 {

	public static void main(String[] args) {
		
		int x = 5;
		
		int y = 1;
		
		System.out.printf("x = %d\n", x + 5); 		// prints "x = 10"
		
		 System.out.printf("Value of %d * %d is %d\n", x, y, (x * y));			// prints "Value of 5 * 1 is 5"
		 
		 System.out.printf("%d is not equal to %d\n", (x + y), (x * y));		// prints "6 is not equal to 5"
		
	}

}
