// Write a java program that reads an integer between 0 and 1000 and adds all the digits in the
// integer. For example, if an integer is 749, the sum of all its digits is 20.
// Hint: Use the % operator to extract digits, and use the /
// operator to remove the extracted digit.
// For instance, 749 % 10 = 9 and 749 / 10 = 74.
// Here is a sample run:
// Enter a number between 0 and 1000: 999 The sum of the
// digits is 27

import java.util.Scanner;
public class q4 {

	public static void main(String[] args) {

		int num,sum = 0,rema;
		
		System.out.println("Enter a Number Between 0 to 1000");
		Scanner input = new Scanner(System.in);
		num = input.nextInt();
		
		rema = num%10;
		sum = sum + rema;
		num = num/10;
		rema = num % 10;
		sum = sum + rema;
		num = num/10;
		rema = num % 10;
		sum = sum +rema;
		
		System.out.println(sum);
		
		
		
		

	}

}
