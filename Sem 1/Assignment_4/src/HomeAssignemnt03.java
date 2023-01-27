// Write a java program in which using one for loop and one if statement, prints the integers
// from 1,000 to 2,000 with five integers per line. Hint: Use the % operation.


public class HomeAssignemnt03 {

    public static void main(String[] args) {
        
        for (int i = 1000;i<=2000;i++){

            if (i%5==0){
            System.out.println(" ");
        }
            System.out.print(i + " ");
        }



    }
    
}
