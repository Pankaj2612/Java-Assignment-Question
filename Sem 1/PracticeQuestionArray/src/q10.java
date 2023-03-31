package src;

import java.util.Arrays;
import java.util.Scanner;

// Design and develop a menu driven java program for the following array operations.
// a. Create an array of N integers
// b. Display the array elements
// c. Insert an element at specific position
// d. Delete an element at a given position
// e. Exit

public class q10 {


    public static int[] Insertaelement(int [] oldarray ,int pos , int element) {

        int[] newarray = new int[oldarray.length+1];

    
        for (int i = 0,j=0 ; i < oldarray.length; i++,j++) {

            if (i==(pos-1)){
                newarray[j] = element;
                j++;
            }
            newarray[j] = oldarray[i];

        }
            return newarray;
        
    }

    public static int [] DeleteanElemnt(int[] num, int pos) {

        int [] arr = new int[num.length-1];
        int j =0 ;

        for (int i = 0; i < num.length; i++) {
            if(i != (pos-1)){
                arr[j++] = num[i];
            }
        }
        return arr;
        
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Lets Create an array First:");
        System.out.print("Enter the Length of the array :");
        int n = sc.nextInt();
        int [] arr = new int[n];
        System.out.print("Enter an Array's Elements : ");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        boolean run = true;
        while (run){
        System.out.println("Do you want see the array elements : ('a')");
        System.out.println("Do you want to Insert an element at specific position : ('b')");
        System.out.println("Do you to Delete an element at a given position : ('c')");
        System.out.println("Do you want to Exit the Program : (e)");
        char in = sc.next().charAt(0);
        switch (in) {
            case 'a':
                System.out.println(Arrays.toString(arr));
                break;
            case 'b':
                System.out.println("Enter the Position You want to Insert the element : ");
                int idx = sc.nextInt();
                System.out.println("Enter the Element you want to Insert in the array : ");
                int element = sc.nextInt();
                arr = Insertaelement(arr,idx, element);
                System.out.println("Element Added");
                break;
        
            case 'c':
                System.out.println("Enter the Positon of Elemnt you want to delete : ");
                int pos = sc.nextInt();
                arr = DeleteanElemnt(arr, pos);
                System.out.println("Element Deleted ");
                break;
            case 'e':
                run = false;
                break;
            default:
                System.out.println("Enter a valid Input only:");
                break;
        }


        }
    }
}
