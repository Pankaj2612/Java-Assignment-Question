// Write the methods with the following headers
// // Return the reversal of an integer. Example: reverse (456), returns 654
// public static int reverse(int number)
// // Return true if number is a palindrome
// public static boolean isPalindrome(int number)
// Use the reverse method to implement isPalindrome. A number is a palindrome if its reversal is
// the same as itself. Write a java program that prompts the user to enter an integer and reports
// whether the integer is a palindrome.


import java.util.Scanner;
public class q3 {

    public static int  reverse(int number) {

        int rev = 0;//9,//92//921
        while(number!=0){

            int d = number%10;
            rev = rev * 10 + d;
            number = number/10;   
        }
        return rev;//921
        
    }

    public static boolean  isPallindrome(int number) {

        boolean pal = false;
        if(number == reverse(number))
        pal = true;

        return pal;
        
    }

    public static void main(String[] args) {

      Scanner sc  = new Scanner(System.in);
      System.out.println("Enter The Integer : ");
      int n = sc.nextInt();
      
      if (isPallindrome(n) == true)
      System.out.println("It is a Pallindrome Number: ");

      else
      System.out.println("It is not a Pallindrome Number");
    }
    
}
