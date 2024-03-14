// Write a Java code snippet that comprises a Car class and a CarTester class. The Car class
// should define private fields for make and model, along with a parameterized constructor and
// getter/setter methods for these attributes. In the CarTester class, instantiate two instances of
// the Car class: myCar1 with a specified make and model, and myCar2 with null values. After
// instantiation, the CarTester class should retrieve and print the initial make and model of both
// cars. Then, it should set new values for myCar2 using setter methods and print the updated
// make and model

class Car{
    private String make;
    private String model;

    public Car(String make , String model){
        this.make = make;
        this.model = model;
    }

    public Car(){
                                                                                                                    
    }

    public void setter(String make , String model){

        this.make = make;
        this.model = model;

    }
    public void getter(){
        System.out.println("Make " + make);
        System.out.println("Model " + model);
    }

}

class CarTester{

    
    public static void main(String[] args) {
        Car myCar1 = new Car("2011" , "Swift");
        Car myCar2 = new Car();
        
        myCar1.getter();
        myCar2.getter();
        myCar2.setter("2006", "Nexon");
        myCar2.getter();
    }


}


