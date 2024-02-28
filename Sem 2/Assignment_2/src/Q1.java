// A phone number can be thought of as having three parts: the area code, the exchange code and
// the number.
// Example: A phone number, such as (212) 767-8900, can be thought of as having three parts:
// the area code (212), the exchange (767) and the number (8900).
// Define a class Phone to store these three parts of a phone number separately as instance
// variable (area_code, exchange, number). The class consists of two member methods: input ( )
// and display ( ). Create two class objects of type phone. Initialize one directly (by using dot (.)
// operator and instance variable with value area_code: 212, exchange: 767,
// number: 8900), and initialize other from the user through member method input ( ). Display
// both the numbers.
// Sample Run:
// My number is (212) 767-8900
// Your number is (415) 555-1212
import java.util.Scanner;
class Phone{
    int area_code,exchange,number;

    public  void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter area code: ");
        area_code = sc.nextInt();
        System.out.print("Enter exchange: ");
        exchange = sc.nextInt();
        System.out.print("Enter number: ");
        number = sc.nextInt();
    }

    public void display() { 
        System.out.println("(" + area_code + ") " + exchange + "-" + number);
    }


}

public class Q1 {
    public static void main(String[] args) {
        Phone n1 = new Phone();
        n1.area_code = 212;
        n1.exchange = 767;
        n1.number = 8900;
        
        Phone n2 = new Phone();
        n2.input();
        
        System.out.print("My Number: ");
        n1.display();
        System.out.print("Your Number:  ");
        n2.display();
    }
}
