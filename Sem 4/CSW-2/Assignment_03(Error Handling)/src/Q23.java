// Write a program that reads data from a file and performs some processing. Handle
// checked IOException by using try-catch block to catch and handle the exception

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Q23 {
   public static void main(String[] args) throws IOException {
        try {
            FileInputStream fs = new FileInputStream("C:/Users/hp/Desktop/SEC-13/CSW2/Assignment_04/src/file.txt");
            int i = 0;
            while ((i=fs.read()) != -1) {
                System.out.println((char)i);
            }
            fs.close();
        } catch (Exception e) {
            // TODO Auto-generated catch block
            System.out.println(e);
        }

   } 
}
