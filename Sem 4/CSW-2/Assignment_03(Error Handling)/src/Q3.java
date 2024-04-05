// Implement a custom NullPointerException class named
// CustomNullPointerException that mimics the behavior of the standard
// NullPointerException, but instead of using default error messages or null references,
// it takes a String message as its constructor argument. Your task is to create this custom
// exception class and demonstrate its usage in a Java program

class CustomNullPointerException extends NullPointerException{
    CustomNullPointerException(String s){
        super(s);
    }
}

public class Q3 {
    public static void main(String[] args) {
        try {
            String s = null;
            throw new CustomNullPointerException("The String ius Null");
        } catch (CustomNullPointerException e) {
            // TODO: handle exception
            System.out.println(e);
        }
    }
}
