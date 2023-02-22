// Write a java program to evaluate the function sin(x) as defined by the infinite series expansion.
// cos (x) = 
// The acceptable error for computation is 10-6
// .

import java.util.Scanner;
public class HomeAssignment04 {

    public static void main(String[] args) {
        
        int x;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Vlue of x : ");
        x = sc.nextInt();
        double term = 1;
        double sum = term;
        int i =2;
        double error = 0.000001;
        while(Math.abs(term)>error){
    
            term = (-1)*(term*(x*x))/((i-1)*i);
            sum = sum + term;
            i= i+2;
    
        }
        System.out.println("cos(" + x + ")= "+ sum );
            
    
        }
    
}
