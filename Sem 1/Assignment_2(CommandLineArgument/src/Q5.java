// Write a java program that takes three int values from the command line and prints them in
// ascending order. Use Math.min() and Math.max().

public class Q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args [1]);
		int c = Integer.parseInt(args[2]);
		
		int x = Math.max(a, b);
		int max = Math.max(x, c);
		
		int y = Math.min(a, b);
		int min = Math.min(y, c);
		
		int mid = (a+b+c)-(max + min); 
		
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		System.out.println("c = " + c);
		
		System.out.println();																								
		
		
		System.out.println(min);
		System.out.println(mid);
		System.out.println(max);
		
	
	
	}

}
