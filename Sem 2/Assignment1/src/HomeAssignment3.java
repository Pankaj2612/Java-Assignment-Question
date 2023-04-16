// Write a Java program that takes two arrays a and b of length n storing int values, and returns
// the dot product of a and b. That is, it returns an array c of length n such that c[i] = a[i] · b[i],
// for i = 0, . . . , n − 1.

import java.util.Arrays;
import java.util.Scanner;
public class HomeAssignment3 {

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    //First Array
    System.out.println("Enter Length of Array a :");
    int n1 = sc.nextInt();
    int[] a = new int[n1];
    System.out.print("Enter the Elements of a : ");
    for (int i = 0; i < a.length; i++) {
        a[i] = sc.nextInt();
    }
    //Second Array
    System.out.println("Enter Length of Array b :");
    int n2 = sc.nextInt();
    int[] b = new int[n2];
    System.out.print("Enter the Elements of b : ");
    for (int i = 0; i < b.length; i++) {
        b[i] = sc.nextInt();
    }

    int m  = (n1<n2)? n1:n2;

    //Product of Array
    int [] c = new int[m];
    for (int i = 0; i < c.length; i++) {
        c[i] = a[i] * b[i];
    }

    System.out.println(Arrays.toString(c));



}
    
}
