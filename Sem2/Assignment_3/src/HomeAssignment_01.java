// Create a class Bank with instance variables account_no, name, and balance of the customer.
// If the input balance is less than or equal to zero then create an Exception called “Invalid
// BalanceException” and throw it using Java. Display the custom message “Balance cannot be
// less than 0”.
// Sample run-1:
// Enter name
// Rahul
// Enter Account number
// 1235
// Enter balance
// 700
// Details of the Account Holder
// Name: Rahul
// Account number: 1235
// Balance: 700.0
// Enter the money to withdraw
// 300
// After withdraw, Balance = 400.0
// Sample run-2:
// Enter name
// Rahul
// Enter Account number
// 1235
// Enter balance
// 700
// Details of the Account Holder
// Name: Rahul
// Account number: 1235
// Balance: 700.0
// Enter the money to withdraw
// 900
// InvalidBalanceException: Balance cannot be less than 0

import java.util.Scanner;
class Bank{
    Scanner sc = new Scanner(System.in);
    int account_no;
    String name;
    double balance;

    Bank(int accno , String n , double bal){

        this.account_no = accno;
        this.name = n;
        this.balance = bal;

    }

    void Display(){
        System.out.println("Details of the Account Holder");
        System.out.println("Name : " + name);
        System.out.println("Account number: " + account_no);
        System.out.println("Balance : " + balance);
    }

    double withdraw(double n){
        return (balance - n);
    }

}

class InvalidBalanceException extends Exception{

    InvalidBalanceException(String s ){
        super(s);
    }

}


public class HomeAssignment_01 {
    
public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Name");
    String  name = sc.nextLine();
    System.out.println("Enter Account Number ");
    int accno = sc.nextInt();
    System.out.println("Enter Balance ");
    double balance = sc.nextDouble();
    
    Bank b = new Bank(accno, name, balance);
    b.Display();

    System.out.println("Enter the Money to Withdraw");
    double n = sc.nextInt();

    try {
        if(b.withdraw(n) <= 0 )
        throw new InvalidBalanceException(" Balance cannot be less than 0");
        
        else
        System.out.println("After Withdraw, Balance = " + b.withdraw(n));
        
    } catch (InvalidBalanceException e) {
        e.printStackTrace();
    }


}    

}
