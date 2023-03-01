package src;

import java.util.Scanner;

// Write a method to find the element present in the Array using Linear Search. The method
// header is given below.
// public static int Lsearch(int[] array, item)
// The method will return the index of the item if the element is present in the array. Otherwise it will
// return -1. Write a java program that prompts the user to enter 5 numbers, and the item to search, then
// invokes this method to display whether the element is present in the array. Here is a sample run of the
// program:
// Sample run:
// Enter ten numbers: 9 5 7 2 6
// Enter the item to search: 7
// The element is present in the array at position: 3

public class q9 {

    public static int Lsearch(int[] array , int item) {
        
        
        int pos=0;
        for(int i = 0; i < array.length;i++){

            if(array[i] == item){
                System.out.print("The element is present in the array at position: ");
                pos = i+1;
                break;
            }

            else
                pos = -1;
        }
        return pos;
    }

    public static void main(String[] args) {

        int arr[] = new int[5];
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Five numbers : ");
        for(int i = 0;i<5;i++){
            
            int x  = sc.nextInt();
            arr[i] = x;
            
        }
        System.out.println("Enter the Item to Search : ");
        int item = sc.nextInt();
        
        System.out.println(Lsearch(arr, item));
        
    }
    
}
