// Design a Simple Calculator using methods in java containing the following functionalities,
// namely, with Addition, Subtraction, Multiplication, Remainder, Division and Square Root. The
// signature of the methods are given below.
//  public static int additionSimple(int x, int y)
//  Two inputs, x and y. Return the result of adding x to y.
//  public static int subtractionSimple(int x, int y)
//  Two inputs, x and y. Return the result of subtracting x from y i.e y-x.
//  public static int multiplicationSimple(int x, int y)
//  Two inputs, x and y. Return the result of multiplying x to y i.e. x*y.
//  public static double divisionSimple(int x, int y)
//  Two inputs, x and y. Return the result of dividing y by x. Please check whether
// x is zero before dividing.
//  public static int remainderSimple(int n, int m)
//  Please make sure that remainderSimple() takes two inputs, namely, a number
// (int) n and a number (int) m. The method should return the remainder of n
// divided by m.
//  public static double squareRootSimple(int n)
//  Takes one input, namely a number n, and returns the square root of the number.
// The return should be double. Please kindly make sure that the number n is
// positive.

import java.util.Scanner;
public class Q1 {

    public static int  additionSimple(int x, int y) {  
        return x + y;
    }


    public static int  subtractionSimple(int x , int y) {
        return x-y;
    }

    public static int  multiplicationSimple(int x , int y) {
        
        return x * y;

    }

    public static double  divisionSimple(int x , int y) {
        double div=0;;
        if(x!=0){
            div = y/x ;
        }
        else{
            System.out.println("The value of X is zero Please Input Valid Integer");
        }

            return div;
    }

    public static int  remainderSimple(int n, int m) {
        return n%m;
    }

    public static double  squareRootSimple(int n) {
        double sqrt = 0;

        if(n>0){
            sqrt = Math.sqrt(n);
        }
        else
        System.out.println("The Value of n is not Positive Please Input a Postive Integer");

        return sqrt;
        
    }

    public static void main(String[] args)  {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Two Integers :");
        int x = sc.nextInt();
        int y = sc.nextInt();
        System.out.println("Enter the Arithmatic Operator You want to do ('+','-','*','/','S'(for sqaureRoot ) )");
        char c = sc.next().charAt(0);
        
        switch (c) {
            case '+':
            System.out.printf("The Addition of " + x + "+" + y + " is " + additionSimple(x,y));
                break;
            case '-':
            System.out.println("The Subtraction of " + x + "-" + y + " is " + subtractionSimple(x,y));
                break;
            case '*':
            System.out.println("The Multiplication of " + x + "*" + y + " is " + multiplicationSimple(x,y));
                break;
            case '/':
            System.out.println("The Divison of " + x + "/" + y + " is " + divisionSimple(x,y));
                break;
            case '%':
            System.out.println("The Remainder  of " + x + "%" + y + " is " + remainderSimple(x,y));
                break;
            case 'S':
            System.out.println("The SquareRoot of " + x + " is " + squareRootSimple(x));
                break;
        
            default:System.out.println("Enter Valid Input ");
                break;
        }

        
    }
}
