// Write a java program that prints the sum of two random integers between 1 and 6 (such as
// you might get when rolling dice)
public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int low = Integer.parseInt(args[0]);
		int high = Integer.parseInt(args [1]);
		
		int r1 = low+(int)((high -low) * Math.random());
		int r2 = low+(int)((high -low) * Math.random());
		
		
		
		int sum = r1+r2;
		
		
		System.out.println(r1);
		System.out.println(r2);
		
		System.out.println("Sum of two Random Integers : " + sum);
		

	}

}
