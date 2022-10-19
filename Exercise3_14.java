/*********************************************************************************************
 * Exercise 3.14 is on 157. page
 * 
 * If integers x and y are set to 7 and 3, what is the value of x after x = y++ and x = ++y?
 
 * @author Burak Karacan
 
 *
 ***********************************************************************************************/
public class Exercise3_14 {

	public static void main(String[] args) {
		
		int x = 7;
		
		int y = 3;
		
		x = y++; // x = 3 and y = 4 after this process.
		
		x = ++y; // x = 5 and y = 5 after this process.
		
		System.out.println("The value of x = " + x);
		
		System.out.println("The value of y = " + y);

	}

}
