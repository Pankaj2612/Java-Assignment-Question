// Write a program to create an Animal class with member variables name,
// color, types (pet/wild). Override the hashCode method to print the
// unique id for the object. Create the objects of the Animal class and
// print its hashcode.

import java.util.Random;

class Animal {
    private String name;
    private String color;
    private String type; // pet or wild

    // Constructor
    public Animal(String name, String color, String type) {
        this.name = name;
        this.color = color;
        this.type = type;
    }

    // Overridden hashCode method to print unique ID
    @Override
    public int hashCode() {
        // Using a random number generator to generate a unique ID
        Random random = new Random();
        return random.nextInt(1000000); // Assuming IDs are within the range of 0 to 999999
    }
}

public class Q6 {
    public static void main(String[] args) {
        // Creating objects of Animal class
        Animal animal1 = new Animal("Dog", "Brown", "Pet");
        Animal animal2 = new Animal("Tiger", "Orange", "Wild");

        // Printing hash codes of the objects
        System.out.println("Hash code of animal1: " + animal1.hashCode());
        System.out.println("Hash code of animal2: " + animal2.hashCode());
    }
}
