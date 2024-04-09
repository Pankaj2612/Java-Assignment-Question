// Develop a recursive algorithm implemented in Java that traverses or manipulates
// arrays. Introduce scenarios where the recursion reaches beyond the bounds of the array,
// resulting in ArrayIndexOutOfBoundsException. Your task is to handle these
// exceptions within the recursive algorithm and ensure proper termination of recursion

public class Q20 {

    public static void ArrayManipulation(int[] arr , int ind){
        if (ind == arr.length) {
            return;
        }

        try {
            System.out.print(arr[ind] + " ");

        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e);
            return;
        }
        ArrayManipulation(arr, ++ind);
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        ArrayManipulation(arr, -1);
    }
}
