// Write a Java method that accept three integers and check whether they are consecutive are not.
// Return true or false.
// Expected Output:
// Input the first number: 15
// Input the second number: 16
// Input the third number: 17
// Check whether the three said numbers are consecutive or not!
// true

import java.util.Scanner;

public class HomeAssignment_05 {

    public static boolean isConsecutive(int x , int y , int z) {

        boolean p = false;
        if(x+1==y && y+1 ==z)
        p = true;

        return p;
        
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Input First number : ");
        int x = sc.nextInt();
        System.out.print("Input Second number : ");
        int y = sc.nextInt();
        System.out.print("Input Third number : ");
        int z = sc.nextInt();

        System.out.println( "Check whether the three said numbers are consecutive or not! " );
        System.out.println(isConsecutive(x, y, z));

    }
    
}
