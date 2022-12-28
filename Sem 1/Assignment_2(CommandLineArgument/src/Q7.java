// Write a java program that takes three positive integers from command-line arguments and
// prints true if any one of them is less than or equal to the product of the other two and false
// otherwise.

public class Q7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args [1]);
		int c = Integer.parseInt(args[2]);
		
		boolean result = (a <= (b*c)) || (b <= (a*c)) || (c <= (a*b));
		
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		System.out.println("c = " + c);
		
		System.out.println(result);

	}

}
