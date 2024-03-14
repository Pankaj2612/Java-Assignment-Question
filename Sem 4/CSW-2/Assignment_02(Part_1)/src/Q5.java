
// Write a program to create a Student class with members name, rn, and
// total mark. Create an array of student objects and sort it using Bubble
// sort according to its rn.
// Note: Overload compareTo method of Comparable interface
import java.util.Arrays;

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
        return Integer.compare(this.rn, otherStudent.rn);
    }

    // Method to sort an array of Student objects using Bubble Sort
    public static void bubbleSort(Student[] students) {
        int n = students.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (students[j].compareTo(students[j + 1]) > 0) {
                    // Swap students[j] and students[j + 1]
                    Student temp = students[j];
                    students[j] = students[j + 1];
                    students[j + 1] = temp;
                }
            }
        }
    }
}

public class Q5 {
    public static void main(String[] args) {
        // Creating an array of student objects
        Student[] students = {
                new Student("Alice", 101, 85),
                new Student("Bob", 103, 90),
                new Student("Charlie", 102, 95),
                new Student("David", 104, 80)
        };

        // Sorting the array of student objects based on roll number using Bubble Sort
        Student.bubbleSort(students);

        // Printing the sorted array of student objects
        System.out.println("Sorted Students based on roll number:");
        for (Student student : students) {
            System.out.println("Name: " + student.getName() + ", Roll Number: " + student.getRn() + ", Total Marks: "
                    + student.getTotalMark());
        }
    }
}
