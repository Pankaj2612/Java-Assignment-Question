// Copy File Content: Write a Java program that copies the content from one file (source) to another (destination). The program should prompt the user for both source and destination file paths and perform the copy operation, ensuring that it doesn't overwrite an existing file without user confirmation

import java.io.*;

public class Q7 {
    public static void main(String[] args) {
        try {
            String sourceFile = "C:\\Users\\ITER\\eclipse-workspace12\\filess\\src\\filess\\Input.txt";
            String destFile = "C:\\Users\\ITER\\eclipse-workspace12\\filess\\src\\filess\\output.txt";
            // Create file readers and writers for copying
            FileInputStream reader = new FileInputStream(sourceFile);
            FileOutputStream writer = new FileOutputStream(destFile);

            // Copy content from source file to destination file
            int c;
            while ((c = reader.read()) != -1) {
                writer.write((char) c);

            }
            System.out.println("File content copied successfully.");
        } catch (IOException e) {
            System.out.println("Error occurred during file copy: " + e.getMessage());
        }

    }
}
