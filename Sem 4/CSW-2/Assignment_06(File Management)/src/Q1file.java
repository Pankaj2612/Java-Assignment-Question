// Create and Write to a File: Write a Java program that prompts the user for a diary entry, then creates a file named "diary.txt" and writes the current date followed by the user's entry into this file. Ensure the program checks if the file already exists and informs the user, to avoid overwriting any previous content
	import java.io.File;
	import java.io.FileWriter;
	import java.io.IOException;
	import java.util.Scanner;
	import java.time.LocalDate;
	import java.time.format.DateTimeFormatter;
	public class Q1file {

	    public static void main(String[] args) {
	        // Prompt the user for a diary entry
	        Scanner scanner = new Scanner(System.in);
	        System.out.println("Enter your diary entry:");
	        String entry = scanner.nextLine();
	        scanner.close();

	        // Get the current date
	        LocalDate currentDate = LocalDate.now();
	        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");

	        // Construct the entry to write into the file
	        String entryToWrite = currentDate.format(formatter) + "\n" + entry;

	        // Write the entry to the file
	        File file = new File("diary.txt");
	        if (file.exists()) {
	            System.out.println("File already exists. Appending to the existing file.");
	        }

	        try (FileWriter writer = new FileWriter(file, true)) {
	            writer.write(entryToWrite);
	            System.out.println("Entry successfully written to diary.txt");
	        } catch (IOException e) {
	            System.err.println("An error occurred while writing to the file: " + e.getMessage());
	        }
	    }
	}
