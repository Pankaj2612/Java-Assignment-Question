// Write a recursive Java method that takes a character string s and outputs its reverse. For
// example, the reverse of ' pots&pans' would be ' snap&stop'.



public class Q10{

    public static String ReverseString(String s) {

        if (s.length() <= 1) {
            return s;
        }

        return ReverseString(s.substring(1)) + s.charAt(0);
    }

    public static void main(String[] args) {
        
        System.out.println(ReverseString("snap&stop"));

    }


}