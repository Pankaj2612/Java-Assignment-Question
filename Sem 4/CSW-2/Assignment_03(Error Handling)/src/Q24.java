// Write a Java program to demonstrate a checked exception (e.g.,
// FileNotFoundException) being thrown and caught using try-catch block

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Q24 {
    public static void main(String[] args) {
        try {
            FileInputStream fs = new FileInputStream("sds");
        } catch (FileNotFoundException e) {
            // TODO: handle exception
            System.out.println(e);
        }
    }    
}
