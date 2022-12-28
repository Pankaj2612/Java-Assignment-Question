// Write a program to input the age of a person and check if the age of the person is
// greater than or equal to 18 then print the message:
// “You are eligible to cast your vote”.

import java.util.Scanner;
public class q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			Scanner sc = new Scanner(System.in);
			System.out.println("Enter Your Age : ");
			int age = sc.nextInt();
			
			if (age >= 18) 
				System.out.println("\"You are eligibles to cast your vote\" ");
			
			
	}

}
