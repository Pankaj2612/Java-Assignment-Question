// Write a java program that gets three integer numbers from the user. Count from the first number
// to the second number increments by the third number. Use for loop to do it. Also, display the
// sum of numbers displayed between the first number and second number.
// Sample run:
// Enter first number: 4
// Enter second number: 13
// Enter third number: 3
// 4 7 10 13
// The sum of number displayed is 34


import java.util.Scanner;
public class q1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("First Number");
		int a = sc.nextInt();
		System.out.println("Second Number");
		int b = sc.nextInt();
		System.out.println("Third Number");
		int c = sc.nextInt();
		
		int sum=0;
		for (; a <= b;a = a + c) {
			
			System.out.print(a + " ");
			sum = sum+a;
			
		}
		System.out.println("The sum of the number displayed is : ");
		System.out.println(sum);

	}

}
