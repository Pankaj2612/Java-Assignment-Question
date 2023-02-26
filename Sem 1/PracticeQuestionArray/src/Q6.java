package src;

// Write a method to find the second smallest element present in the Array. The method header
// is given below.
// public static double sec_small(double[] array)
// Write a java program that prompts the user to enter ten numbers, invokes this method to return
// the second minimum value, and displays the second minimum value. Here is a sample run of the
// program:
// Sample run:
// Enter ten numbers: 1.9 2.5 3.7 2 1.5 6 3 4 5 2
// The second minimum number is: 1.9

import java.util.Scanner;
public class Q6 {
    public static double sec_small(double[] array){

        double small = array[0];
        double sec_small = array[0];
        for(int i = 1 ; i<array.length;i++){
            if ( small > array[i])
                small = array[i];
        }
        for(int k = 1 ;k <array.length;k++){
            if (sec_small > array[k] && sec_small != small){
                sec_small = array[k];
                break;
            }
        }
                    
        return sec_small;

    }    

public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
        
        double arr[] = new double[10];
        System.out.print("Enter ten numbers : ");
        for(int i = 0;i<10;i++){
            
            double x  = sc.nextDouble();
            arr[i] = x;
            
        }
        System.out.println("The second minimum number is: " + sec_small(arr));
    
}
}

                         