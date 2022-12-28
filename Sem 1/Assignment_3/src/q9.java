// Write a program to input 3 integer number a, b, c. Find the largest number among 3.
// Also find the 2nd largest number among 3. Here is the sample output:
// Enter the value of a, b, c:10 30 50
// Largest number: 50
// 2nd largest number: 30

import java.util.Scanner;

public class q9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the value of a , b, c :");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
		

		if (a>b && a > c){
			System.out.println("Largest Number :" + a);
			if (b>c)
			System.out.println("2nd Largest Number :" + b);
			else if (c > b)
			System.out.println("2nd Largest Number :" + c);
		}
		else if (b>a && b > c){
			System.out.println("Largest Number :" + b);
			if (a>c)
			System.out.println("2nd Largest Number :" + a);
			else if (c > a)
			System.out.println("2nd Largest Number :" + c);
		}
		else if (c>a && c > b){
			System.out.println("Largest Number :" + c);
			if (a>b)
			System.out.println("2nd Largest Number :" + a);
			else if (b > a)
			System.out.println("2nd Largest Number :" + b);
		}	
			
	}

}