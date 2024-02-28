// Design a package that contains two classes Student & Test. The Student class has data
// members as name, roll and instance methods input ( ) & output ( ). Similarly the Test class
// has data members as mark1, mark2 and instance methods input ( ), output ( ), Student is
// extended by Test. Another package carry interface Sports with 2 attributes score1, score2.
// Find grand total mark & score in another class.



import java.util.Scanner;

interface Sports{
    static int score1=9;
    static int score2 = 8;
}

class Student{

    String name;
    int roll;

    Scanner sc = new Scanner(System.in);
    void input(){

        System.out.println("Enter the Name and Roll no of the Student :");
        name = sc.next();
        roll = sc.nextInt();
    }

    void output(){

        System.out.println("Student Name :" + name);
        System.out.println("Student Roll_NO :" + roll);
    }



}

class Test extends Student{
    int mark1,mark2,total;

    @Override
    void input(){
        super.input();
        System.out.println("Enter Marks of Student:");
        mark1 = sc.nextInt();
        mark2 = sc.nextInt();
        total = mark1 + mark2;

    }
    void output(){
        System.out.println("Mark1 = " + mark1);
        System.out.println("Mark2 = " + mark2);
    }
}

public class Q10{
    public static void main(String[] args) {
        Test ob = new Test();
        ob.input();
        ob.output();
        System.out.println("Grand Total Mark= " + ob.total );
        System.out.print("Grand Total Score = ");
        System.out.println(Sports.score1 + Sports.score2 );
    }
}