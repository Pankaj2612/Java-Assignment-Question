// Write a java method to calculate the sum of digits of a given number until the number is a
// single digit. The method signature is as follows.
// public static int sum_Of_Digits(int n)

import java.util.Scanner;
public class Q5 {


    public static void sum_Of_Digits(int n ) {

        int sum = 0;
        if (n/10==0){
            System.out.println(n);
            return;
        }
        while (n!=0) {
            int d = n%10;
            sum += d;
            n = n/10;
        }

        sum_Of_Digits(sum);
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sum_Of_Digits(n);
        }

    }

