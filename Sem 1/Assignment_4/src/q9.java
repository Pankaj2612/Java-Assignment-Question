// Write a java program to take an integer input from the user and print the input by removing all
// zeros.
// Example: Input = 10200 then Output = 12.
// Sample run:
// Enter an integer number: 10203040
// After removing 0 from number 10203040, the new number is 1234.


import java.util.Scanner;
public class q9 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int a = sc.nextInt();
		int newnum = 0;
		int idx =0;
	
		
		while (a!=0) {
			
			int digit = a%10;
			if (digit != 0) {
			
				newnum = newnum + digit *(int)Math.pow(10, idx);
				idx++;
			}
					
			a = a/10;
			
				
			
		}
		System.out.println(newnum);
		
		
	}
}
