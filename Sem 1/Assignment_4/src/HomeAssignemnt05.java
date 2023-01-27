// Write a java program to print the following output using loop. Where, input is the number of
// rows in output pattern.
// For input, N = 4.
// 1
// 121
// 1213121
// 121312141213121

import java.util.Scanner;
public class HomeAssignemnt05 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number of Rows : ");
        int n = sc.nextInt();

        String p = " ";

        for(int i = 1;i <=n ;i++){
            
            p += (i+p);
            System.out.println(p);

        }

    }
    
}
