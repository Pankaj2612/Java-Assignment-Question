// Create an interface RestaurantMeal that holds the name and price of a food item served by a
// restaurant. The name is initialized as steak dinner and price is initialized as 600. Create an
// interface HotelService that holds the name of the service, the service fee, and the room number
// to which the service was supplied. Initialize the service as room service, service fee as Rs 24,
// and room number as 1202. Create a RoomServiceMeal class that inherits from both
// RestaurantMeal and HotelService. The RoomServiceMeal class consists of display method
// () to display the value of members of interface. Additionally, the display function should
// display the total of the meals plus the room service fee. In a main () function, instantiate a
// RoomServiceMeal object.



interface RestaurantMeal{

    String name = "steak dinner";
    int price = 600;
}

interface HotelService{

    String servicename = "room service";
    double servicefee = 24;
    int roomno = 1202;

}

class RoomServiceMeal implements RestaurantMeal , HotelService{

    void display(){
        System.out.println("A " + "\"" + name +  "\"" + " costing " + "Rs." + price + " is a " + "\""+ servicename + "\"" + " provided to room " + roomno+ " for " + " Rs." + servicefee + " fee.");

        double totprice = price + servicefee;

        System.out.println("The total fee to pay is Rs "+ totprice+".");
    }

}

public class HomeAssignment_05{
    public static void main(String[] args) {
        
        RoomServiceMeal r = new RoomServiceMeal();
        r.display();

    }
}