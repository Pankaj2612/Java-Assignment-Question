import java.util.Scanner;

class Node{

    int info;
    Node next;
    Node(int info){
        this.info = info;
        this.next = null;
    }
}

public class StackDemo2 {
    public static Node push(Node top) {
        
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        Node newnode = new Node(x);
        newnode.next = top;
        top = newnode;

        return top;

    }

    public static Node pop(Node top) {
        if(top == null){
            System.out.println("The Stack is Empty");
            return top;
        }

        top = top.next;

        return top;
    }

    public static void display(Node top) {
        
        Node curr = top;
        while(curr!=null){

            System.out.println(curr.info);
            System.out.println("|");
            curr = curr.next;
        }

    }
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        Node top;
        top=null;
        while(true){
        System.out.println("****MENU****");
        System.out.println("0:Exit");
        System.out.println("1:Push");
        System.out.println("2:Pop");
        System.out.println("3:Display");
        System.out.println("Enter your choice");
        int choice=sc.nextInt();
        switch(choice){
        case 0:
        System.exit(0);
        case 1:
        top=push(top);
        break;

        case 2 :
        top = pop(top);
        break;

        case 3:
        display(top);
        break;
        default:
        System.out.println("Wrong choice");

    }

        }
    }
}
