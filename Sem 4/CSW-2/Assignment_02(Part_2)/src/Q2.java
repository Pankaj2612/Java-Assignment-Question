//Write a Java code snippet that comprises of a User class and an
//ArrayListUser class. The User class should define private fields for
//name and age, along with a parameterized constructor and getter/setter
//methods for these attributes. Create an ArrayListUser class of User
//objects. After addition of objects, the ArrayListUser class should
//retrieve and print the name and age of users. Then, it should sort the user
//according to age using getter methods and print the updated array list of
//users.

import java.util.ArrayList;
import java.util.Collections;

class User implements Comparable<User>{
	 private String name;
	 private int age;
	 
	 User(String name , int age){
		 this.name = name;
		 this.age = age;
	 }
	 
	 public void setAge(int age) {
		this.age = age;
	}
	 public void setName(String name) {
		this.name = name;
	}
	 public int getAge() {
		return age;
	}
	 public String getName() {
		return name;
	}

	@Override
	public int compareTo(User o) {
		// TODO Auto-generated method stub
		return Integer.compare(this.age, o.age);
	}
}

class ArrayListUser{
		public static void main(String[] args) {
			User ob1 = new User("Tarun", 20);
			User ob2 = new User("Arun" , 21);
			User ob3 = new User("Larun" , 19);
			User ob4 = new User("Karun" , 18);
			ArrayList<User> arr1 = new ArrayList<>();
			arr1.add(ob1);
			arr1.add(ob2);
			arr1.add(ob3);
			arr1.add(ob4);
			Collections.sort(arr1);
			for(User user: arr1) {
				System.out.println("Name : " + user.getName() + " Age : " + user.getAge() );
			}
			
		}
		
		
}




