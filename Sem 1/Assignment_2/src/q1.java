// Write a java program that reads a Fahrenheit degree in a double value from the console, then
// converts it to Celsius and displays the result. The formula for the conversion is as follows:
// Celsius = (Fahrenheit-32) *(5/9)
// Hint: Hint: In Java, 5 / 9 is 0, but 5.0 / 9 is 0.556
// Here is a sample run:
// Enter a degree in Fahrenheit: 54
// 54 Fahrenheit is 12.22 Celsius


import java.util.Scanner;
public class q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner user_input = new Scanner(System.in);
		
		System.out.println("Enter Fahrenheit Degree:");
		
		double F = user_input.nextDouble();
		double C = (F - 32)* (5.0/9);
				
		System.out.println(F + " Fahrenheit is " + C + " in Celsius");
		
	}

}
