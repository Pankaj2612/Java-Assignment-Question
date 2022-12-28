// Write a java program to input a four-digit number from command line argument and find sum
// of the first and last digit of the number.

public class Home_Assignment_q3 {
    public static void main(String[] args) {
        int input , first , last;

        input = Integer.parseInt(args[0]);

        first = input / 1000;
        last = input % 10;

        System.out.println("First Digit is :" + first);
        System.out.println("Last Digit is :" + last);

        int sum = first + last;

        System.out.println("Sum of first and last digit of the number "+ input + "is " +sum);

    }   
}
