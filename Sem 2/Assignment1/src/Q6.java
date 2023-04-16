// Write a Java method, isOdd( ), that takes an int i and returns true if and only if i is odd. Your
// method can't use the multiplication, modulus, or division operators, The method signature is
// as follows.
// public static boolean isOdd(int n)
// Sample Run:
// Enter a number 37
// 37 is odd: true

import java.util.Scanner;
public class Q6 {
    public static boolean isOdd(int n ) {
        boolean ans = false;
        while(true){
            n = n-2;
            if (n==1){
                ans = true;
                break;
            }
            else if(n==0){
                break;
            }
        
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number ");
        int n = sc.nextInt();
        System.out.println(n + " is odd : " + isOdd(n));
    }
}
