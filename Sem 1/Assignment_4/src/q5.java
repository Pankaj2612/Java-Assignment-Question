import java.util.Scanner;
public class q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an Integer");
		int n = sc.nextInt();
		int sum = 0;
		int i = 1;
		while (i <= n/2) {
			if (n%i == 0) {
				System.out.print(i+" ");
				sum =sum +i;
			}
			i++;
		}
		System.out.println();
		if(sum == n)
			System.out.println(n + " is a Perfect number ");
		else
			System.out.println(n + " is a not Perfect number ");

		
	}

}
