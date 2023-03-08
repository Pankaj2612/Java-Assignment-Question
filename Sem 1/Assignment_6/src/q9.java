import java.util.Scanner;

// Some websites impose certain rules for passwords.
// Write a method that checks whether a string is a valid password. Suppose the password rules
// are as follows:
//  A password must have at least eight characters.
//  A password consists of only letters and digits.
//  A password must contain at least two digits.
// Write a program that prompts the user to enter a password and displays Valid Password if the
// rules are followed or Invalid Password otherwise.

public class q9 {

    public static boolean atleast2digits(String str) {

        boolean flag = false;
        int count = 0;
        String digit = "0123456789";
        for (int i = 0; i < str.length(); i++) {

            for (int j = 0; j < digit.length(); j++) {
                if(str.charAt(i) == str.charAt(j))
                    count++;
                                 
            }
            
        }
        if(count>=2)
            flag = true;

        return flag;
    }
    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Password :");
        String str = sc.nextLine();

    

        if(atleast2digits(str) && str.length()>=8)
            System.out.println("The Password is Valid");

        else
        System.out.println("The Password is Invalid");


    }
}
