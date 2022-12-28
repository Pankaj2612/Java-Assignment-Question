// Enter the basic salary of an employee of an organization through the keyboard. His dearness
// allowance (DA) is 40% of basic salary, and house rent allowance (HRA) is 20% of basic
// salary. Write a java program to calculate his gross salary. Print the DA, HRA and Gross
// salary.
// Here is the sample run:
// Enter basic salary: 15600
// DA is 6240.0
// HRA is 3120.0
// Gross salary is 24960

import java.util.Scanner;
public class q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int basic_salary;
		System.out.println("Enter Basic Salary");
		Scanner input = new Scanner(System.in);
		basic_salary = input.nextInt();
		
		double DA = basic_salary * 0.4;
		double HR = basic_salary * 0.2;
		
		double Gross_salary = basic_salary + DA + HR;
		
		System.out.println("THIS IS BASIC SALARY: " + basic_salary);
		System.out.println("DA is :" + DA );
		System.out.println("HRA is :" + HR );
		System.out.println("Gross Salary is : " + Gross_salary);
		
		

	}

}
