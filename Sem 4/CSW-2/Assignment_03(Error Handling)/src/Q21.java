// Design a Java program that performs matrix operations such as addition, multiplication,
// and transpose. Introduce scenarios, where accessing elements beyond the bounds of the
// matrix results in ArrayIndexOutOfBoundsException. Your task is to handle these
// exceptions effectively and provide meaningful error messages indicating the nature of
// the exception

import java.lang.reflect.Array;
import java.util.Arrays;

public class Q21 {


    public static void addMatrix(int [][] matrix , int row , int col , int n){
        try {
            matrix[row][col] += n;
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e);
            System.out.println("The given row and column is out of array index");
        }
    }
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3,4},{5,6,7,8}};

        addMatrix(matrix, 3, 1, 5);
        
        
    }
}
