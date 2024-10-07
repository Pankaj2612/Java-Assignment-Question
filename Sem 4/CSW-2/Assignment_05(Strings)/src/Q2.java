// Write a Java program that demonstrates the immutability of the String class and how it implements the CharSequence interface. Your program should illustrate the behaviours that highlight String immutability and its usage as a CharSequence

public class Q2 {
   public static void main(String[] args) {
      String originalString = "Hello";
      System.out.println("Original String: " + originalString);

      String modifiedString = originalString.concat(" World");
      System.out.println("Modified String: " + modifiedString);

     System.out.println("Original String after modification: " + originalString);


      CharSequence charSeq = "Java is fun";
      System.out.println("\nCharSequence length: " + charSeq.length());
      System.out.println("CharSequence content: " + charSeq);

   } 
}
