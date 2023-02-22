// Write a Java method to display the middle character of a string.
// Note:
// a) If the length of the string is odd there will be one middle characters.
// b) If the length of the string is even, then there would be two middle characters, we need
// to print the second middle character.
// Example:
// Input a string: ABC
// Expected Output:
// The middle character in the string: B
// Example:
// Input a string: JAVA
// Expected Output:
// The middle character in the string: V

public class HomeAssignment_03 {

    public static void main(String[] args) {
        
        String str = "java";
        int len = str.length();
            System.out.println(str.charAt(len/2));
    }
    
}
