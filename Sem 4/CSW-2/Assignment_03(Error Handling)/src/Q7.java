// Create a method that takes a string input and converts it to an integer. Handle
// NumberFormatException using try-catch block and prompt the user to enter a valid
// number upon exception.

import java.util.Scanner;

public class Q7 {

    public static void convert() {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        try {

            Integer i = Integer.valueOf(str);
            System.out.println(i);

        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e);
            System.out.println("Please enter a valid Number Format");
        }
    }
    public static void main(String[] args) {
        while (true) {
            convert();
        }
    }
}
