// Write a java program that reads the radius of a hemisphere and computes the surface area
// and volume using the following formulas:
// Surface Area of Hemisphere = 3 π r2
// . Volume of a hemisphere = (2/3)πr3
// Where π is a constant whose value is equal to 3.14 approximately. “r” is the radius of the
// hemisphere. Hint: Use Math.PI.
// Here is a sample run:
// Enter the radius of the hemisphere: 7.0
// The surface area of the hemisphere is 461.814
// The volume area of the hemisphere is 718.377

import java.util.Scanner;
public class q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double r;
		System.out.println("Enter RADIUS of Hemisphere:");
		Scanner sc = new Scanner(System.in);
		r = sc.nextDouble();
		
		double sa = 3 * Math.PI * Math.pow(r, 2);
		double v = (2.0/3)* Math.PI * Math.pow(r,3);
		
		System.out.println("Surface Area of Hemisphere is  : " + sa);
		System.out.println("Volume of Hemisphere is :" + v);
	
			
		
	}

}
