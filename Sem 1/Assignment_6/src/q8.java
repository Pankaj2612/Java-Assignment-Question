// Write a java method to check a string is palindrome or not

import java.util.Scanner;

public class q8 {

    public static boolean isPallindrome(String str) {

        String revstr = "";
        for(int i = str.length() -1 ; i>=0;i--){

            revstr += str.charAt(i);

        }
        boolean ispallin = false;
        if(str.equals(revstr))
            ispallin = true;

        return ispallin;
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String :");
        String str = sc.nextLine();


        if(isPallindrome(str) == true)
        System.out.println("It is a Pallindorme  ");

        else
        System.out.println("It is not a Pallindrome ");
    }    
}
