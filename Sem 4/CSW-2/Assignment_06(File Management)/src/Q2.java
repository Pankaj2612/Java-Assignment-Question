// 2.Read from a File: Write a Java application that opens the "diary.txt" file created in the previous question and displays its content on the console. The program should handle cases where the file does not exist by displaying an appropriate error message.


	import java.io.File;
	import java.io.FileNotFoundException;
	import java.util.Scanner;

	public class Q2 {

	    public static void main(String[] args) {
	        // Attempt to open and read the file
	        try {
	            File file = new File("diary.txt");
	            if (!file.exists()) {
	                System.out.println("The diary file does not exist.");
	                return;
	            }

	            Scanner scanner = new Scanner(file);

	            // Read and display each line of the file
	            System.out.println("Diary Entries:");
	            while (scanner.hasNextLine()) {
	                String line = scanner.nextLine();
	                System.out.println(line);
	            }
	            
	            scanner.close();
	        } catch (FileNotFoundException e) {
	            System.err.println("Error: File not found - " + e.getMessage());
	        }
	    }
	}
