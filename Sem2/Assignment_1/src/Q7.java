// Write a java program to find the maximum and minimum and how many times they both occur
// in an array of n elements. Find out the positions where the maximum first occurs and the
// minimum last occurs.
// Sample Run:
// Enter number of elements of Array: 5
// Enter elements of the array: 12 14 12 14 13
// Maximum element of Array is 14 and occurs 2 times.
// Minimum element of Array is 12 and occurs 2 times.
// First occurrence of maximum element is at position 2.
// Last occurrence of minimum element is at position 3.

import java.util.Scanner;
public class Q7 {
    
    public static void main(String[] args) {
        //Array Input
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number of Elements of Array : ");
        int  n= sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter elements of the array: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        //To Find Maxima
        int maximum = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (maximum < arr[i]){
                maximum = arr[i];
            }
        }

        //To find Minima
        int minimum = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (minimum > arr[i]){
                minimum = arr[i];
            }
        }

        //To Find Occurence of Maximum
        int occur1 = 0;
        for (int i = 0; i < arr.length; i++) {
            if (maximum == arr[i])
                occur1++;          
        }

        System.out.println("Maximum element of Array is "+ maximum + " and occurs " + occur1 + " times.");


        //To Find Occurence of Minimum
        int occur2 = 0;
        for (int i = 0; i < arr.length; i++) {
            if (minimum == arr[i])
                occur2++;
        }

        System.out.println("Minimum element of Array is "+ minimum +" and occurs " + occur2 + " times.");

        //First Occurence
        for (int i = 0; i < arr.length; i++) {
            if(maximum == arr[i]){
                int pos = i+1;
                System.out.println("First occurrence of maximum element is at position " + pos);
                break;
            }

        }
        //Last Occurence
        for (int i = 0; i < arr.length; i++) {
            
        }
    }

}
