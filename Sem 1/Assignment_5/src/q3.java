// WAP to enter the first number and second number. Display the prime numbers between the
// first and second number.
// Sample run:
// Enter the first number: 4
// Enter the second number: 15
// Prime numbers between 4 and 15 are: 5 7 11 13


import java.util.Scanner;
public class q3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter First Number: ");
		int f = sc.nextInt();
		System.out.print("Enter Second Number: ");
		int s = sc.nextInt();
		
		System.out.println("Prime Numbers between " + f + " and " + s + " are : ");
		
		for(f =f+1;f<s;f++) {
			int flag = 0;
			for (int i = 2;i<f;i++) {
				if(f%i == 0) {
					flag = 1;
					break;                            
				}
	
			}
			if (flag ==0)
				System.out.print(f + " ");
		}

	}

}
