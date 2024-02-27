// Developing a Simple College Management System in Java
// Create a Java program for managing colleges and students. The provided classes model the
// relationship between colleges and students.
// The College class represents a college with attributes collegeName and collegeLoc. The
// Student class represents a student with attributes studentId, studentName, and a reference
// to a College object. Enhance the Student class by adding a constructor that assigns a student
// ID, name, and college information. Additionally, add a method named displayStudentInfo()
// that prints the student's ID, name, and the college information in which they are enrolled.
// In the Main class, instantiate at least two College objects and at least two Student objects.
// Enroll each student in one of the colleges. Then, display the information of all colleges and all
// students using the appropriate methods.

class College{
    String collegeName;
    String collegeLoc;

    College(String name  , String loc){
        collegeName = name;
        collegeLoc = loc;
    }

}

class Student{
    String studentId;
    String studentName;
    College collegeRef;

    Student(String id , String name , College college){
        studentId = id;
        studentName = name;
        collegeRef = college;
    }

    public void displayStudentInfo(){

        System.out.println("Student Name : " + studentName  );
        System.out.println("Student ID : " + studentId  );
        System.out.println("College Name : " + collegeRef.collegeName  );
        System.out.println("College Location : " + collegeRef.collegeLoc  );

    }
}

public class Q5 {

    public static void main(String[] args) {
        College c1 = new College("ITER", "BBSR");
        College c2 = new College("KIIT", "BBSR");

        Student s1 = new Student("2241019205", "Pankaj", c1);
        Student s2 = new Student("2241012354", "Arun", c2);
        
        s1.displayStudentInfo();
        System.out.println();
        s2.displayStudentInfo();
    }
}
