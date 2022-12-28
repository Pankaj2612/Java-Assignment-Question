// Write a java program to take three inputs from command line argument as principle, rate and
// time. Find Simple interest.

public class Home_Assignment_q1 {
    public static void main(String[] args) {
        double p,r,t ,si;

        p = Double.parseDouble(args[0]);
        r = Double.parseDouble(args[1]);
        t = Double.parseDouble(args[2]);

        System.out.println("Principle :" +p);
        System.out.println("Rate of Interest :" + r);
        System.out.println("Time in Years :" + t);
        
        si = p*r*t/100;
        System.out.println("Your Simple Interest is : " + si);

    }
}
