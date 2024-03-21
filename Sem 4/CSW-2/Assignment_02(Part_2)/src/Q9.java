import java.util.HashSet;

//Given an array of integers, print the repeating integers in the array with 
//the help of a HashSet.

public class Q9{
	public static void main(String[] args) {
		int [] arr = {1,2,2,3,3,4,4,5,7};
		
		HashSet<Integer> hs = new HashSet<>();
		
		for (int ele  : arr) {
			if(hs.contains(ele)) {
				System.out.println(ele);
			}
			else {
				hs.add(ele);
			}
		}
	}
}