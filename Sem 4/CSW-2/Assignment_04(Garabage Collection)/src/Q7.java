// Create a Java program for university student enrollment. Use a Student class for course
// management and student information. Implement efficient garbage collection for memory
// management. Utilize Runtime class to monitor memory usage. Override finalize() method to
// print a message on successful garbage collection.

class Student{
    String name;
    int regdno;

    Student(String name , int regdno){
        this.name = name;
        this.regdno = regdno;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Object " + name + " with RegdNo " + regdno);
    }
}

public class Q7 {

    public static void memoryuse(){
        System.out.println("Total Memory " + Runtime.getRuntime().totalMemory());
        System.out.println("Free Memory " + Runtime.getRuntime().freeMemory());
        System.out.println("Used Memory " + (Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory()));
    }
    public static void main(String[] args) {
        Student s1 = new Student("Objec1", 12);
        Student s2 = new Student("Objec2", 10);
        memoryuse();
        System.out.println();
        s1 = null;
        s2 = null;
        System.gc();
        memoryuse();
        
    }
}
