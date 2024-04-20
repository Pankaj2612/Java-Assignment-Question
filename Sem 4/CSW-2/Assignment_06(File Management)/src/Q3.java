// 3.Append Content to an Existing File: Write a Java program that adds a new diary entry to the "diary.txt" file without overwriting its existing content. The program should ask the user for the new entry and append it to the file along with a timestamp.

	import java.io.FileWriter;
	import java.io.IOException;
	import java.io.PrintWriter;
	import java.time.LocalDateTime;
	import java.time.format.DateTimeFormatter;
	import java.util.Scanner;

public class Q3 {



	    public static void main(String[] args) {
	        // Prompt the user for a new diary entry
	        Scanner scanner = new Scanner(System.in);
	        System.out.println("Enter your new diary entry:");
	        String newEntry = scanner.nextLine();
	        scanner.close();

	        // Get the current timestamp
	        LocalDateTime currentTime = LocalDateTime.now();
	        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy HH:mm:ss");

	        // Format the entry with timestamp
	        String formattedEntry = currentTime.format(formatter) + "\n" + newEntry;

	        // Append the entry to the file
	        try (FileWriter fileWriter = new FileWriter("diary.txt", true);
	             PrintWriter printWriter = new PrintWriter(fileWriter)) {
	            printWriter.println(formattedEntry);
	            System.out.println("Entry successfully appended to diary.txt");
	        } catch (IOException e) {
	            System.err.println("An error occurred while appending to the file: " + e.getMessage());
	        }
	    }
	}
