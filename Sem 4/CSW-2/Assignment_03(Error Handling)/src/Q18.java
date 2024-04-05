// . Develop a recursive algorithm implemented in Java that traverses or manipulates
// arrays. Introduce scenarios where the recursion reaches beyond the bounds of the array,
// resulting in ArrayIndexOutOfBoundsException. Your task is to handle these
// exceptions within the recursive algorithm and ensure proper termination of recursion

public class Q18 {
   public static void arrya(int arr[] , int index ) {

        try {
            if(index == -1){
                throw new ArrayIndexOutOfBoundsException();
            }
            System.out.print(arr[index] + " ");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println();
            System.out.println(e);
            return;
        }
        arrya(arr, --index);
   } 

   public static void main(String[] args) {
    int [] arr = {1,2,3,4,5};
    arrya(arr, arr.length-1);
   }
}
