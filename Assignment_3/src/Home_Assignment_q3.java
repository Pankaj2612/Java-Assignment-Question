// Write a java program that randomly generates an integer between 1 and 12 and displays
// the English month name January, February… December for the number 1, 2… 12,
// accordingly.

import java.util.Scanner;
public class Home_Assignment_q3 {
    public static void main(String[] args) {

      
        int r1 = 1+(int)(12* Math.random() );

        System.out.println("Random Integer between 1 and 12  : " + r1);

        switch (r1){
            case 1 : System.out.println("January");
            break;
            case 2 : System.out.println("Feburary");
            break;
            case 3 : System.out.println("March");
            break;
            case 4 : System.out.println("April");
            break;
            case 5 : System.out.println("May");
            break;
            case 6 : System.out.println("June");
            break;
            case 7 : System.out.println("July");
            break;
            case 8 : System.out.println("August");
            break;
            case 9 : System.out.println("September");
            break;
            case 10 : System.out.println("October");
            break;
            case 11 : System.out.println("November");
            break;
            case 12 : System.out.println("December");
            break;
        }
        
    }  

        
    }

