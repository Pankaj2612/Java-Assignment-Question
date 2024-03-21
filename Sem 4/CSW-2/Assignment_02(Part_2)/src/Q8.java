import java.util.HashMap;
import java.util.Map;

//Find if two strings are anagrams, an anagram is a word or phrase formed 
//by reordering the letters of another word or phrase. Declare two strings 
//str1 and str2 and initialize. Create a HashMap<Character, Integer>
//and use methods containsKey() ,put() ,get() to check the strings

public class Q8{
	
	public static boolean checkAnagram(String s1 , String s2) {
		HashMap<Character, Integer> hm1 = new HashMap<>();
		
		for (char str : s1.toCharArray()) {
			if(hm1.containsKey(str)) {
				hm1.put(str, hm1.get(str) + 1);
			}
			else {
				hm1.put(str,1);
			}
		}
		
		for (char str : s2.toCharArray()) {
			if(hm1.containsKey(str)) {
				hm1.put(str, hm1.get(str) - 1);
			}
		}
		
		for (Map.Entry<Character, Integer> entry : hm1.entrySet()) {
			Integer val = entry.getValue();
			if(val != 0) {
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		System.out.println(checkAnagram("MAM", "AMM"));
}
	}