/*************************************************************************************
 * Exercise 2_29 is on page 117.
 * 
 *Write an application that displays the integer equivalents of some uppercase letters, 
 *
 *lowercase letters, digits and special symbols. Display the integer equivalents of the 
 *
 *following: A B C a b c 0 1 2 $ * + / and the blank character
 * 
 * @author Burak Karacan
 *
 ************************************************************************************/


public class Exercise2_29 {

	public static void main(String[] args) {
		
		System.out.printf("A : %d\nB : %d\nC : %d\na : %d\nb : %d\nc : %d\n0 : %d\n1 : %d\n2 : %d\n$ : %d\n* : %d\n+ : %d\n/ : %d\n  : %d\n", 
				
				((int)'A') , ((int)'B'), ((int)'C'), 
				
				((int)'a'),((int)'b'),((int)'c'),
				
				((int)'0'),((int)'1'),((int)'2'),
				
				((int)'$'),((int)'*'),((int)'+'),((int)'/'),((int)' '));

	}

}
