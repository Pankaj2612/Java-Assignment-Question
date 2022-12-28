// The distance between two cities (in km.) is input through the keyboard. Write a java program
// to convert and print this distance in meters, feet, inches and centimetres.
// Hint:
// 1km=1000meter, 1km=3280.8399feet, 1km= 39370.0787 inch,
// 1km= 100000 centimetre
// Here is the sample run:
// Enter the distance in km=165
// 165 km is 165000 meters
// 165 km is 541338.5835 feet
// 165 km is 6496062.9854999995 inch
// 165 km is 16500000 centimetres


import java.util.Scanner;
public class q2 {

	public static void main(String[] args) {
		
		
		double distance;
		Scanner userinput = new Scanner(System.in);
		System.out.println("Enter Distance in KM");
		distance = userinput.nextDouble();
		double meter = distance * 1000;
		double feet = distance * 3280.8399; 
		double inch = distance * 39370.0787;
		double centi = distance * 100000; 
		
		
		System.out.println(distance + " KM " + "IS " + meter  + " meters");
		System.out.println(distance + " KM " + "IS " + feet  + " feets");
		System.out.println(distance + " KM " + "IS " + inch + " inches");
		System.out.println(distance + " KM " + "IS " + centi + " centimeters");
	}

}
