// Create a class Student having two instance variable name and mark. Enter mark, name of the
// student. If mark is more than 100, create exception MarksOutOfBoundException & throw it
// using Java. Display the customised message Mark can’t be greater than 100 for the exception.
// Sample run-1:
// Enter the name of the student
// RAMESH
// Enter marks
// 98
// RAMESH has got 98.0
// Sample run-2:
// Enter the name of the student
// Raju
// Enter marks
// 130
// MarksOutOfBoundException: Mark can't be greater than 100

import java.util.Scanner;

class MarksOutOfBoundException extends Exception{

    MarksOutOfBoundException(String s ){

        super(s);

    }

}


class Student{
    String name;
    int mark;

    Student(String n , int m){
        this.name = n;
        this.mark = m;
    }

}
public class Q3 {
 public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the name of the student ");
    String name = sc.nextLine();
    System.out.println("Enter the Marks of the student ");
    int mark = sc.nextInt();

    Student stu = new Student(name, mark);

    try {
        if(stu.mark > 100)
        throw new MarksOutOfBoundException(" Mark can't be greater than 100");
        else
        System.out.println(stu.name + " has got " + stu.mark );
    } catch (MarksOutOfBoundException e) {
        System.out.println(e.toString());
    }
 }   
}
