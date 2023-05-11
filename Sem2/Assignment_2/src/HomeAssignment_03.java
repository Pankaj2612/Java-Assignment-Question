// Write a Java code that would represent Distance object (meters, centimetres) using classes. The class
// definition include a parameterized constructor, display ( ) to display the instance variables, sum
// (Distance, Distance) to add two distances. Now write a main function that creates a couple of Distance
// objects and demonstrates the addition of two distances. 

class Distance {
     int meters;
     int centimeters;
    
     Distance(int meters, int centimeters) {
        this.meters = meters;
        this.centimeters = centimeters;
    }
    
     void display() {
        System.out.println("Distance: " + meters + " meters, " + centimeters + " centimeters");
    }
    
     static Distance sum(Distance d1, Distance d2) {
        int totalMeters = d1.meters + d2.meters;
        int totalCentimeters = d1.centimeters + d2.centimeters;
        
        if (totalCentimeters >= 100) {
            totalMeters += totalCentimeters / 100;
            totalCentimeters = totalCentimeters % 100;
        }
        
        return new Distance(totalMeters, totalCentimeters);
    }
}

public class HomeAssignment_03 {
    public static void main(String[] args) {
        Distance distance1 = new Distance(5, 70);
        Distance distance2 = new Distance(3, 50);
        
        distance1.display();
        distance2.display();
        
        Distance sumDistance = Distance.sum(distance1, distance2);
        sumDistance.display();
    }
}
