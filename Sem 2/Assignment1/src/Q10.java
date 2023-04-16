// Write a method that returns the sum of all the elements in a specified column in a matrix
// using the following header:
// public static double sumColumn(double[][] m, int columnIndex)
// Write a java program that reads a 3-by-4 matrix and displays the sum of each column.
// Sample Run:
// Enter a 3-by-4 matrix row by row:
// 1.5 2 3 4
// 5.5 6 7 8
// 9.5 1 3 1
// Sum of the elements at column 0 is 16.5
// Sum of the elements at column 1 is 9.0
// Sum of the elements at column 2 is 13.0
// Sum of the elements at column 3 is 13.0

import java.util.Scanner;
public class Q10 {
    public static double sumColumn(double[][] m){
        for (int i = 0; i < 4; i++) {
            double sum = 0.0;
            for (int j = 0; j < 3; j++) {
                sum +=  m[j][i];
            }
            System.out.println("Sum of the elements at column " + i +" is "+ sum);
        }

        return 0.0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a 3-by-4 matrix row by row: ");
        double [][] arr = new double[3][4]; 
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
               arr[i][j] = sc.nextDouble();
                
            }
        }
        sumColumn(arr);
    }
}
