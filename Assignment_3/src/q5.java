// Write a Java program that takes a year from user and print true if that year is a leap year
// otherwise print false.
// Here is a sample run:
// Input the year: 2016
// 2016 is a leap year: true
// Input the year: 2008
// 2008 is a leap0 year: false
// Input the year: 1900
// 1900 is a leap year: false

import java.util.Scanner;

public class q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Input the year: ");
		int a = sc.nextInt();
		
		if (a % 4 == 0) {
			if (a%100 == 0 ) {
				if (a % 400 ==0 ) {
					System.out.println(a + " is a Leap Year");
				}
				else {
					System.out.println(a + " is not a Leap Year");
				}
					
			}
			else {
				System.out.println(a + " is a Leap Year");
			}
				
		}
			
		else {
			 System.out.println(a  + " is not  a Leap year ");
		}

	}

}
