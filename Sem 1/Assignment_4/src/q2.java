// An integer n is divisible by 9 if the sum of its digits is divisible by 9. Use this concept in your
// program to determine whether or not the number is divisible by 9. Test it on the following
// numbers: Use while loop.
// n = 123456
// n = 154368
// n = 621594

// Hint: Use the % operator to get each digit; then use / operator to remove the digit.
// Sample run 1:
// Enter a number: 154368
// The number 154368 is divisible by 9.
// Sample run 2:
// Enter a number: 123456
// The number 123456 is not divisible by 9.

import java.util.Scanner;
public class q2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter an Integer");
		int n = sc.nextInt();
		int sum = 0;
		
		while (n > 0) {
			int rem = n%10;
			sum = sum + rem;
			n = n/10;
			
		}
		if (sum%9 == 0)
			System.out.println("This number is divisible by 9 ");
		else
			System.out.println("This number is not divisible by 9 ");
	}

}
