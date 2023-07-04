import java.util.Scanner;
public class QueueDemo1 {

public static final int MAX=5;
public static int front=-1;
public static int rear=-1;

public static void insert(int Q[])
{
    if(is_full()){
        System.out.println("The Queue is Full cannot insert Element");
        return;
    }
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    if(front == -1)
        front++;

    Q[++rear] = n;

}
public static void delete(int Q[]) {
    
    if(is_Empty()){
        System.out.println("The Queue is Empty");
        return;
    }

    for (int i = 0; i <rear ; i++) {
        Q[i] = Q[i+1];
    }
    rear--;

}
public static void display(int Q[]) {
    for (int i = 0; i <= rear; i++) {
        System.out.println(Q[i]);
    }
}
public static boolean is_full() {
    return rear == MAX-1;
}
public static boolean is_Empty() {
    return rear == -1;
}

public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    int[] Q = new int[MAX];

    while(true)
        {   
        System.out.println("***MENU***");
        System.out.println("0: Exit");
        System.out.println("1: Insert");
        System.out.println("2: Delete");
        System.out.println("3: Display");
        System.out.println("Enter your choice");
        int choice=sc.nextInt();
        switch(choice)
        {
        case 0:
        System.exit(0);
        case 1:
        insert(Q);
        break;
        case 2 :
        delete(Q);
        break;
        case 3 :
        System.out.println("*******");
        display(Q);
        break;

        default:
        System.out.println("Invalid choice");
        }
    }

}
}

