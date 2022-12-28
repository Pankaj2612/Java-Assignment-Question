// Make a simple game involving a computer and a user. The computer first guesses a
// number between 1 and 9 inclusive, then ask the user to enter a number between 1 and
// 9 inclusive. If the user guess is correct then display “You got it right”, if the guess is
// close (+1, -1) “Almost got it “, Otherwise “You got it wrong”.
// Here are some sample runs.
// Enter user number: 2
// Computer guesses: 3
// “Almost got it”
// Enter user number: 4
// Computer guesses: 4
// “You got it right”
// Enter user number: 1
// Computer guesses: 5
// “You got it wrong

import java.util.Scanner;

public class q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Guess a Number between 1 to 9 inclusive : ");
		int a = sc.nextInt();
		
		
		int b = 1+(int)((9 -1 + 1) * Math.random());
		
		System.out.println("Computer Guessed " + b);
		
		if ( a == b) {
			System.out.println(" YEAH! , You guessed it Right");
		}
		else if (b-a == 1 || b-a == -1) {
			System.out.println("Almost! , Got it RIght");
		}
		
		else {
			System.out.println("Nice Try , but you got it wrong");
		}
		

	}

}
