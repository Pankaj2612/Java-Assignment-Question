// Define a class called Complex with instance variables real, imag and instance methods
// setData(), display(), add(). Write a Java program to add two complex numbers.
// The prototype of add method is:
// public Complex add(Complex, Complex).


class Complex {

  private double real;
  private double imag;

   void setData(double r, double img) {
    real = r;
    imag = img;
  }

   void display() {
    System.out.println(real + " + " + imag + "i");
  }

   Complex add(Complex c1, Complex c2) {
    Complex result = new Complex();
    result.real = c1.real + c2.real;
    result.imag = c1.imag + c2.imag;
    return result;
  }
}

public class Q2 {

  public static void main(String[] args) {
    Complex c1 = new Complex();
    c1.setData(2, 3);
    c1.display(); 

    Complex c2 = new Complex();
    c2.setData(4, -1);
    c2.display(); 

    Complex sum = new Complex();
    sum = sum.add(c1, c2);
    sum.display(); 
  }
}
