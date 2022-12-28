// A University conducts a 100-mark exam for its student and grades them as follows.
// Assigns a grade based on the value of the marks. Write a java program to print the
// grade according to the mark secured by the student. [Use switch-case].
// Mark Range Letter Grade
// >=90 O
// >=80 AND <90 A
// >=70 AND <80 B
// >=60 AND <70 C
// >=50 AND <60 D
// >=50 AND <40 E
// <40 F

import java.util.Scanner;

public class q10 {

    public static void main(String[] args) {
        int marks;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Marks :");
        marks = sc.nextInt();

        switch (marks/10){
            
            case 9 :
                System.out.print("Your Grade Is: O");
                break;
            case 8 :
                System.out.print("Your Grade Is: A " );
                break;
            case 7 :
                System.out.print("Your Grade Is: B " );
            case 6 :           
                System.out.print("Your Grade Is: C " );
                break;
            case 5 :
                System.out.print("Your Grade Is: D " );
                break;
            case 4 :           
                System.out.print("Your Grade Is: E ");
                break;
            default :
                System.out.print("You Grade Is: F ");
            
        }
    }
    
}
