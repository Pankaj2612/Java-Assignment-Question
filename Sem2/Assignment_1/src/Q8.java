// Write a java program to print M-by-N array in the tabular format. Also, display the sum of
// elements of the array.
// Sample Run:
// Enter number of Row and Columns of 2D-Array: 3 3
// Enter elements of 2D-Array: 1 2 3 2 3 4 3 4 5
// The elements of 2D array are:
// 1 2 3
// 2 3 4
// 3 4 5
// The sum of elements of the 2D-Array is 27

import java.util.Arrays;
import java.util.Scanner;
public class Q8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of Row and Columns of 2D-Array: ");
        int row = sc.nextInt();
        int col = sc.nextInt();
        int[][] arr = new int[row][col];
        int sum=0;
        System.out.print("Enter elements of 2D-Array: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr[i][j] = sc.nextInt();
                sum += arr[i][j];
            }
        }
        System.out.println("The elements of 2D array are: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("The sum of elements of the 2D-Array is "+ sum);
    }
}
