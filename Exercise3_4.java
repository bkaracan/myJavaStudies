/*********************************************************************************************
 * Exercise 3_4 is on page 155.
 * 
 *Write Java statements to accomplish each of the following tasks:
 a) Use one statement to assign the sum of x and y to z, then increment x by 1.
 b) Test whether variable count is greater than 10. If it is, print "Count is greater than 10".
 c) Use one statement to decrement the variable x by 1, then subtract it from variable total
 and store the result in variable total. 
 d) Calculate the remainder after q is divided by divisor, and assign the result to q. Write
 this statement in two different ways.
 * 
 * @author Burak Karacan
 *
 ***********************************************************************************************/
import java.util.Scanner;

public class Exercise3_4 {

	public static void main(String[] args) {
		
		try (Scanner input = new Scanner (System.in)) {
			int z;
			
			int q;
			
			int r;
			
			System.out.print("Enter the value of x : ");
			
			int x = input.nextInt();
			
			System.out.print("Enter the value of y : ");
			
			int y = input.nextInt();
			
			z = x + y;
			
			x ++;
			
			System.out.println("x = " + x);
			
			System.out.println();
			
			System.out.println("x + y  =  z  = " + z);
			
			if(z > 10) {
				
				System.out.println("The value of z is greater than 10");
			}

			else {
				
				System.out.print("The value of z is less than 10");
			}
			
			x --;
			
			z -= x;
			
			System.out.println("After assignment z equals = " + z);
			
			System.out.print("Enter the value of q : ");
			
			q = input.nextInt();
			
			System.out.print("Enter the value of r : ");
			
			r = input.nextInt();
			
			int t = q % r;
			
			System.out.println("Remainder equals = " + t);
			
			q = t;
			
			System.out.println("After assignment q equals = " + q);
		}

    }
	
}	
