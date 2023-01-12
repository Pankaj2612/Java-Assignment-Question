import java.util.Scanner;
public class q3 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int n = sc.nextInt();
		int i = 1;
		double sum = 0.0; 
		System.out.println("Random Numbers generated are :");
		do {
			int random = 1 + (int) ((n-1)*Math.random());
			sum =+ random;
			System.out.print(random + " ");
			i++;
		}
		while ( i<=n);
		double avg = sum/n;
		System.out.println();
		System.out.println("Average of " +n+ " random Numbers are :" + avg);
	}
}
