// From the above question no. (6) write a java program with a choice if the consumer
// wants to pay bill online. Consumer who pays their electricity bill online will get a
// discount of 3%.
// Here is the sample output:
// No. of units consumed: 867
// Do you want to pay online(y/n): y
// Total amount: 4925.4
// Discount: 147.762
// Amount payable: 4777.638

import java.util.Scanner;

public class q7 {

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
					bill = 3 * 50 + 4.80 * 150 + 5.80 * 200 + (unit - 400) * 6.20; 
			
		
		System.out.println("Electricity bill is " + bill);
		
		System.out.println("Do you want to pay online(y/n):");
        char x = sc.next().charAt(0);
        if (x == 'y'){
            double dis = bill * 0.03;
            double totalpay = bill - dis;
            
            System.out.println("Amount Payable : " + totalpay);

        }
        else{
            System.out.println("Amount Payable : " + bill);
        }
		
	}

}