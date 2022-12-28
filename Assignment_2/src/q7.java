// Write a java program that displays the following table. Cast floating-point numbers into
// integers.
// a b pow(a, b)
// 1 2 1
// 2 3 8
// 3 4 81
// 4 5 1024
// 5 6 15625

public class q7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float a,b;
		a = 1;
		b=2;
		
		System.out.println("a \t b \t pow(a,b)");
		System.out.println((int)a +" \t "+(int)b +" \t "+ (int) Math.pow(a, b) );
		a++;
		b++;
		System.out.println((int)a +" \t "+(int)b +" \t "+ (int) Math.pow(a, b) );
		a++;
		b++;
		System.out.println((int)a +" \t "+(int)b +" \t "+ (int) Math.pow(a, b) );
		a++;
		b++;
		System.out.println((int)a +" \t "+(int)b +" \t "+ (int) Math.pow(a, b) );
		a++;
		b++;
		System.out.println((int)a +" \t "+(int)b +" \t "+ (int) Math.pow(a, b) );
		
	}

}
																																																																																																												