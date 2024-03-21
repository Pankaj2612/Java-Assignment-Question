// Write  a  Java  code  snippet  that  comprises  of  a  Car  class  and  a  CarApp 
// class.  The  Car  class  should  define  private  fields  for  ModalNo(int), 
// name(string)  and  stock(int).  Define  a  parameterised  constructor  and 
// override the compareTo method as   public int compareTo(Car car) to 
// sort the car on basis of the total number of stock. Create an ArrayList of 
// Car objects and print the updated the sorted list.  For example the list of sorted Car Objects 2013 creta 10  2020 MG 13 2018 Kia 20 2017 Audi 45 2015 BMW 55 


import java.util.ArrayList;
import java.util.Collections;

class Car implements Comparable<Car>{
	private int ModelNo;
	private String name;
	private int stock;
	
	public Car(int modelNo, String name, int stock) {
		this.ModelNo = modelNo;
		this.name = name;
		this.stock = stock;
	}
	
	@Override
	public int compareTo(Car car) {
		return Integer.compare(this.stock, car.stock);
	}
	
	public int getModelNo() {
		return ModelNo;
	}
	
	public String getName() {
		return name;
	}
	public int getStock() {
		return stock;
	}
	
}
public class Q3 {
	public static void main(String[] args) {
		Car c1 = new Car(2013, "Creta", 10);
		Car c2 = new Car(2020, "MG", 13);
		Car c3 = new Car(2018, "Kia", 20);
		Car c4 = new Car(2017, "Audi", 45);
		Car c5 = new Car(2015, "BMW", 55);
		ArrayList<Car> arr = new ArrayList<>();
		
		arr.add(c1);
		arr.add(c2);
		arr.add(c3);
		arr.add(c4);
		arr.add(c5);
		
		Collections.sort(arr);
		
		for (Car car : arr) {
			System.out.println("Car Model : " + car.getModelNo() + " Car Name : " + car.getName() + " Car Stock " + car.getStock());
		}
	
		
	}
}
