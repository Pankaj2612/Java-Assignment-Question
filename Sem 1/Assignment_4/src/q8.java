// Write a program that generates a random integer number between 1 to 10 and asks the user to
// guess what the number is. If the user's guess is higher than the random number, the program
// should display "Too high, try again." If the user's guess is lower than the random number, the
// program should display "Too low, try again." The program should use a loop that repeats until
// the user correctly guesses the random number and display good guess.
// Sample run:
// Computer guess: 7
// User guess: 5
// Too low, try again
// Computer guess: 5
// User guess: 7
// Too high, try again
// Computer guess: 5
// User guess: 5
// Good guess

import java.util.Scanner;
public class q8 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		while (true) {
		
		System.out.print("Enter a number between 1 to 10 :");
		int a = sc.nextInt();
		int r = 1 + (int)(9 * Math.random());
		System.out.println("Computer Guess = " + r );
		System.out.println("Your Guess = " + a );
		
		if (a >r)
			System.out.println("Too high,try again");
		else if (a < r)
			System.out.println("Too low , try again");

		else if (a == r) {
			System.out.println("Good Guess");
			break;
		
	}
}
}
}