// The surface area of a cylinder can be defined as A= πr2+2πrh, where r and h are the radius
// height of the cylinder respectively. Write a java program to find the area where r and h are
// inputted from command line argument. Hint: Use Math.PI.

public class Home_Assignment_q2 {
    public static void main(String[] args) {
        double r , h , area;

        r = Double.parseDouble(args[0]);
        h = Double.parseDouble(args[1]);

        area = Math.PI * r * r + 2 * Math.PI * r * h;
        
        System.out.println("Radius of Cylinder :"+r);
        System.out.println("Height of Cylinder :"+h);

        System.out.println("");

        System.out.println("Surface Area of given Cylinder is :" + area);

    }
}
