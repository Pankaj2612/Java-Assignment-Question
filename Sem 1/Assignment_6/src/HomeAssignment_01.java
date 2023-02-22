// Write a program to find the first non-repeated character in a given String, for example, if the
// given String is "Java" then the first non-repeated character is "J"


public class HomeAssignment_01 {

    public static void main(String[] args) {
        
        int count = 0;
        String str = "abscdefjkll";
        for(int i = 0; i<str.length();i++){

           for(int j = i+1; j <str.length();j++){
            if(str.charAt(i) == str.charAt(j)){
                count++;
            }
               
        }
        if(count!=0){
        System.out.println(str.charAt(i-1));
        break;
        }
        
    }

        }

    }

