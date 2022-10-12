/*************************************************************************************
 * Lets get some practice in printf format.
 *  
 *  Exercise 2.10 / it's on page 115.
 *  
 *  The program includes Exercise 2.13!
 * 
 * @author Burak Karacan
 *
 ************************************************************************************/
public class Exercise2_10 {

	public static void main(String[] args) {
		
		int x = 5;
		
		int y = 1;
		
		int p = 5;
		
		System.out.printf("x = %d\n\n", x + 5); 		// prints "x = 10"
		
		 System.out.printf("Value of %d * %d is %d\n\n", x, y, (x * y));			// prints "Value of 5 * 1 is 5"
		 
		 System.out.printf("%d is not equal to %d\n\n", (x + y), (x * y));		// prints "6 is not equal to 5"
		 
		 System.out.printf("%d\n\n", p + 2 * 4);			// prints "13"
		 
		 System.out.printf("%d", p * 2 + 4);			// prints "14"
		
	}

}
