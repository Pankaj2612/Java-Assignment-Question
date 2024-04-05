//You are given a string containing alpha-numeric characters. Design a Java program that
//displays the numeric characters if it is preceded by a vowel and consonant in the given
//string. If such numeric characters are not present in the given string, display appropriate
//message. If the input string is null or empty, throw a NullPointerException with an
//appropriate error message. Ensure that the program handles any potential exceptions
//gracefully.

public class Q2 {
	
static void alphanumber(String str) {
		
			try {
				if(str == null || str.isEmpty()) {
					throw new NullPointerException("The String is Null");
				}
			}
			catch (NullPointerException e) {
				// TODO: handle exception
				System.out.println(e);
			}
		
			String ans = "";
			for (int i = 0; i < str.length();i++) {
				
				if(str.charAt(i)>= 48 && str.charAt(i) <=57) {
					ans += str.charAt(i);	
				}
			}
			if(str == "") {
				System.out.println("No Numeric Values Present");
			}
			else {
				System.out.println(ans);
			}
	}
	
public static void main(String[] args) {
	alphanumber("12323avdc");
}
}
