// 10.Recursive Directory Listing: Write a Java program that recursively lists all files and subdirectories within a given directory. The program should prompt the user for the directory path and then display a structured list of all contents, including files and directories nested within any subdirectories.

import java.io.File;

public class Q10 {

	public static void main(String[] args) {

		String directoryPath = "D:\\ss";

		File directory = new File(directoryPath);
		if (directory.exists() && directory.isDirectory()) {
			System.out.println("Contents of " + directory.getAbsolutePath() + ":");
			listFilesAndSubdirectories(directory, 0);
		} else {
			System.out.println("Directory does not exist or is not a directory.");
		}
	}

	public static void listFilesAndSubdirectories(File directory, int depth) {
		File[] files = directory.listFiles();
		if (files != null) {
			for (File file : files) {
				for (int i = 0; i < depth; i++) {
					System.out.print("\t"); // indentation based on depth
				}
				System.out.println(file.getName());
				if (file.isDirectory()) {
					listFilesAndSubdirectories(file, depth + 1); // recursively call for subdirectories
				}
			}
		}
	}
}
