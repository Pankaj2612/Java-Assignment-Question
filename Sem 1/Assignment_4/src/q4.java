// Write a program that finds greatest common divisor (GCD) of two numbers using Euclid's
// algorithm, which is an iterative computation based on the following observation: if y divides
// x, the GCD of x and y is y; otherwise, the GCD of x and y is same as GCD of x % y and y.
// Sample run:
// Enter the first number: 56
// Enter the second number: 98
// GCD of 56 and 98 is 14.


import java.util.Scanner;
public class q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter First Number : ");
		int x = sc.nextInt();
		System.out.print("Enter Second Number :  ");
		int y = sc.nextInt();
		
		int a = (x > y)? x:y;
		int b = (x<y)? x:y;

		System.out.println(a);
		System.out.println(b);
		
		while (a % b !=0) {
		
		int r = a%b;
		a = b;
		b = r;
		
		
		}
		System.out.println("GCD of " + y + " and " + x + " is :" + b );
		
		
	}

}
