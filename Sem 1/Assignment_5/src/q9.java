// Write a program that will read the value of n from the user and calculate sum of the following
// series:
//1 + 1 + 1 + 1 + ......... 1
//-   -   -   -   ......... -  //This lines means divde not minus
//1^2 2^2 3^2 4^2 ......... n^2

import java.util.Scanner;
public class q9 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of N : ");
        int n = sc.nextInt();

        double sum = 0;
        

        for (int i =1;i <=n ; i++){

            sum = sum + 1.0/(i*i);

        }
        System.out.println("The sum of the Series is : " + sum);

        
    }
    
}
