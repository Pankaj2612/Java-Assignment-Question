// Design a package that contains two classes Student & Test. The Student class has data
// members as name, roll and instance methods input ( ) & output ( ). Similarly the Test class
// has data members as mark1, mark2 and instance methods input ( ), output ( ), Student is
// extended by Test. Another package carry interface Sports with 2 attributes score1, score2.
// Find grand total mark & score in another class.




import java.util.Scanner;
class Student{

    String name;
    int roll;

    void input(){

        Scanner sc = new Scanner(System.in);
        name = sc.nextLine();
        roll = sc.nextInt();
    }

    void display(){

        System.out.println("Student Name :" + name);
        System.out.println("Student Roll_NO :" + roll);
    }



}