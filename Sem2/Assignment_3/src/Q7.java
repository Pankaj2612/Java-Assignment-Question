// Write a menu driven program to perform several mathematical operations. Different choices
// for the mathematical operations are as follows.
// 1. Determine the factorial of a number
// 2. Determine XN
// for two numbers X, N
// 3. Determine GCD of two number.
// 4. Binary equivalent of a decimal number
// 5. Product of two numbers.
// NOTE: All the mathematical operations must be performed using the recursive method

import java.util.Scanner;

public class Q7 {
    
    public static int factorial(int n ) {
        
        if(n == 0)
            return 1;

        else
            return n*factorial(n-1);

    }

    public static int power(int x , int n){

        if(n==0){
            return 1;
        }

        return x * power(x, n-1);


        }

    public static int GCD(int a , int b) {
        
        if(b == 0)
        return a;

        return GCD(b, a%b);


    }

    public static void Binary(int x ) {
        
        if(x == 1){
        System.out.print("1");
        return;
        }
        int r = x%2;
        Binary(x/2);
        System.out.print(r);

    }
    public static int Product(int a , int b) {
        
        if(b!=0){
            return a + Product(a, b-1);
        }
        else{
            return 0;
        }

        

    }

    

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        while(true){
        System.out.println("1. Determine the factorial of a number");
        System.out.println("2. Determine XN for two numbers X, N");
        System.out.println("3. Determine GCD of two number.");
        System.out.println("4. Binary equivalent of a decimal number");
        System.out.println("5. Product of two numbers");
        System.out.println("0. TO EXIT");
        System.out.println("Enter Answer (0,1,2,3,4,5)");
        int in = sc.nextInt();
        switch (in) {
            case 1:
                System.out.println("Enter a Number of which you want factorail ");
                int n = sc.nextInt();
                System.out.println("Factorail of " + n +" is " + factorial(n));
                break;
            
            case 2:
            System.out.println("Enter number of which you wwant the power x , n ");
            int a= sc.nextInt();
            int b= sc.nextInt();
            System.out.println( a +" to the power of  " + " b " + " is " +  power(a, b));
            break;

            case 3:
            System.out.println("Enter two number to find the GCD ");
            int p = sc.nextInt();
            int q = sc.nextInt();
            System.out.println("GCD of " + p + " " + q + " is " + GCD(p, q));
            break;

            case 4:
            System.out.println("Enter a Decimal Number to find the binary ");
            int r = sc.nextInt();
            System.out.println("Binary of " + r + " is ");
            Binary(r);
            break;

            case 5:
            System.out.println("Enter Two Number to Find the Product ");
            int u = sc.nextInt();
            int v = sc.nextInt();
            System.out.println("Product of " + u + " " + v + " is " + Product(u, v));
            break;

            case 0:
                return;
            
            default:
                System.out.println("Invalid Input");
                break;
        } 
    }   

    }
    

}
