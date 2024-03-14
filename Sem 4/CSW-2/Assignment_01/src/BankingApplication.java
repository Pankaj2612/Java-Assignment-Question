// Consider a scenario where you are tasked with developing a simple banking application
// using Java, employing the concept of polymorphism. Your application should consist of three
// classes: Account, SavingsAccount, and CurrentAccount. The Account class serves as the
// base class with private attributes for account number and balance, along with abstract methods
// for deposit and withdrawal. The SavingsAccount class, a subclass of Account, should include
// an additional attribute for interest rate and override the deposit method to calculate interest, as
// well as override the withdrawal method to ensure a sufficient balance. Similarly, the
// CurrentAccount class, also a subclass of Account, should incorporate an overdraft limit
// attribute and override the withdrawal method to check the overdraft limit. Implement the
// classes as described, ensuring proper encapsulation and abstraction. Finally, create a
// BankingApplication class (Main) to demonstrate the polymorphic behavior by creating
// instances of both SavingsAccount and CurrentAccount, testing deposit and withdrawal
// operations, and displaying account details.

abstract class Account{
    private String AccountNO;
    protected double AccBalance;

    String getAccountNO(){
        return AccountNO;
    }
    double getBalance(){
        return AccBalance;
    }

    abstract void deposit(double amount);
    abstract void withdrawal(double amount);
}

class SavingsAccount extends Account{

    double interestRate;

    SavingsAccount(double interest){
        this.interestRate = interest;
    }

    @Override
    void deposit(double amount){
       AccBalance += amount + (amount * interestRate/100); 
    }
    @Override
    void withdrawal(double amount){
        if(amount > AccBalance){
            System.out.println("Not Sufficient Funds");
        }
        else{
            AccBalance -= amount;
        }
        
    }
    
}

class CurrentAccount extends Account{

    double overdraftLimit;

    CurrentAccount(double limit){
        this.overdraftLimit = limit;
    }

    @Override
    void deposit(double amount){
        AccBalance += amount;
    }

    @Override
    void withdrawal(double amount){
        if(amount > overdraftLimit + AccBalance){
            System.out.println("OverDraftLimit Reached Cannot withdraw");
        }
        else{
            AccBalance -= amount;
        }
    }

}

public class BankingApplication{
    public static void main(String[] args) {
        
        SavingsAccount s1 = new SavingsAccount(1.2);
        s1.deposit(20000);

        System.out.println(s1.getBalance());
        s1.withdrawal(200);
        System.out.println(s1.getBalance());


        CurrentAccount c1  = new CurrentAccount(10000);
        c1.deposit(50000);

        System.out.println(c1.getBalance());
        c1.withdrawal(50000050);
    }
}