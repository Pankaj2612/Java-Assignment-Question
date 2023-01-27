// Write a java program to print the sum of all even numbers and the product of all odd numbers
// from 1 to N. Where, N is the input to the program.
// For input, N = 10
// Sum of all even numbers = 2 + 4 + 6 + 8 + 10 = 30
// Product of all odd numbers = 1 * 3 * 5 * 7 * 9 = 945

import java.util.Scanner;
public class HomeAssignemnt04{
 
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum =0;
        int pro = 1;

        for (int i = 1;i<=n;i++){

            if (i%2 == 0)
                sum = sum + i;            
            else
                pro = pro  * i;
        
    }
        System.out.println("For input , N = " + n);
        System.out.println("Sum of all even number from 1 to " + n + " is : " + sum);
        System.out.println("Product of all odd number from 1 to " + n + " is : " + pro);

    }
    
}
