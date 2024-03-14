// Write a program to create a Student class that has members, name, roll
// number, and age. Design the Student class in such a way that it can take
// the roll number as an integer or string. Create a driver class that creates
// student objects and invokes the methods.

class Student<T>{
    String name;
    T roll;
    int number;
    int age;

    Student(String name , T roll , int number , int age){
        this.name = name;
        this.roll = roll;
        this.number = number;
        this.age = age;
    }

    void display(){
        System.out.println("Name : " + name + " Roll No . " + roll + " Number : " + number + " Age : "+age);
    }

}

public class Q1{
    public static void main(String[] args) {
        
        Student<Integer> s1 = new Student("Pankaj", 21 , 93213120, 20);
        Student<String> s2 = new Student("Pankaj", "21" , 93213123, 20);
        s1.display();
        s2.display();
    }
}