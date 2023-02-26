package src;
// Write a java program to create an array of size N and store the random values between 1 to N in it and
// find the sum and average.

import java.util.Scanner;

public class q1 {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Size of Array : ");
        int N = sc.nextInt();

        int arr[] = new int[N];
        int sum = 0;
        for(int i = 0 ; i < N;i++){

            int ran = 1 + (int)((N -1) * Math.random());
            arr[i] = ran;
            sum += arr[i];
        }
        double avg = sum/N;
        System.out.println("Sum of Array is : "+sum);
        System.out.println("Average of Array is : " + avg);
        
    }
}
