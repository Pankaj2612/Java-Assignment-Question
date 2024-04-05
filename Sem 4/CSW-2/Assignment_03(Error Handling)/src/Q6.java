// Write a Java program to handle NumberFormatException.

public class Q6 {
   public static void main(String[] args) {
    try {
        String str = "10.5";
        Integer i = new Integer(str);
        System.out.println(i);
    } catch (NumberFormatException e) {
        // TODO: handle exception
        System.out.println(e);
    }
   } 
}
