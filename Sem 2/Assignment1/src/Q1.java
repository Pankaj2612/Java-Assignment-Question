
// Write a Java program that can take a positive integer greater than 2 as input and write out the
// number of times one must repeatedly divide this number by 2 before getting a value less
// than 2.
// Sample Run:
// The positive integer greater than 2 from command line argument
// is 67.
// The number of times one must repeatedly divide this number by 2
// before getting a value less than 2 is 5. 

import java.util.Scanner;

public class Q1{
public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter Number Greater than 2 :");
    int input = sc.nextInt();
    int count = 0;
    while (input > 2) {
        input = input/2;
        count++;
    }

    System.out.println("The number of times one must repeatedly divide this number by 2 before getting a value less than 2 is " + count);

    
}


}