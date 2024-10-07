// 8.Rename a File: Develop a Java application that renames a specified file. The program should request the current file name and the new file name from the user, renaming the file accordingly and confirming the action upon completion.

import java.io.File;

public class Q8 {
	public static void main(String[] args) {
		// Create an object of the File class
		// Replace the file path with path of the directory
		File file = new File("C:\\Users\\ITER\\eclipse-workspace12\\filess\\src\\filess\\Input.txt");

		// Create an object of the File class
		// Replace the file path with path of the directory
		File rename = new File("C:\\Users\\ITER\\eclipse-workspace12\\filess\\src\\filess\\Input1.txt");

		// store the return value of renameTo() method in
		// flag
		boolean flag = file.renameTo(rename);

		// if renameTo() return true then if block is
		// executed
		if (flag == true) {
			System.out.println("File Successfully Rename");
		}
		// if renameTo() return false then else block is
		// executed
		else {
			System.out.println("Operation Failed");
		}
	}
}
