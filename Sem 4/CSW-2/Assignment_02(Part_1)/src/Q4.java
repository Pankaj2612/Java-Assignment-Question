// Write a program to create a Student class with members name, rn, and
// totalMark. Create an array of student objects and search a student object
// using linear search from the array.
// Note: Overload compareTo method of Comparable interface

class Student implements Comparable<Student> {
    private String name;
    private int rn;
    private int totalMark;

    // Constructor
    public Student(String name, int rn, int totalMark) {
        this.name = name;
        this.rn = rn;
        this.totalMark = totalMark;
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getRn() {
        return rn;
    }

    public int getTotalMark() {
        return totalMark;
    }

    // Overloaded compareTo method of Comparable interface
    @Override
    public int compareTo(Student otherStudent) {
        return Integer.compare(this.totalMark, otherStudent.totalMark);
    }

    // Method to search a student by roll number
    public static Student search(Student[] students, int rollNumber) {
        for (Student student : students) {
            if (student.getRn() == rollNumber) {
                return student;
            }
        }
        return null; // Student not found
    }
}

public class Q4 {
    public static void main(String[] args) {
        // Creating an array of student objects
        Student[] students = {
                new Student("Alice", 101, 85),
                new Student("Bob", 102, 90),
                new Student("Charlie", 103, 95),
                new Student("David", 104, 80)
        };

        // Searching for a student by roll number
        int rollNumberToSearch = 103;
        Student foundStudent = Student.search(students, rollNumberToSearch);

        // Displaying search result
        if (foundStudent != null) {
            System.out.println("Student found:");
            System.out.println("Name: " + foundStudent.getName());
            System.out.println("Roll Number: " + foundStudent.getRn());
            System.out.println("Total Marks: " + foundStudent.getTotalMark());
        } else {
            System.out.println("Student with roll number " + rollNumberToSearch + " not found.");
        }
    }
}
