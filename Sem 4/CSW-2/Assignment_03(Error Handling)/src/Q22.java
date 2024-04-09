// Create a custom checked exception class named CustomCheckedException. Use this
// exception in your program to handle a specific error condition and demonstrate its usage
// using try-catch block.

import java.util.Scanner;

class CustomCheckedException extends Exception{
    String s;
    CustomCheckedException(String s){
        super(s);
    }
}


public class Q22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number ");
        int n = sc.nextInt();
        try {
            if(n < 0){
                throw new CustomCheckedException("The Number is Negative Please Enter a Positive Integer");
            }
            else{
                System.out.println("The Number is : " + n);
            }
        } catch (CustomCheckedException e) {
            // TODO: handle exception
            System.out.println(e);
        }
    }
}
