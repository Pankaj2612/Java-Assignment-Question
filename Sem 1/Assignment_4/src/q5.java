// Write a Java program to check if a number is perfect number or not.
// (Hints: A number N is called perfect number, if the sum of factors except N as a factor is
// equals to the number N.
// Example:
// N = 28 is a perfect number as (1 + 2 + 4 + 7 + 14 = 28.)
// Sample run1:
// Enter a number: 496
// 496 is a perfect number.
// Sample run2:
// Enter a number: 490
// 490 is not a perfect number.

import java.util.Scanner;
public class q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an Integer");
		int n = sc.nextInt();
		int sum = 0;
		int i = 1;
		while (i <= n/2) {
			if (n%i == 0) {
				System.out.print(i+" ");
				sum =sum +i;
			}
			i++;
		}
		System.out.println();
		if(sum == n)
			System.out.println(n + " is a Perfect number ");
		else
			System.out.println(n + " is a not Perfect number ");

		
	}

}
