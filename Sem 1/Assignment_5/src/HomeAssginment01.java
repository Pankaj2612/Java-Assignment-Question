// Write a program to print the following patterns:
// 5 4 3 2 *
// 5 4 3 * 1
// 5 4 * 2 1
// 5 * 3 2 1
// * 4 3 2 1 


public class HomeAssginment01 {
    public static void main(String[] args) {
        
        for (int i =  1; i <= 5 ; i++){

            for (int j =5; j >= 1 ; j--){

                    if (j==i)
                    System.out.print("* ");
                    else
                    System.out.print(j+" ");

            }
            System.out.println();

            }

        }

    }

