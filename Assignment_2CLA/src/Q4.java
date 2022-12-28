// Write a java program that takes a double value t from the command line and prints the value
// of cos (5t) + sin (7t). Use Math.cos() and math.sin()

public class Q4 {
	public static void main(String[] args) {
		
		double  a = Double.parseDouble(args [0]);
		double t = Math.toRadians(a);   //Radians
		
		double  sum = Math.cos(5*t) + Math.sin(7 * t);
		System.out.println("a = " +a);
		System.out.println("t = " + t);
		System.out.println("Sum of Cos(5t) + Sin(7t) = " +sum);
		
		
		
	}
}
