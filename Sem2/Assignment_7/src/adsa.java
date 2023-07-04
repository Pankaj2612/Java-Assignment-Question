import java.util.Scanner;

class Node {
    int info;
    Node next;

    Node(int info) {
        this.info = info;
        this.next = null;
    }

    }

public class adsa {

    

    public static Node insert(Node rear, Node front) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the element to insert:");
        int data = sc.nextInt();
        
        Node newNode = new Node(data);
        if (rear == null) {
            rear = front = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
        
        return front;

    }
    
    public static void delete(Node rear, Node front) {
        if (front == null) {
            System.out.println("The Queue is Empty");
        } else {
            front = front.next;
            if (front == null) {
                rear = null;
            }
        }
        
    }
    
    public static void display(Node rear, Node front) {
        if (front == null) {
            System.out.println("The Queue is Empty");
        } else {
            Node curr = front;
            while (curr != null) {
                System.out.println(curr.info);
                curr = curr.next;
            }
        }
    }
    
    public static void main(String[] args) {
        Node rear = null;
        Node front = null;
        Scanner sc = new Scanner(System.in);
        

        while (true) {
            System.out.println("****MENU****");
            System.out.println("0: Exit");
            System.out.println("1: Insert");
            System.out.println("2: Delete");
            System.out.println("3: Display");
            System.out.println("Enter your choice");
            int choice = sc.nextInt();

            switch (choice) {
                case 0:
                    System.exit(0);
                    break;

                case 1:
                    rear = insert(rear, front);
                    if (front == null) {
                        front  = rear;
                    }
                    break;

                case 2:
                    delete(rear, front);
                    if (front == null) {
                        rear = null;
                    }
                    break;

                case 3:
                    System.out.println("*********************");
                    display(rear, front);
                    break;

                default:
                    System.out.println("Wrong choice");
                    break;
            }
        }
    }
}
