//Implement a Java program to handle NullPointerException.
public class Q1 {
	public static void main(String[] args) {
		try {
			String s = null;
			System.out.println(s.length());
		} catch (NullPointerException e) {
			// TODO: handle exception
			System.out.println(e);
		}
	}
}
