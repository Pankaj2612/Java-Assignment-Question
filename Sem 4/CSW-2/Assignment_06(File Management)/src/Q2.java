package fileanswers;


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
