package src;
// Write a method to find the largest element present in the Array. The method header is given
// below.
// public static int max(int[] array)
// Write a java program that prompts the user to enter 5 numbers, invokes this method to return
// the maximum value, and displays the maximum value. Here is a sample run of the program:
// Sample run:
// Enter five numbers: 9 5 7 2 3
// The maximum number is: 9

import java.util.Scanner;
public class q5 {


    public static int max(int [] array) {

        int largest = array[0];
        for(int i = 0 ; i<array.length;i++){
            if ( largest < array[i])
                largest = array[i];
        }
        return largest;
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int arr[] = new int[5];
        System.out.print("Enter Five numbers : ");
        for(int i = 0;i<5;i++){
            
            int x  = sc.nextInt();
            arr[i] = x;
            
        }
        System.out.println("The maximum number is: "+max(arr));
    }
}
