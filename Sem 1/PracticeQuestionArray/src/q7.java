package src;
// Write a method to find the second largest element present in the Array. The method header is
// given below.
// public static int sec_max(int[] array)
// Write a java program that prompts the user to enter 5 numbers, invokes this method to return
// the maximum value, and displays the maximum value. Here is a sample run of the program:
// Sample run:
// Enter ten numbers: 9 5 7 2 3
// The second maximum number is: 7

import java.util.Scanner;
public class q7 {

    public static int sec_max(int [] array) {

        int largest = array[0];
        int sec_largest = array[0];
        for(int i = 1 ; i<array.length;i++){
            if (largest < array[i])
                largest = array[i];
        }
        for(int i = 1 ; i<array.length;i++){
            if (sec_largest < array[i] && array[i] < largest){
                sec_largest = array[i];
        }
    }
        return sec_largest;
    
}
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        
        int arr[] = new int[5];
        System.out.print("Enter Five numbers : ");
        for(int i = 0;i<5;i++){
            
            int x  = sc.nextInt();
            arr[i] = x;
            
        }
        System.out.println("The maximum number is: "+sec_max(arr));
    }
}
