import java.util.Arrays;
import java.util.Scanner;

// Write a method to add two matrices. The header of the method is as follows:
// public static double[][] addMatrix(double[][] a, double[][] b)
// In order to be added, the two matrices must have the same dimensions and the same or
// compatible types of elements.


public class HomeAssignment4 {

    public static double[][] addMatrix(double[][] a, double[][] b){

        double[][] m = new double[a.length][a.length];

        if (a.length != b.length) {
            System.out.println("Enter Matrix with same Dimension");
        }
        else{
            for (int i = 0; i < a.length; i++) {
                for (int j = 0; j < a.length; j++) {
                    m[i][j] = a[i][j] + b[i][j];
                }
            }
        }

        return m;

    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
    //First Array
    System.out.println("Enter Length of Array a :");
    int n1 = sc.nextInt();
    double[][] a = new double[n1][n1];
    System.out.print("Enter the Elements of a : ");
    for (int i = 0; i < a.length; i++) {
        for (int j = 0; j < a.length; j++) {
            a[i][j] = sc.nextDouble();
        }
    }
    //Second Array
    System.out.println("Enter Length of Array b :");
    int n2 = sc.nextInt();
    double[][] b = new double[n2][n2];
    System.out.print("Enter the Elements of b : ");
    for (int i = 0; i < b.length; i++) {
        for (int j = 0; j < b.length; j++) {
            b[i][j] = sc.nextDouble();
        }
    }

    double[][] ans = addMatrix(a,b);

    for (int i = 0; i < ans.length; i++) {
        for (int j = 0; j < ans.length; j++) {
            System.out.print(ans[i][j] + " ");
        }
        System.out.println();
    }

    }
    
}
