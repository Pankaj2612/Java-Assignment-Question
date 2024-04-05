// Implement a Java program to handle StackOverflowError.

public class Q28 {
    public static void endless() {
        endless();
    }
    public static void main(String[] args) {
        try {
            endless();
        } catch (StackOverflowError e) {
            // TODO: handle exception
            System.out.println(e);
        }
    }
}
