import java.util.Scanner;

// Write a java program which displays an appropriate name for a person, using a
// combination of nested ifs and compound conditions. Ask the user for a gender, first
// name, last name and age. If the person is female and 20 or over, ask if she is married.
// If so, display "Mrs." in front of her name. If not, display "Ms." in front of her name. If
// the female is under 20, display her first and last name. If the person is male and 20 or
// over, display "Mr." in front of his name. Otherwise, display his first and last name. Note
// that asking a person if they are married should only be done if they are female and 20
// or older, which means you will have a single if and else nested inside one of your if
// statements. Also, did you know that with an if statements (or else), the curly braces are
// optional when there is only one statement inside?


public class Home_Assignment_q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("What is your gender (M or F) :");
        char gender = sc.next().charAt(0);
        System.out.print("First Name : ");
        String fname  = sc.next();
        System.out.print("Last Name : ");
        String lname  = sc.next();
        System.out.print("Age : ");
        int age = sc.nextInt();
        
        
        if (gender == 'F'){
            if (age >=20){
            System.out.print("Are you married, "+ fname + " (Y /N) ?");
            char ans = sc.next().charAt(0);
            if (ans == 'Y')
                System.out.println("Then I shall call you Mrs." + fname + " " + lname);
            else
                System.out.println("Then I shall call you Ms." + fname + " " + lname);
            }
            else
                System.out.println("Then I shall call you " + fname + " " + lname);
        }
        else if (gender == 'M'){
            if (age >= 20)
            System.out.println("Then I shall call you Mr." + fname + " " + lname);
            else
            System.out.println("Then I shall call you " + fname + " " + lname);
          }
    
}
}   