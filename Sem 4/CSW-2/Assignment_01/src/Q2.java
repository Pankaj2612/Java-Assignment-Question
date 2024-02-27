// Design a Java class called Rectangle with private attributes length and width. Include a
// constructor to initialize these attributes, as well as setter and getter methods for each attribute.
// Additionally, implement methods to calculate the area and perimeter of the rectangle. Write a
// main method to create an object of the Rectangle class, set values for its attributes, and display
// the area and perimeter

class Rectangle {
    private float length;
    private float width;

    Rectangle(float l , float w){

        length = l;
        width = w;
    }

    public void setter(float l , float w){
        length = l;
        width = w;
    }

    public void getter(){

        System.out.println("Length of Rectangle " + length);
        System.out.println("Width of Rectangle " + width);

    }

    public float area(){
        return length * width;
    }
    public float perimeter(){
        return length + width;
    }
}

public class Q2{
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(10, 3);

        System.out.println(r1.area());
        System.out.println(r1.perimeter());
    }
}
