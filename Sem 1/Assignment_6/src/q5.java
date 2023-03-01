import java.util.Scanner;

// A regular polygon is an n-sided polygon in which all sides are of the same length and all angles
// have the same degree (i.e., the polygon is both equilateral and equiangular). The formula for
// computing the area of a regular polygon is
// Area = 𝑛 × 𝑆
// 2
// 4 ×tan(
// 𝜋
// 𝑛
// )
// Write a method that returns the area of a regular polygon using the following header:
// public static double area(int n, double side)

public class q5 {
    
    public static double area(int n, double side){

        double angle = Math.PI/n;
        double area = (n * side*side)/4*Math.tan(angle);

        return area;

    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int s = sc.nextInt();
        
        System.out.println("The Area of Regular Polygan is : " + area(n, s));

    }
}
