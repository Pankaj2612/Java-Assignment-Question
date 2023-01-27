// Write a java program that takes an integer N from user, uses
// Math. Random () to print N random integer numbers between 1 to N, and then prints their
// average value. Use do while loop.
// Sample run:
// Enter a number: 6
// Random numbers generated are: 6 4 5 2 2 5
// Average of 6 random numbers are 4


import java.util.Scanner;
public class q3 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int n = sc.nextInt();
		int i = 1;
		double sum = 0.0; 
		System.out.println("Random Numbers generated are :");
		do {
			int random = 1 + (int) ((n-1)*Math.random());
			sum =+ random;
			System.out.print(random + " ");
			i++;
		}
		while ( i<=n);
		double avg = sum/n;
		System.out.println();
		System.out.println("Average of " +n+ " random Numbers are :" + avg);
	}
}
