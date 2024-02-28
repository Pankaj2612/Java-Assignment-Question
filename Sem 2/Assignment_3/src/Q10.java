// Write a recursive Java method that takes a character string s and outputs its reverse. For
// example, the reverse of ' pots&pans' would be ' snap&stop'.

import java.util.Stack;

public class Q10{

    public static String ReverseString(String s) {

        if (s.length() <= 1) {
            return s;
        }

        return ReverseString(s.substring(1)) + s.charAt(0);
    }

    //Reversing Using Stack
    public static String Reverse(String s ){

        Stack<Character> st = new Stack<Character>();
    
        char[] strarr = s.toCharArray();
        for (int i = 0; i < strarr.length; i++) {
            st.push(strarr[i]);
        }
        String revstr = "";
        while (true) {
            revstr = revstr + st.pop();
            if(st.isEmpty())
            break;
        }

        return revstr;
        
    }

    public static void main(String[] args) {
        
        System.out.println(ReverseString("snap&stop"));
        System.out.println(Reverse("snap&stop"));

    }


}