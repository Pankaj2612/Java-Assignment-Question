// Implement a Java program that performs complex manipulations on an array of
// integers. The program should involve operations such as sorting, searching, and
// accessing elements at various indices. Introduce scenarios, where accessing elements
// beyond the bounds of the array leads to ArrayIndexOutOfBoundsException. Your
// task is to handle these exceptions gracefully and ensure the program continues
// execution without crashing

public class Q19 {
   public static void LinearSearch(int arr[] , int target , int index ) {
    
    try {
        
        if (arr[index] == target) {
            System.out.println(index);
            return;
        }
        if (index < 0) {
            throw new ArrayIndexOutOfBoundsException("Arrays is out of Bound");
        }
        
    } catch (ArrayIndexOutOfBoundsException e) {
        // TODO: handle exception
        System.out.println(e);
        return;
    }

    LinearSearch(arr, target, --index);
   } 

   public static void main(String[] args) {
        int[] arr = {1,2,3,2,3,6};
        LinearSearch(arr, 0, arr.length-1);
   }
}
