// Write a method that finds the number of occurrences of a specified character in a string using
// the following header:
// public static int count(String str, char a)
// For example, count ("Welcome", 'e') returns 2.
// Write a java program that prompts the user to enter a string followed by a character and
// displays the number of occurrences of the character in the string.


import java.util.Scanner;

public class q6 {

    public static int count(String str , char a ) {

    int count = 0;
    for(int i = 0;i < str.length();i++){

        if(str.charAt(i)== a)
            count++;
    }

    return count;
        
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String : ");
        String str = sc.nextLine();
        System.out.println("Enter Character : ");
        char a = sc.next().charAt(0);

        System.out.println(count(str, a));
    }
    
}
