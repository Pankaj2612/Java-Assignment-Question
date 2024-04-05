// . Demonstration of use nested try-catch block. Write a Java program to handle
// NumberFormatException in outer try-catch block and ArithmeticException inside
// the inner try-catch block.


public class Q15 {
    public static void main(String[] args) {
        int a = 5;
        int b = 0;
        String s = "10.2";
        try {
            System.out.println(Integer.parseInt(s));
            try {
                System.out.println(a/b);
            } catch (ArithmeticException e) {
                // TODO: handle exception
                System.out.println(e);
            }
        } catch (NumberFormatException e) {
            // TODO: handle exception
            System.out.println(e);
        }
    }    
}
