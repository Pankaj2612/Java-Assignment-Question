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


    public static boolean tocheckletter_digits(String str) {
 
        boolean p = true;
        for (int i = 0; i < str.length(); i++) {
            if((str.charAt(i) < 'a' && str.charAt(i) > 'z') || (str.charAt(i) < '0' && str.charAt(i) > '9')){
                p = false;
            }
        }
        return p;

    }
    public static boolean passwordvalidcheck(String str) {

        boolean flag = false;
        int count = 0;
        for(int i =0;i<str.length();i++){
            char c = '0';
            if((str.charAt(i) > c && str.charAt(i) < '9'))
            count++;

        }

        if(str.length()>=8){
            if(count >=2 && tocheckletter_digits(str)){
                flag = true;
            }
        }
        return flag;
        
    }

    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        if (passwordvalidcheck(str))
            System.out.println("The Password is valid");

        else
        System.out.println("The password is invalid");
    }
}
