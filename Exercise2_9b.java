/*************************************************************************************
 * This program prints the valid or invalid variable names.
 *  
 *  Exercise 2.9b / it's on page 115.
 * 
 * @author Burak Karacan
 *
 ************************************************************************************/
public class Exercise2_9b {

	public static void main(String[] args) {
		
		
		String str1 = "AccountValue";
		
		String str2 = "$value";
		
		String str3 = "value_in_$";
		
		String str4 = "account_no_1234";
		
		String str5 = "US$";
		
		String str6 = "her_sales_in_$";
		
		String str7 = "his_$checking_account";
		
		String str8 = "X!";
		
		String str9 = "_$_";
		
		String str10 = "a@b";
		
		String str11 = "_name";
		
		boolean isValid;
		
		System.out.printf("%s = %b\n\n", str1, isValid = true);
		System.out.printf("%s = %b\n\n", str2, isValid = true);
		System.out.printf("%s = %b\n\n", str3, isValid = true);
		System.out.printf("%s = %b\n\n", str4, isValid = true);
		System.out.printf("%s = %b\n\n", str5, isValid = true);
		System.out.printf("%s = %b\n\n", str6, isValid = true);
		System.out.printf("%s = %b\n\n", str7, isValid = true);
		System.out.printf("%s = %b\n\n", str8, isValid = false);
		System.out.printf("%s = %b\n\n", str9, isValid = true);
		System.out.printf("%s = %b\n\n", str10, isValid = false);
		System.out.printf("%s = %b\n\n", str11, isValid = true);

	}

}
