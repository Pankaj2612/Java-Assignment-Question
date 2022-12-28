// Write a java program to input a character from command line and display the ASCII value of
// the entered character.


public class Q6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stuB
		
		char x = args[0].charAt(0);
		int ascii = (int)x;
		
		
		System.out.println("CHARACTER IS :" + x);
		System.out.println("ASCII = " + ascii);
		
				

	}

}
