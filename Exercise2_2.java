/*************************************************************************************
 * This program includes the answers that exist on page 112
 * 
 * Using boolean and string...
 * 
 * @author Burak Karacan
 *
 ************************************************************************************/
public class Exercise2_2 {

	public static void main(String[] args) {
		
		// Defining phase for string variable...

		String stringA = "Comments cause the computer to display the text after the // on the screen when the program executes.";
		
		String stringB = "All variables must be given a type when they’re declared.";
		
		String stringC = "Java considers the variables number and NuMbEr to be identical";
		
		String stringD = "The remainder operator (%) can be used only with integer operands.";
		
		String stringE = "The arithmetic operators *, /, %, + and - all have the same level of precedence.";
		
		String stringF = "The identifier _ (underscore) is valid in Java 9.";
		
		// Defining phase for boolean variable...
		
		boolean trueOrFalse;
		
		// Printing phase for results with printf format.
		
		System.out.printf("%s ---> %b\n", stringA, trueOrFalse = false);
		
		System.out.printf("%s ---> %b\n", stringB, trueOrFalse = true);
		
		System.out.printf("%s ---> %b\n", stringC, trueOrFalse = false);
		
		System.out.printf("%s ---> %b\n", stringD, trueOrFalse = false);
		
		System.out.printf("%s ---> %b\n", stringE, trueOrFalse = false);
		
		System.out.printf("%s ---> %b\n", stringF, trueOrFalse = false);

	}

}
