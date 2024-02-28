// Write a recursive method in Java to search an element of an array using binary search.
// Sample run-1:
// Enter number of elements in the array
// 5
// Enter 5 number of elements in ascending order
// 11
// 22
// 33
// 44
// 55
// Enter the element to search
// 33
// The 33 is present at index 2

import java.util.Scanner;

public class HomeAssignment_02 {
    

    public static int BinarySearch(int[] arr ,int s , int e , int target) {

        int m = (s + e)/2;

        if(arr[m] == target){
            return m;
        }

        else if(arr[m] < target){
            s = m + 1;
        }
        else if(arr[m] > target){
            e = m-1;
        }

        return BinarySearch(arr, s, e , target);
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter number of elements in the array");
        int size = sc.nextInt();

        int[] arr = new int[size];
        System.out.println("Enter "+ size +  " number of elements in ascending order");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the element to search");
        int target = sc.nextInt();
        int e = arr.length - 1;
        int ans = BinarySearch(arr, 0, e, target);
        System.out.println("The " + target + " is present at index "+ ans );

    }

}
