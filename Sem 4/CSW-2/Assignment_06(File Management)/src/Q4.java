// List Files and Directories: Write a program in Java that asks the user for a directory path and then lists all files and subdirectories in that directory. If the directory does not exist, the program should inform the user

import java.io.File;
import java.util.Scanner;
public class Q4{
	    public static void main(String[] args) {
	        // Prompt the user for a directory path
	        Scanner scanner = new Scanner(System.in);
	        System.out.println("Enter the directory path:");
	        String Path = scanner.nextLine();
	        scanner.close();

	        // Create a File object with the specified directory path
	        File directory = new File(Path);

	        // Check if the directory exists
	        if (!directory.exists() || !directory.isDirectory()) {
	            System.out.println("The specified directory does not exist.");
	            return;
	        }

	        // List all files and subdirectories in the specified directory
	        System.out.println("Files and subdirectories in " + Path + ":");
	        File[] f = directory.listFiles();
	        if (f != null) {
	            for (File ob : f) {
	                if (ob.isFile()) {
	                    System.out.println("File: " + ob.getName());
	                } else if (ob.isDirectory()) {
	                    System.out.println("Directory: " + ob.getName());
	                }
	            }
	        }
	    }
	}
