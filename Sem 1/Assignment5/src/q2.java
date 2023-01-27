// WAP to check whether a number is twisted prime or not. Twisted prime is a number if the
// number and its reverse both are prime then it is called twisted prime.
// Sample run 1:
// Enter a number: 97
// 97 is twisted prime.
// Sample run 2: 43
// 43 is not a twisted prime

import java.util.Scanner;
public class q2 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter  a  Number : ");
		int n = sc.nextInt();
		int oldn = n;
		
		//FOr reversing a number 
		int newnum = 0;
		while (n !=0) {
			
			int d = n%10;
			newnum = newnum * 10 +  d;
			n = n/10;				
		}
		
		//To check the given number is Prime or not
		int flag1  = 0;
		for (int i =2;i<oldn;i++) {
			if (oldn%i==0) {
				flag1 = 1;
				break;
			}
		}
		//To check the given numbers "reverse" is Prime or not
		int flag2  = 0;
		for (int i =2;i<newnum;i++) {
			if (newnum%i==0) {
				flag2 = 1;
				break;
			}
		}

		if (flag1 == 0 && flag2 == 0 ) 
			System.out.println(oldn +" is a Twisted Prime number");
		else
			System.out.println(oldn + " is not a Twisted Prime number");
		
	
}
}