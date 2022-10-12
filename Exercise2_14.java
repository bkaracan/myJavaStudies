/*************************************************************************************
 * Exercise 2_14 is on page 116.
 * 
 * Write an application that displays the numbers 1 to 4 on the same line, 
 * 
 * with each pair of adjacent numbers separated by one space. 
 * 
 * @author Burak Karacan
 *
 ************************************************************************************/
public class Exercise2_14 {

	public static void main(String[] args) {
		
		System.out.println("12\s23\s34");
		
		System.out.print("12\s");
		
		System.out.print("23\s");
		
		System.out.print("34\s");
		
		System.out.print("\n");
		
		System.out.printf("%d%d\s%d%d\s%d%d", 1, 2, 2, 3, 3, 4);
	}

}
