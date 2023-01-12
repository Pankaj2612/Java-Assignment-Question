import java.util.Scanner;
public class q2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter an Integer");
		int n = sc.nextInt();
		int sum = 0;
		
		while (n > 0) {
			int rem = n%10;
			sum = sum + rem;
			n = n/10;
			
		}
		if (sum%9 == 0)
			System.out.println("This number is divisible by 9 ");
		else
			System.out.println("This number is not divisible by 9 ");
	}

}
