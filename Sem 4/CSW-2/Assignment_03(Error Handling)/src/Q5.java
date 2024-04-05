// Develop a program that performs complex mathematical (may have log, trigonometric
// and algebraic functions) computations. Handle unchecked NullPointerException
// gracefully using try-catch block and provide a meaningful error message

public class Q5 {
    public static void main(String[] args) {

        try {
            int i = null;
            System.out.println(Math.log(i));
        } catch (NullPointerException e) {
            // TODO: handle exception
            System.out.println(e);

        }

    }
}
