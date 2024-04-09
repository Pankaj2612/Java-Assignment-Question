// Design a Java program that evaluates the value of the function (sin(x) * cos(x)) / (sin(x) 
// + cos(x)) for a given value of x. Handle potential arithmetic exceptions that may arise 
// due to invalid mathematical operations

public class Q13 {
    public static void main(String[] args) {
        double x = Math.PI/4;
        double sinx = Math.sin(x);
        double cosx = Math.cos(x);
        

        try {
            System.out.println((sinx * cosx) + cosx);
        } catch (ArithmeticException e) {
            // TODO: handle exception
            System.out.println(e);
        }
    }
}
