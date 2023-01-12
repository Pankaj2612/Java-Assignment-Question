import java.util.Scanner;
public class q1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("First Number");
		int a = sc.nextInt();
		System.out.println("Second Number");
		int b = sc.nextInt();
		System.out.println("Third Number");
		int c = sc.nextInt();
		
		int sum=0;
		for (; a <= b;a = a + c) {
			
			System.out.print(a + " ");
			sum = sum+a;
			
		}
		System.out.println("The sum of the number displayed is : ");
		System.out.println(sum);

	}

}
