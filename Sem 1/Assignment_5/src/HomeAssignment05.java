// Write a java program to generate and print the first n terms of the Fibonacci sequence where
// n>=1.
// The first few terms are:
// 0, 1, 1, 2, 3, 5, 8, 13, ......
// Each term beyond the first two is derived from the sum of its two nearest predecessors i.e. a
// new term in the series (Except the first two) is found by the following formula.
// new term=preceding term + term before the preceding term
// Let us define:
// c as new term
// b as the preceding term
// a as the term before the preceding term
// So, c= b + a
// Your program should handle for all positive values of n.
// Example:
// If n=1, it will display as: Fibonacci Series is: 0
// If n=2, it will display as: Fibonacci Series is: 0, 1
// If n=3, it will display as: Fibonacci Series is: 0, 1, 1 ….
// If n=10, it will display as: Fibonacci Series is: 0, 1, 1, 2,
// 3, 5, 8, 13, 21, 34



import java.util.Scanner;
public class HomeAssignment05 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number of Rows : ");
        int n = sc.nextInt();

        int a = 0;
        int b = 1;
        int c;

        System.out.print(a + " " + b + " ");

        for(int i =1;i<=n-2;i++){

            c = a+b;
            a=b;
            b=c;
        
            System.out.print(c + " ");

        }



    }
    
}
