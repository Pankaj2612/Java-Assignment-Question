// Write a java program that randomly fills in 0s and 1s into a 4-by-4 matrix, prints the matrix,
// and finds the first row and column with the most 1s.
// Sample run:
// 0 0 1 1
// 0 0 1 1
// 1 1 0 1
// 1 0 1 0
// The largest row index: 2
// The largest column index: 2

import java.util.Scanner;
public class HomeAssignment5 {

    public static void main(String[] args) {

        int[][] m = new int[4][4];
        
        
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                int r = 0 +( int)(2*Math.random());
                m[i][j] = r;
            }
        }
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                System.out.print(m[i][j] + " ");
            }
            System.out.println();
        }

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                if(m[i][j] == 1){
                
                }
            
            }
        }        
        
    }
    
}
