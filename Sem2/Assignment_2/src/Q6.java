// Create an abstract class Shape and the derived classes Square, Triangle and Circle. Write a
// java program to display area of different shapes.

abstract class Shape{
    abstract double Area();
}
class Square extends Shape{
    double side;
    Square(double s){
        side = s;
    }
    double Area(){
        return side*side;
    }
}
class Triangle extends Shape{
    double height;
    double base;
    Triangle(double h , double b){
        height = h;
        base = b;
    }
    double Area(){
return 0.5 * base * height;
    }
}
class Circle extends Shape{
    double radius;
    Circle(double r){
        radius = r;
    }
    double Area(){
        return Math.PI * radius*radius;
    }
}


public class Q6 {
    public static void main(String[] args) {
        Square ob1 = new Square(5);
        Triangle ob2 = new Triangle(12, 5);
        Circle ob3 = new Circle(4.2);

        System.out.println("Area of Square: " + ob1.Area());
        System.out.println("Area of Traingle: " +ob2.Area());
        System.out.println("Area of Circle: " + ob3.Area());
    }
}
