package src;
// Write a method to find the smallest element present in the Array. The method header is given
// below.
// public static double min(double[] array)
// Write a java program that prompts the user to enter ten numbers, invokes this method to return
// the minimum value, and displays the minimum value. Here is a sample run of the program:
// Sample run:
// Enter ten numbers: 1.9 2.5 3.7 2 1.5 6 3 4 5 2
// The minimum number is: 1.5

import java.util.Scanner;
public class q4 {



    public static double min(double [] array) {

        double small = array[0];
        for(int i = 0 ; i<array.length;i++){
            if ( small > array[i])
                small = array[i];
        }
        return small;
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        double arr[] = new double[10];
        System.out.print("Enter ten numbers : ");
        for(int i = 0;i<10;i++){
            
            double x  = sc.nextDouble();
            arr[i] = x;
            
        }
        System.out.println("The minimum number is: "+min(arr));
    }
}
