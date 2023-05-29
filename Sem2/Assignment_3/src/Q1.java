// Write a Java program to read your lucky number from keyboard. Treat –ve no. as
// NumberFormatException. Write appropriate Exceptional handler.

import java.util.Scanner;

public class  Q1{

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your lucky Number : ");
        int n = sc.nextInt();

        try {
            if(n < 0 )
                throw new NumberFormatException("Negative Number");

            else
            System.out.println("Your Lucky number is " + n);
        } catch (NumberFormatException e) {
            System.out.println(e.toString());
        }

    }
}