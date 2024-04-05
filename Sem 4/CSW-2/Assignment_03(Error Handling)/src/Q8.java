// Write a Java program to find the quare root of integer numbers. Demonstrate the use of
// try-catch block to handle ArithmeticException.

public class Q8 {
   public static void main(String[] args) {
    int n = -23;
    try {
        if(n < 0 ){
            throw new ArithmeticException("Square root of negative number is Imagainary");
        }

    } catch (ArithmeticException e) {
        // TODO: handle exception
        System.out.println(e);
    }
   } 
}
