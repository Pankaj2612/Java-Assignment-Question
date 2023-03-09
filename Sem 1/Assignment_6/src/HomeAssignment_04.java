
// Write a Java method to count all words in a string.
// Example:
// Input the string:
// The quick brown fox jumps over the lazy dog.
// Expected Output:
// Number of words in the string: 9

import java.util.Scanner;
public class HomeAssignment_04 {
public static int  count(String str) {

    int wordcount = 1;

    for (int i = 0; i < str.length()-1; i++) {
        if(str.charAt(i) == ' ' && str.charAt(i+1) != ' ')
        wordcount++;
    }



    return wordcount;
    
}

public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    System.out.println("Input the String : ");
    String str = sc.nextLine();
    
    System.out.println("Number of words in the String : " + count(str));
}
    
}
