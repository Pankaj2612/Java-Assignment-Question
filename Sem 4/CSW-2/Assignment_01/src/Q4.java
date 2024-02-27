// Write a Java code snippet comprising two classes: Laptop and Main. The Laptop class
// defines private fields model and price, alongside setter methods for each attribute.
// Additionally, it overrides the toString() method to return a string representation of the laptop's
// model and price. In the Main class, create an instance of Laptop, setting its model using the
// setter method. Then, print the laptop object using the toString() method. Describe the
// functionality of the toString() method in the Laptop class and explain how it is utilized in the
// Main class.


class Laptop{

    private String model;
    private float price;

    Laptop(String m , float p){
        model = m;
        price =p;
    }

    public void setter(String m , float p){
        model = m;
        price = p;
    }

    @Override
    public String toString(){
        return "Model :" + this.model + 
        " Price :" + this.price;
    }


}
public class Q4 {

    public static void main(String[] args) {
        Laptop l1 = new Laptop("Acer", 23233);

        System.out.println(l1.toString());
    }
}
