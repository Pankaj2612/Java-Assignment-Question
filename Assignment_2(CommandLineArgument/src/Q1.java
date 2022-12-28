// Write a java program that takes two int values from the command line as dividend and divisor
// and print the quotient and remainder.

public class Q1 {
	
	public static void main(String[] args) {
		
		int divident = Integer.parseInt(args[0]);
		int divisor = Integer.parseInt(args [1]);
		
		int quotient = divident/divisor;
		int remainder = divident%divisor;
		
		
		System.out.println("Dividend = " + divident);
		System.out.println("Divisor = " + divisor);
		System.out.println("Quotient = " +quotient);
		System.out.println("Remainder = " +remainder);
		
	}

}
