// Write a java program to enter two numbers through the keyboard. Write a program to find the
// value of one number raised to the power of another. (Do not use Java built-in method).
// Sample run:
// Enter the base: 5
// Enter the power: 4
// 5 to the power 4 is: 625


import java.util.Scanner;
public class q6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Base  :");
		int base = sc.nextInt();
		System.out.println("Enter the Power :");
;		int power= sc.nextInt();
		int ans = 1;
		
		for(int i =0;i<power;i++) {
			
			 ans = ans * base;
			
			
		}
		System.out.println(base+" to the power " + power + " is " + ans);
		
	}

}
