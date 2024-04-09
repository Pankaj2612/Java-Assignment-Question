// Create a Java program to handle ArrayIndexOutOfBoundsException

/**
 * Q16
 */
public class Q16 {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        try {
            
        System.out.println(arr[7]);
        } catch (ArrayIndexOutOfBoundsException e) {
            // TODO: handle exception
            System.out.println(e);
        }
    }
}