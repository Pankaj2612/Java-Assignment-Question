// Write java method called count accepts a string as input and returns the number of vowels in
// it. The method header is given below.
// public static int count(String str)
// For example, count ("Welcome") returns 2. 

import java.util.Scanner;

public class q7 {

    public static int count(String str) {

        String vowels = "AaIiOoUuEe";
        int p =0;

        for(int i = 0; i < str.length();i++){

            for(int j = 0; j<vowels.length();j++){

                if(str.charAt(i) == vowels.charAt(j))
                p++;
            }
        }
        System.out.println(p);
        return p;

    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String : ");
        String str = sc.nextLine();

        count(str);


    }
    
}
