// Filter and List Specific File Types: Create a Java application that lists all the ".txt" files in a given directory. The program should prompt the user for the directory path and then display a list of all text files found in that directory

import java.io.File;
import java.util.Scanner;
public class Q5 {
	

	    public static void main(String[] args) {
	        // Prompt the user for a directory path
	        Scanner scanner = new Scanner(System.in);
	        System.out.println("Enter the directory path:");
	        String directoryPath = scanner.nextLine();
	        scanner.close();

	        // Create a File object with the specified directory path
	        File directory = new File(directoryPath);

	        // Check if the directory exists
	        if (!directory.exists() || !directory.isDirectory()) {
	            System.out.println("The specified directory does not exist or is not a directory.");
	            return;
	        }

	        // List all ".txt" files in the specified directory
	        System.out.println("Text files in " + directoryPath + ":");
	        File[] files = directory.listFiles();
	        if (files != null) {
	            for (File file : files) {
	                if (file.isFile() && file.getName().endsWith(".doc")) {
	                    System.out.println(file.getName());
	                }
	            }
	        }
	    }
	}
