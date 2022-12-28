import java.util.Scanner;

// Write a java program that prompts the user to enter an integer and determines whether
// it is divisible by 5 and 6, whether it is divisible by 5 or 6, and whether it is divisible
// by 5 or 6, but not both.
// Here is a sample run of this program:
// Enter an integer: 10
// Is 10 divisible by 5 and 6? false
// Is 10 divisible by 5 or 6? true
// Is 10 divisible by 5 or 6, but not both? True

public class Home_Assignment_q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an Integer : ");
        int a = sc.nextInt();

        System.out.println("Is " +a+" divisible by 5 and 6 ? " +((a%5==0) && (a%6==0)));
        System.out.println("Is " +a+" divisible by 5 or 6 ? " +((a%5==0) || (a%6==0)));
        System.out.println("Is " +a+" divisible by 5 or 6, but not both? " +((a%5==0) ^ (a%6==0)));
    }
}
