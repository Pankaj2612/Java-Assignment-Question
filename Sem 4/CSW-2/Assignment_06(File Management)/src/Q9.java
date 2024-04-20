// 9.Display File Metadata: Create a Java program that displays metadata of a specified file. The user should be able to input the file name, and the program should output the file size, last modified date, and other available attributes.

import java.io.File;  // Import the File class

public class Q9{ 
  public static void main(String[] args) {
    File myObj = new File("C:\\Users\\ITER\\eclipse-workspace12\\filess\\src\\filess\\output.txt");
    if (myObj.exists()) {
      System.out.println("File name: " + myObj.getName());
      System.out.println("Absolute path: " + myObj.getAbsolutePath());
      System.out.println("Writeable: " + myObj.canWrite());
      System.out.println("Readable " + myObj.canRead());
      System.out.println("File size in bytes " + myObj.length());
      System.out.println("File modified " + myObj.lastModified());
    } else {
      System.out.println("The file does not exist.");
    }
  }
}