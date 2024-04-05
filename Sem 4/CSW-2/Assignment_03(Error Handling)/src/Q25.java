// Implement a method that reads an integer from the user but handles
// InputMismatchException using try-catch block

import java.util.InputMismatchException;
import java.util.Scanner;

public class Q25 {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int str = sc.nextInt();

    try {
        System.out.println(str);
    } catch (InputMismatchException e) {
        // TODO: handle exception
        System.out.println(e);
    }
   } 
}
