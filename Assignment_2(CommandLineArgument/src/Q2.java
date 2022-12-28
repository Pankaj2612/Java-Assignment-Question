// Write a java program that takes two positive integers from command-line arguments and
// prints the result of first number raise to the power of second number.

public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args [1]);
		
		int pow = (int)Math.pow(a, b);
		
		System.out.println("Power of "+ a + "^"  + b + " = " + pow);
	}

}
