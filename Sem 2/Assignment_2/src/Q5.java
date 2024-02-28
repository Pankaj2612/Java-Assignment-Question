// Define a class Deposit. The instance variable of the class Deposit are mentioned below.
// Instance variable Datatype
// Principal Long
// Time Integer
// rate Double
// Total_amt Double
// Initialize the instance variables Principal, Time, rate through constructors. Constructors are
// overloaded with the following prototypes.
// Constructor1: Deposit ( )
// Constructor2: Deposit (long, int, double)
// Constructor3: Deposit (long, int)
// Constructor4: Deposit (long, double)
// Apart from constructor, the other instance methods are (i) display ( ): to display the
// value of instance variables, (ii) calc_amt( ) to calculate the total amount.
// Total_amt = Principal + (Principal×rate×Time)/100;

import java.util.Scanner;

import javax.sound.midi.Soundbank;
class Deposit{
    long Principal;
    int Time;
    double rate , Total_amt;

    Scanner sc = new Scanner(System.in);

    Deposit(){
        System.out.println("Enter Principle , Time , Rate of Interest ");
        Principal  = sc.nextLong();
        Time = sc.nextInt();
        rate = sc.nextDouble();
    }
    Deposit(long p , int t, double r){
        Principal = p;
        Time = t;
        rate = r;
    }
    Deposit(long p , int t){
        Principal = p;
        Time = t;
        rate = sc.nextDouble();    
    }
    Deposit(long p , double r){
        Principal = p;
        rate = r;
        Time = sc.nextInt();
    }
    void display(){
        System.out.println("Principal : " + Principal);
        System.out.println("Time  Period: " + Time);
        System.out.println("Interest rate : " + rate);
    }
    void calc_amt(){
        Total_amt = Principal + (Principal*Time*rate)/100;
        System.out.println("Total Amount is : " + Total_amt);
    }
}


public class Q5 {
    public static void main(String[] args) {
        Deposit ob1 = new Deposit();
        ob1.display();
        ob1.calc_amt();
    }    
}
