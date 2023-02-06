// WAP to enter the value of n and display find the following sum of the series:
// 1 + (1 + 2) + (1+ 2 +3) ..... + (1 + 2 + 3 + .... + n)

import java.util.Scanner;
public class q8 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of N : ");
        int n = sc.nextInt();
        int sum =0;

        for (int i=1; i<=n;i++){
            int ans= 0;
            
            for(int j = 1; j<=i;j++){
                
                ans =ans + j; 
                
            }
            sum += ans ;
        
        }
        System.out.println("The Sum of 1 + (1 + 2) + (1+ 2 +3) ..... + (1 + 2 + 3 + .... + "+ n + " )  is : " + sum);

    }
}
