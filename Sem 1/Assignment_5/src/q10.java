// Given a=0, b=1 and c=1 are the first three numbers of some sequence. All other numbers in
// the sequence are generated from the sum of their three most recent predecessors. Write a java
// program to generate this sequence up to n terms where n > 3.

import java.util.Scanner;
public class q10 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter the value of N : ");
        int n = sc.nextInt();
        

        int a = 0 ; int b = 1; int c = 1;
        System.out.println("The Sequence is :");
        System.out.print(a + " " + b + " " + c + " "); 
        for (int i = 4 ; i <= n ; i++){

               // 0  , 1  , 1
            int nexterm = a+b+c;
            a = b;
            b = c;
            c = nexterm;

            System.out.print( nexterm + " ");

        }

    }
    
}
