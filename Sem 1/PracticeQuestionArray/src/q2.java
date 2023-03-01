package src;
// Write a java program to create an array of size N and store the random values between 1 to 100 in it
// and print the number of prime numbers present in the array.
// Sample run:
// Enter number of elements 5
// Enter Array elements:
// 11 22 33 39 43
// The number of prime numbers are 2.
import java.util.Scanner;

public class q2 {

    //Method to check if a number is prime or not!
    public static boolean isPrime(int x ) {

        for(int i = 2; i < x ; i++){
            if(x%i == 0)
                return false;
        }
        
        return true;
    }

    public static void main(String[] args) {
        
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements : ");
        n = sc.nextInt();
        int count = 0;
        int arr[] = new int[n];
        System.out.print("Enter Array Elemets : ");
        for(int i = 0 ; i < n ; i++){

            arr[i] = sc.nextInt();
            if(isPrime(arr[i]) == true){
                count++;
            }
        }
        System.out.println("The number of prime numbers are " + count + " .");
    
    }
    
}
