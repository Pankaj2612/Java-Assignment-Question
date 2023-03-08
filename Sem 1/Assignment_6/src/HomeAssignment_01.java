import java.util.Scanner;

// Write a program to find the first non-repeated character in a given String, for example, if the
// given String is "Java" then the first non-repeated character is "J"


public class HomeAssignment_01 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The String : ");
        String str = sc.nextLine();
        int count = 0;
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

