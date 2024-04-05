// . Create a program that divides two numbers input by the user. Handle the possibility of
// division by zero using try-catch block to catch ArithmeticException.

import java.util.Scanner;

public class Q9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number");
        int s1 = sc.nextInt();
        System.out.println("Enter First Number");
        int s2 = sc.nextInt();
        int ans = 0;
        try {
            ans = s1/s2;
            System.out.println(ans);
        } catch (ArithmeticException e) {
            // TODO: handle exception
            System.out.println(e);
        }
    }    
}
