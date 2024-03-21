import java.util.Map;
import java.util.TreeMap;

//import java.util.Map;
//import java.util.TreeMap;

// Write a java code that comprises of a class Address, having member
//variable plot no, at, post and required parameterised constructor. Create
//a Tree map having key as name of a person and value as address. 
//Insert required key and value in the created tree map and use an iterator to
//display it

class Address{
	String plotno;
	String at;
	String post;
	public Address(String plotno, String at, String post) {
		this.plotno = plotno;
		this.at = at;
		this.post = post;
	}
	
}

public class Q7{
	public static void main(String[] args) {
		TreeMap<String, Address> tm = new TreeMap<>();
		Address ad1 = new Address("M-12/14", "DPS", "Kordha");
		Address ad2 = new Address("12/82", "KPS", "BBSR");
		tm.put("Arun", ad1);
		tm.put("Tarun", ad2);
		
		for (Map.Entry<String,Address> entry : tm.entrySet()) {
			String key = entry.getKey();
			Address val = entry.getValue();
			
			System.out.println(" Key --> " + key + " : Plot NO : " + val.plotno + " At : " + val.at + " POst : " + val.post);
			
		}
	}
}