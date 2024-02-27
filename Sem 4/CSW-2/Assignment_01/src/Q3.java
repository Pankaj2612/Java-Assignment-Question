// . Write a Java program that defines a 'Point' class with attributes 'X' and 'Y', and includes a
// parameterized constructor to initialize these attributes. Implement a copy constructor to
// create a new point object with the same attribute values. Ensure that modifications made to one
// object do not affect the other. Utilize getter and setter methods to retrieve and update the
// attribute values

class Point{

    int X;
    int Y;

    Point(int x , int y){
        X = x;
        Y = y;
    }

    public Point(Point p){
        X = p.X;
        Y = p.Y;
    }

    public void getter(){
        System.out.println("Point in X " + X );
        System.out.println("Point in Y " + Y );
    }

    public void setter(int x , int y){

        X = x;
        Y = y;
    }

}

public class Q3{
    public static void main(String[] args) {
        
        Point p1 = new Point(2,3);
        Point p2 = new Point(p1);

        p1.getter();
        p2.getter();

        p2.setter(5, 6);
        p2.getter();

    }
}