package src;

import java.util.Scanner;

// Design and develop a menu driven java program for the following array operations.
// a. Create an array of N integers
// b. Display the array elements
// c. Insert an element at specific position
// d. Delete an element at a given position
// e. Exit

public class q10 {

    public static int powerclac(int b ,int n) {
        

        if(n==1){
            return 0 ;
        }
        if(b==0)
        return 1;


        if(n%2==0)
        return powerclac(b, n/2) * powerclac(b, n/2);

        else
        return powerclac(b, n/2) * powerclac(b, n/2) * b;
    }

    public static void main(String[] args) {

        
       int ans = powerclac(2, 6);
        System.out.println(ans);


    }
    
}
