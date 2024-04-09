// Implement a Java application that computes the value of the expression log(abs(sin(x)
// + cos(x))) / (tan(x) - cot(x)) for a given value of x. Ensure proper error handling for
// potential arithmetic exceptions and negative values inside the logarithmic function.

public class Q14 {
    public static void main(String[] args) {
        double x = Math.PI/4;
        double sinx = Math.sin(x);
        double cosx = Math.cos(x);
        double tanx = sinx/cosx;
        double cotx = 1/tanx;


        try {
            System.out.println(Math.log(Math.abs((sinx + cosx) / (tanx - cotx))));
        } catch (ArithmeticException e) {
            // TODO: handle exception
            System.out.println(e);
        }
    }
}