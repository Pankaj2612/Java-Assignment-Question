// Write a program that will read the value of n from the user and calculate sum of the following
// series:

import java.util.Scanner;
public class q9 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of N : ");
        int n = sc.nextInt();

        double sum = 0;
        // int div = 1;

        for (int i =1;i <=n ; i++){

            sum = sum + 1/(Math.pow(i, 2));

        }
        System.out.println("The sum of the Series is : " + sum);

        
    }
    
}
