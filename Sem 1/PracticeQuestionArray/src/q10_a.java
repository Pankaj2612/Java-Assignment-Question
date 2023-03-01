package src;

import java.util.Scanner;

// Design and develop a menu driven java program for the following array operations.
// a. Create an array of N integers
// b. Display the array elements
// c. Insert an element at specific position
// d. Delete an element at a given position
// e. Exit

public class q10_a {

  public static void main(String[] args) {
    // System.out.println("a. Create an array of N integers");
    // System.out.println("b. Display the array elements`");
    // System.out.println("c. Insert an element at specific position");
    // System.out.println("d. Delete an element at a given position");
    // System.out.println("e. Exit");

    Scanner sc = new Scanner(System.in);
    System.out.println("Let's Create an Array of N Integers ");
    int n = sc.nextInt();
    int arr[] = new int[n];

    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }

    for (int i : arr) System.out.println(i);

    System.out.println(
      "To insert an Element at Specific postion (Please Enter the postion and element : )"
    );
    int p = sc.nextInt();
    int v = sc.nextInt();

    arr[p] = v;

    System.out.println(
      "To delete an Element at Specific postion (Please Enter the postion)"
    );
  }
}
