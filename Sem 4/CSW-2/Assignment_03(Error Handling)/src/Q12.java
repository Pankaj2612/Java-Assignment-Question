// Create a Java application that calculates the value of the expression sqrt(abs(sin(x) * 
// cos(x))) / (tan(x) + 1) for a given value of x. Handle cases where x leads to division 
// by zero or negative values inside the square root function.

public class Q12 {
    public static void main(String[] args) {
        double x = Math.PI/2;
        double sinx = Math.sin(x);
        double cosx = Math.cos(x);
        double tanx = sinx/cosx;

        try {
            System.out.println(Math.abs(sinx * (cosx/tanx+1)));
        } catch (ArithmeticException e) {
            // TODO: handle exception
            System.out.println(e);
        }
    }
}
