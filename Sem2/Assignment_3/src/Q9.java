// The sequence of numbers 1, 1, 2, 3, 5, 8, 13 etc are called Fibonacci numbers,
// each is the sum of the preceding two. Write a recursive method in Java which, given n,
// returns the nth Fibonacci number.


public class Q9 {

    public static int  Fibonacci(int x) {
        
        if(x<2)
            return x;

        else
            return (Fibonacci(x-1) + Fibonacci(x-2));

    }

    public static void main(String[] args) {
        System.out.println(Fibonacci(7));
    }
}

