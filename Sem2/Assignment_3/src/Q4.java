// Write a java program to print an array of different type using a single Generic method. The
// signature of printArray method is given below.
// public static < E > void printArray( E[] inputArray)
// Sample run:
// Enter array elements
// 1
// 2
// 3
// 4
// 5
// Integer Array contains:
// 1 2 3 4 5
// Enter array elements
// 1.2
// 2.3
// 3.4
// 4.5
// 5.6
// Double Array contains:
// 1.2 2.3 3.4 4.5 5.6


public class Q4 {

    public static < E > void printArray( E[] inputArray){
        for (E e : inputArray) {
            System.out.println(e);
        }
    }

public static void main(String[] args) {
    
    System.out.println("Integr Array");
    Integer[] intarr = {1,2,3,4,5}; 
    printArray(intarr);
    
    System.out.println("Double Array");
    Double[] doubarr = {1.2,2.3,3.4,4.5,5.1};
    printArray(doubarr);
}    
}
