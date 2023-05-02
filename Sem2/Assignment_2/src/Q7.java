// Define a base class Person with instance variable name, age. The instance variables are
// initialized through constructors. The prototype of constructor is as below.
// Person (string, int)
// Define a derived class Employee with instance variables Eid, salary. The instance variables
// are initialized through constructors. The prototype of constructor is as below.
// Employee (string, int, int, double). Another instance method of Employee class is empDisplay()
// to display the information of employee details. 

class Person{
    String name;
    int age;

    Person(String n , int a){
        name = n;
        age = a;
    }
}

class Employee extends Person{
    int Eid;
    double salary;
    Employee(String n , int a , int id, double s ){
        super(n, a);
        Eid = id;
        salary = s;
    }
    void empDisplay(){
        System.out.println("Name of the Employee : " + name);
        System.out.println("Age of the Employee : " + age);
        System.out.println("EID of the Employee : " + Eid);
        System.out.println("Salary of the Employee : " + salary);
    }
}

public class Q7 {
    public static void main(String[] args) {
        Employee ob = new Employee("Pankaj", 21, 232, 123000);
        ob.empDisplay();
    }
}
