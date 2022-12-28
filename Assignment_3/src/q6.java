// Write a java program to calculate the monthly electricity bill. The tariff is given as
// follows:
// Price per unit Unit range
// Rs. 3/- First 50 units
// Rs. 4.80/- 50-200 units
// Rs. 5.80/- 200-400 units
// Rs. 6.20/- Above 400 units

import java.util.Scanner;

public class q6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double bill = 0,unit;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no of Units ");
		unit = sc.nextDouble();		
		
		if (unit <= 50)
			bill = 3 * unit; 
		
		else if (unit <= 200) 
			bill = 3 * 50 + (unit -50) * 4.80;
		
		
		else if(unit <= 400) 
			bill = 3 * 50 + 4.80 * 150 + (unit - 200) * 5.80;
		
		else if (unit > 400) 
					bill = 3 * 50 + 4.80 * 150 + 5.80 * 200 + (unit - 400) * 6.80; 
			
		
		System.out.println("Electricity bill is " + bill);
		
		
		
	}

}
