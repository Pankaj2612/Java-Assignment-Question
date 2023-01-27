// Write a java program to print largest power of three less than or equal to N.
// Sample run:
// Enter a number: 100
// The largest power of 3 less than or equal to 100 is 81

import java.util.Scanner;
public class q10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number : ");
		int n =sc.nextInt();
		int pow = 1;
		
		for (; 3*pow <= n;) {
			
			
				pow = pow * 3;
			
				
			//System.out.println(i);
			
		}
		System.out.println("The Largest power of 3 less than or equal to " + n + " is " + pow);
		
	}

}
