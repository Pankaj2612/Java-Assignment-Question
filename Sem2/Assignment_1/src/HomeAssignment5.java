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
        
        //TO Generate 2-D Array
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                int r = 0 +( int)(2*Math.random());
                m[i][j] = r;
            }
        }  
        //To Display Array
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                System.out.print(m[i][j] + " ");
            }
            System.out.println();
        }

    
        int max1 =0;
        int max2 =0;
        int rowno= 0;
        int colno = 0;
        for (int i = 0; i < m.length; i++) {
            int rowones = 0;
            int colones = 0;
            for (int j = 0; j < m.length; j++) {
                if(m[i][j] == 1){
                    rowones++;
                }
                if(m[j][i] == 1){
                    colones++;
                }
                if(max2<colones){
                    max2 = colones;
                    colno = i;
                }
            }
            if(max1<rowones){
            max1 = rowones;
            rowno = i;
            }
            
        }        
        System.out.println("The largest row index: "+rowno);
        System.out.println("The largest column index: "+colno);
    }
    
}
