/*************************************************************************************
 * Exercise 2_27 is on page 117.
 * 
 * Write an application that displays 8x8 checkerboard pattern
 * 
 * @author Burak Karacan
 *
 ************************************************************************************/
public class Exercise2_27 {

	public static void main(String[] args) {
		
		for(int i = 1; i <= 8; i++) {
			
			if(i % 2 == 0) {
				
				System.out.println(" * * * * * * * *");
				
			}
			
			else
				
			System.out.println("* * * * * * * *");
			
		}
		

	}

}
