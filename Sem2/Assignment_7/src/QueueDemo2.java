import java.util.Scanner;

class Node{

    int info;
    Node next;

    Node(int info){
        this.info = info;
        this.next = null;
    }

}
public class QueueDemo2 {
 
    public static Node insert(Node rear , Node front) {
        
        
        Scanner sc = new Scanner(System.in);
        int data = sc.nextInt();
        Node newNode = new Node(data);

        if(rear == null){
            rear = front = newNode;
            return front;
        }

        rear.next = newNode;
        rear = newNode;
        
        return front;
    }

    public static Node delete(Node rear , Node front ) {
        
        if(front == null && rear == null){
            System.out.println("The Queue is Empty");
            return front;
        }

        front = front.next;

        return front;
    }

    public static void display(Node rear , Node front) {
        
        if(front == null){
            System.out.println("The Queue is Empty");
        }
        else{
        Node curr = front;

        while (curr!=null) {
            System.out.println(curr.info);
            curr = curr.next;
        }
    }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Node rear = null,front = null;
        

        while(true)
        {
        System.out.println("****MENU****");
        System.out.println("0:Exit");
        System.out.println("1:Insert");
        System.out.println("2:Delete");
        System.out.println("3:Display");
        System.out.println("Enter your choice");
        int choice=sc.nextInt();
        switch(choice)
        {
        case 0:
        System.exit(0);
        
        case 1:
        front=insert(rear,front);
        if (rear == null) {
           rear = front;
        }
        break;
        
        case 2:
        front=delete(rear,front);
        break;

        case 3:
        System.out.println("*********************");
        display(rear, front);
        break;
        
        default:
        System.out.println("Wrong choice"); 

    }

}
    }
}
