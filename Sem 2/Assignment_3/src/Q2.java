// Assign your favourite colours in an array. Identify 2 exceptions that may be generated & write
// exceptional handler in Java. Also, display the four colours after handling any 2 exceptions.
// Sample run:
// Enter four colours
// RED
// BLUE
// YELLOW
// GREEN
// Convert string to integer
// java.lang.NumberFormatException: For input string: "RED"
// Enter one more colour
// VIOLET
// java.lang.ArrayIndexOutOfBoundsException: Index 5 out of
// bounds for length 4
// The colours entered are
// RED
// BLUE
// YELLOW
// GREEN

import java.util.Scanner;
public class Q2 {
    public static void main(String[] args) {
        String[] str = new String[4];

        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < str.length; i++) {
    
                str[i] = sc.next();
            }
        

        try {
            Integer.parseInt(str[0]);
        } catch (NumberFormatException e) {
            System.out.println(e.toString());
        }

        try {
            System.out.println("Enter one more color");
            str[5] = sc.next();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        }
        System.out.println("The colours entered are ");
       
        for (int i = 0; i < str.length; i++) {
            System.out.println(str[i]);
        }

    }
}
