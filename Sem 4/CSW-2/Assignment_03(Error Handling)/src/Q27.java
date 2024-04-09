// Write a program to handle ClassCastException.

public class Q27 {
    public static void main(String[] args) {
        try {
            Object obj = "Hello";
            Integer intValue = (Integer) obj; 
            System.out.println("Casting successful: " + intValue);
        } catch (ClassCastException e) {
            // Handle ClassCastException
            System.out.println("ClassCastException occurred: " + e.getMessage());
        }
    }
}
