// Write a java program to find the difference between the sum of the squares of the first ten
// natural numbers and the square of the sum.
// The sum of the squares of the first ten natural numbers is:
// 1
// 2 + 22 + 32 + 42 + 52 + 62 + 72 + 82 + 92 + 102 = 385
// The square of the sum of the first ten natural numbers is:
// (1 + 2 + ... + 10)2 = 552 = 3025
// Hence the difference between the sum of the squares of the first
// ten natural numbers and the square of the sum is 3025 − 385 =
// 2640.


public class HomeAssignemnt01
 {
    public static void main(String[] args) {
        int sum1=0;
        int sum2 = 0;
        int pow; 

        // The square of the sum of the first ten natural numbers
        for (int i = 1;i<=10;i++){

            sum1 += i;
            
        }
        sum1 = (int)Math.pow(sum1, 2);
        System.out.println("Square of the sum of the first ten natural numbers is : " +sum1);
        System.out.println();

        // The sum of the squares of the first ten natural numbers
        for (int j = 1;j <=10;j++){

            pow = j;
            pow = (int)Math.pow(pow, 2);
            sum2 = sum2 + pow;
            
        }
        
        System.out.println("Sum of the squares of the first ten natural numbers is : " + sum2);
        System.out.println();

        // Difference 
        int diff = sum1 - sum2;
        System.out.println("Hence the difference between the sum of the squares of the first ten natural numbers and the square of the sum is " + sum1 + " - " + sum2 + " = " + diff );


    }    
}
