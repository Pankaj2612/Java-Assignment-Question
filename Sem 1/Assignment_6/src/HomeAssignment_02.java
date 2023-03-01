// Write a java program to calculate the volume of sphere, cuboid and cube by using method
// overloading.
// Volume of a cube = s * s * s [s: Side of the cube]
// Volume of a Sphere = 4
// 3
// × π × r
// 3
// [r: radius]
// Volume of a cuboid = L × b × h [L: Length, b: Breadth, h: Height]

public class HomeAssignment_02 {
    
    public static double volume(int s) {
        return s * s* s;
    }
    public static double volume(double r ) {
        return 4/3 * Math.PI * (r * r * r);
        
    }
    public static double volume(int l , int b ,int h) {

        return l * b * h;
        
    }

    public static void main(String[] args) {
        
    }
}
