// Write a Java program to declare a Class named as Student which contains roll number,
// name and course as instance variables and input_Student () and display_Student () as
// instance methods. A derived class Exam is created from the class Student. The derived
// class contains mark1, mark2, mark3 as instance variables representing the marks of three
// subjects and input_Marks () and display_Result () as instance methods. Create an array of
// objects of the Exam class and display the result of 5 students.
import java.util.Scanner;
class Student{
    Scanner sc = new Scanner(System.in);
    int roll;
    String name , course;
    
    void input_Student(){
        System.out.println("Enter the Roll No . ");
        roll = sc.nextInt();
        System.out.println("Enter the Name . ");
        name = sc.next();
        System.out.println("Enter the Course Name . ");
        course = sc.next();

    }
    void display_Student(){
        System.out.println("Student Details");
        System.out.println("Roll_NO - " + roll);
        System.out.println("NAME - " + name);
        System.out.println("Course - " + course);
    }

}
class Exam extends Student{
    int mark1,mark2,mark3;

    void input_Marks(){
        System.out.println("Enter the Marks of Maths : ");
        mark1 = sc.nextInt();
        System.out.println("Enter the Marks of English : ");
        mark2 = sc.nextInt();
        System.out.println("Enter the Marks of Computer Science : ");
        mark3 = sc.nextInt();
    }
    void display_Result(){
        System.out.println("Result ");
        System.out.println("Enter the Marks of Maths  " + mark1);
        System.out.println("Enter the Marks of English  "+ mark2);
        System.out.println("Enter the Marks of Computer Science  "+ mark3);
        double percent = ((mark1+mark2+mark3)/300.0) * 100;
        System.out.println("Total Percentage : "+ percent);
    }

}
public class Q9 {
    public static void main(String[] args) {
        
        Exam[] stu = new Exam[5];

        for (int i = 0; i < stu.length; i++) {
            stu[i] = new Exam();
            stu[i].input_Student();
            stu[i].input_Marks();
}
        for (int i = 0; i < stu.length; i++) {
            stu[i].display_Student();
            stu[i].display_Result();
        }

    }
}