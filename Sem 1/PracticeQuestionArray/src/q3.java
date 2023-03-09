package src;

// Write a java program using an array that reads the integers between 1 and 100 and counts the
// occurrences of each. Assume the input ends with 0.
// Sample run:
// Enter the integers between 1 and 100: 2 5 6 5 4 3 23 43 2 0
// 2 occurs 2 times
// 3 occurs 1 time
// 4 occurs 1 time
// 5 occurs 2 times
// 6 occurs 1 time
// 23 occurs 1 time
// 43 occurs 1 time
// Note: If a number occurs more than one time, the plural word “times” is used in the output
import java.util.Scanner;

public class q3 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter Array Elemets : ");

    int arr[] = new int[100];
    int count = 0;
    int x;
    do {
      x = sc.nextInt();
      arr[count] = x;
      count++;
    } while (x != 0);

    int newarr[] = new int[count - 1];
    for (int i = 0; i < (count - 1); i++) {
      newarr[i] = arr[i];
    }
    int n = 0;
    for (int i = 0; i < newarr.length; i++) {
      int occur = 0;
      if (n >= newarr[i]) {
        continue;
      } else {
        n = newarr[i];
        for (int j = 0; j < newarr.length; j++) {
          if (newarr[i] == newarr[j]) occur++;
        }
        System.out.print(newarr[i] + " occurs " + occur);
        if (occur == 1) System.out.println(" time ."); else System.out.println(
          " times ."
        );
      }
    }
  }
}
