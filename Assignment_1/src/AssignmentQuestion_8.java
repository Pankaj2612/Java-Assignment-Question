// Write a java program to exchange the values of two variables of integer type X and Y without
// using third temporary variable

public class AssignmentQuestion_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 10;
		int y = 20;
		
		System.out.println("Before swapping : " + x);
		System.out.println("Before swapping : " +y);
		
		
		x = x + y;
		y=x-y;
		x = x-y;
		
		
		
		System.out.println("After swapping : " +x);
		System.out.println("After swapping : " +y);

	}

}
