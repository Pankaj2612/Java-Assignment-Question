// A point in the x-y plane is represented by its x-coordinate and y-coordinate. Design a class,
// PointType in Java, that can store and process a point in the x-y plane. You should then
// perform operations on the point, such as showing the point, setting the coordinates of the
// point, printing the coordinates of the point, returning the x-coordinate, and returning the ycoordinate. Every circle has a centre and a radius. Given the radius, we can determine the
// circle’s area and circumference. Given the centre, we can determine its position in the x-y
// plane. The centre of a circle is a point in the x-y plane. Design a class, CircleType that can
// store the radius and centre of the circle. Because the center is a point in the x-y plane and
// you designed the class to capture the properties of a point from PointType class. You must
// derive the class CircleType from the class PointType. You should be able to perform the
// usual operations on a circle, such as setting the radius, printing the radius, calculating and
// printing the area and circumference, and carrying out the usual operations on the center


// PointType class
class PointType {
     double x;
     double y;

     PointType(double x, double y) {
        this.x = x;
        this.y = y;
    }

     void setCoordinates(double x, double y) {
        this.x = x;
        this.y = y;
    }

     void printCoordinates() {
        System.out.println("Coordinates: (" + x + ", " + y + ")");
    }

     double getXCoordinate() {
        return x;
    }

     double getYCoordinate() {
        return y;
    }
}

class CircleType extends PointType {
     double radius;

     CircleType(double x, double y, double radius) {
        super(x, y);
        this.radius = radius;
    }

     void setRadius(double radius) {
        this.radius = radius;
    }

     void printRadius() {
        System.out.println("Radius: " + radius);
    }

     double getArea() {
        return Math.PI * radius * radius;
    }

     double getCircumference() {
        return 2 * Math.PI * radius;
    }

     void printCenter() {
        System.out.print("Center ");
        printCoordinates();
    }
}

// Example usage
public class HomeAssignment_04 {
    public static void main(String[] args) {
        
        PointType point = new PointType(3, 4);
        point.printCoordinates();

        
        CircleType circle = new CircleType(1, 2, 5);
        circle.printCenter();
        circle.printRadius();
        System.out.println("Area: " + circle.getArea());
        System.out.println("Circumference: " + circle.getCircumference());

        
        circle.setCoordinates(6, 7);
        circle.setRadius(10);
        circle.printCenter();
        circle.printRadius();
        System.out.println("Area: " + circle.getArea());
        System.out.println("Circumference: " + circle.getCircumference());
    }
}

