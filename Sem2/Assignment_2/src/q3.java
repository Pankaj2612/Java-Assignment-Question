// Define a class called Student with instance variables Roll, Name, DSA_Mark. Also, the class
// consists of instance methods getdata( ), showdata( ) to provide input to the instance variable
// and to display the value of instance variable. Write a program to create the details of 5 students.
// Display the information of the students who has secured the highest DSA_Mark

import java.util.Scanner;
class Student{
    int Roll;
    String Name;
    int DSA_Mark;

    void getdata(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Roll NO");
        Roll = sc.nextInt();
        System.out.println("Enter Name : ");
        Name = sc.next();
        System.out.println("Enter DSA_MARKS: ");
        DSA_Mark = sc.nextInt();
    }
    void showdata(){
        System.out.println("Roll No: " + Roll);
        System.out.println("Name: " + Name);
        System.out.println("DSA Marks: " + DSA_Mark);
    }


}

public class q3 {
    public static void main(String[] args) {
        
        Student[] stu = new Student[5];
        int highest = -1;

        for (int i = 0; i < stu.length; i++) {
            stu[i] = new Student();
            stu[i].getdata();

            if(stu[i].DSA_Mark > highest){
                highest = stu[i].DSA_Mark;
            }

        }
        System.out.println("\nStudents with the highest DSA Mark:");
        for (int i = 0; i < stu.length; i++) {
            if(stu[i].DSA_Mark== highest){
                stu[i].showdata();
            }
        }


    }
}
