// Write a java program to check whether a number is a spy number or not.
// Example:
// N = 132
// Sum of digit of N = 1 + 3 + 2 = 6
// Product of digit of N = 1 × 3 × 2 = 6
// So, 132 is a spy number.
// Sample Run:
// Enter a number: 1124
// 1124 is a spy number.



import java.util.Scanner;
public class Q3 {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int input = sc.nextInt();
        int oldn = input;
        int sum = 0;
        int pro = 1;
        while (input != 0) {
            int d = input%10;
            sum += d;
            pro *= d;
            input = input/10;
        }
        if (sum == pro)
            System.out.println(oldn + " is a spy Number .");
        else
        System.out.println(oldn + " is not a spy Number .");
    }
    
}
