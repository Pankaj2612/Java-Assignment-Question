// Design a Java program for managing student enrollment in a university, adhering to the
// principles of loose coupling and high cohesion. Your program should include classes for
// representing students (`Student`), courses (`Course`), and enrollment management
// (`Enrollment`). Ensure that the `Enrollment` class interacts with the other classes indirectly
// through an interface class (`EnrollmentSystem`). Implement methods for enrolling and
// dropping students from courses, and displaying enrollment details. Create a `Main` class to
// demonstrate the system's functionality, with appropriate error handling and user-friendly output
// messages. Provide comments in your code explaining how loose coupling and high cohesion
// are maintained throughout the implementation

import java.util.*;

// Interface for Enrollment System
interface EnrollmentSystem {
    void enrollStudent(Student student, Course course);

    void dropStudent(Student student, Course course);

    void displayEnrollmentDetails();
}

// Student class
class Student {
    private String studentId;
    private String name;

    public Student(String studentId, String name) {
        this.studentId = studentId;
        this.name = name;
    }

    public String getStudentId() {
        return studentId;
    }

    public String getName() {
        return name;
    }
}

// Course class
class Course {
    private String courseId;
    private String courseName;

    public Course(String courseId, String courseName) {
        this.courseId = courseId;
        this.courseName = courseName;
    }

    public String getCourseId() {
        return courseId;
    }

    public String getCourseName() {
        return courseName;
    }
}

// Enrollment class
class Enrollment implements EnrollmentSystem {
    private List<Student> enrolledStudents;
    private List<Course> enrolledCourses;

    public Enrollment() {
        this.enrolledStudents = new ArrayList<>();
        this.enrolledCourses = new ArrayList<>();
    }

    @Override
    public void enrollStudent(Student student, Course course) {
        enrolledStudents.add(student);
        enrolledCourses.add(course);
    }

    @Override
    public void dropStudent(Student student, Course course) {
        int index = enrolledStudents.indexOf(student);
        if (index != -1 && enrolledCourses.get(index).equals(course)) {
            enrolledStudents.remove(index);
            enrolledCourses.remove(index);
            System.out.println(student.getName() + " dropped from " + course.getCourseName());
        } else {
            System.out.println("Student is not enrolled in this course.");
        }
    }

    @Override
    public void displayEnrollmentDetails() {
        System.out.println("Enrollment Details:");
        for (int i = 0; i < enrolledStudents.size(); i++) {
            System.out.println(enrolledStudents.get(i).getName() + " is enrolled in " +
                    enrolledCourses.get(i).getCourseName());
        }
    }
}

// Main class
public class Q9 {
    public static void main(String[] args) {
        EnrollmentSystem enrollmentSystem = new Enrollment();
        Student student1 = new Student("S001", "Alice");
        Student student2 = new Student("S002", "Bob");
        Course course1 = new Course("C001", "Math");
        Course course2 = new Course("C002", "English");

        // Enroll students
        enrollmentSystem.enrollStudent(student1, course1);
        enrollmentSystem.enrollStudent(student2, course2);

        // Display enrollment details
        enrollmentSystem.displayEnrollmentDetails();

        // Drop a student
        enrollmentSystem.dropStudent(student1, course1);

        // Display updated enrollment details
        enrollmentSystem.displayEnrollmentDetails();
    }
}
