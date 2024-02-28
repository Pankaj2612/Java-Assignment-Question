// Write a java method using Generics to count the occurrence of an element in an array of any
// type. The signature of count method is given below.
// public static <T> int count(T[] array, T item)
// Sample run:
// Enter array elements
// 1
// 2
// 3
// 4
// 5
// Enter the element to search
// 4
// Number of times 4 present in the array is 1

import java.util.Scanner;

public class Q5{

    public static <T> int count(T[] array, T item){

        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if(array[i] == item)
                count++;
        }
        return count;
        }
    

    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        
        
        Integer[] intarr = new Integer[5];
        System.out.println("Enter the Array Elements ");
        for (int i = 0; i < intarr.length; i++) {
            
            intarr[i] = sc.nextInt();
        }
        System.out.println("Enter the element to search ");
        int item = sc.nextInt();
        System.out.println("Number of times " +item + " present in the array is " +  count(intarr, item));

    }

}