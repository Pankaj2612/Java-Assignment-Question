// . Write a program to create a Car class with member variables model, color,
// and speed. Add the respective method and constructor to it. Create a
// driver class in that class and create two car objects. Compare the car
// objects according to their speed and print the details of the car that has
// a greater speed.
// Note: Overload compareTo method of Comparable interface.

class Car implements Comparable<Car> {
    private String model;
    private String color;
    private int speed;

    // Constructor
    public Car(String model, String color, int speed) {
        this.model = model;
        this.color = color;
        this.speed = speed;
    }

    // Getters
    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getSpeed() {
        return speed;
    }

    // Overridden compareTo method of Comparable interface
    @Override
    public int compareTo(Car otherCar) {
        return Integer.compare(this.speed, otherCar.speed);
    }

    // Overridden toString method
    @Override
    public String toString() {
        return "Model: " + model + ", Color: " + color + ", Speed: " + speed + " km/h";
    }
}

public class Q3 {
    public static void main(String[] args) {
        // Creating car objects
        Car car1 = new Car("Toyota Camry", "Black", 180);
        Car car2 = new Car("Honda Civic", "Red", 200);

        // Comparing car objects based on speed
        if (car1.compareTo(car2) < 0) {
            System.out.println("Car 2 has a greater speed:");
            System.out.println(car2);
        } else if (car1.compareTo(car2) > 0) {
            System.out.println("Car 1 has a greater speed:");
            System.out.println(car1);
        } else {
            System.out.println("Both cars have the same speed.");
        }
    }
}
