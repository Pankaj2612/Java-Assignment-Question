import java.util.Scanner;
import java.util.TreeSet;

//Write a program to create a TreeSet of Integer type and perform the
//below 
//operation on it.
//(a.) Display the TreeSet
//(b.) Ask the user to enter a number and search that number is it present in 
//the 
//list or not.
//(c.) Remove an element from tree.

public class Q6{
	public static void main(String[] args) {
		TreeSet<Integer> t = new TreeSet<>();
		t.add(5);
		t.add(10);
		t.add(2);
		t.add(6);
		t.add(3);
		t.add(8);
		
		System.out.println(t);
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int x = sc.nextInt();
		
		if(t.contains(x)) {
			System.out.println("The number is present in Treeset");
		}
		else {
			System.out.println("Not present in TreeSet");
		}
	}
}