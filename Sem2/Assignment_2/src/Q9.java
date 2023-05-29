// Write a Java program to declare a Class named as Student which contains roll number,
// name and course as instance variables and input_Student () and display_Student () as
// instance methods. A derived class Exam is created from the class Student. The derived
// class contains mark1, mark2, mark3 as instance variables representing the marks of three
// subjects and input_Marks () and display_Result () as instance methods. Create an array of
// objects of the Exam class and display the result of 5 students.
import java.util.Scanner;
import java.util.Scanner;

class Student {
    int rollNumber;
    String name;
    String course;

    public void inputStudent() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Roll Number: ");
        rollNumber = scanner.nextInt();

        System.out.print("Enter Name: ");
        scanner.nextLine(); // consume the newline character
        name = scanner.nextLine();

        System.out.print("Enter Course: ");
        course = scanner.nextLine();
    }

    public void display_Student() {
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Name: " + name);
        System.out.println("Course: " + course);
    }
}

class Exam extends Student {
    int mark1;
    int mark2;
    int mark3;

    public void input_Marks() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Mark 1: ");
        mark1 = scanner.nextInt();

        System.out.print("Enter Mark 2: ");
        mark2 = scanner.nextInt();

        System.out.print("Enter Mark 3: ");
        mark3 = scanner.nextInt();
    }

    public void display_Result() {
        System.out.println("Marks for Roll Number " + rollNumber + ":");
        System.out.println("Subject 1: " + mark1);
        System.out.println("Subject 2: " + mark2);
        System.out.println("Subject 3: " + mark3);
    }
}

public class Q9 {
    public static void main(String[] args) {
        Exam[] exams = new Exam[5];

        // Input data for 5 students
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter details for Student " + (i + 1) + ":");
            exams[i] = new Exam();
            exams[i].inputStudent();
            exams[i].input_Marks();
        }

        // Display results for 5 students
        for (int i = 0; i < 5; i++) {
            System.out.println("\nDetails and Results for Student " + (i + 1) + ":");
            exams[i].display_Student();
            exams[i].display_Result();
        }
    }
}
