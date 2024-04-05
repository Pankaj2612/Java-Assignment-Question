// Implement a Java program that calculates the value of the expression (sin(x) + cos(x))
// / tan(x) for a given value of x. Handle scenarios where x is close to multiples of π/2 to
// avoid division by zero errors.

public class Q10 {
   public static void main(String[] args) {
    double x = Math.toRadians(45);
    int cos = (int)Math.cos(x);
    int sin = (int)Math.sin(x);
   
    try {
        double ans = (sin + cos)/(sin/cos);
        System.out.println(ans);

    } catch (ArithmeticException e) {
        // TODO: handle exception
        System.out.println(e);
    }
   } 
}
