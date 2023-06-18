import java.util.Scanner;

class Node {
  protected int regd_no;
  protected float mark;
  protected Node next;

  Node(int regd_no, float mark) {
    this.regd_no = regd_no;
    this.mark = mark;
    this.next = null;
  }
}

class Linkedlist {

  public static void create(Node start) {
    Scanner sc = new Scanner(System.in);

    Node curr = start;
    while (true) {
      System.out.println("Enter Regd_No and Marks");
      int regd_no = sc.nextInt();
      float mark = sc.nextFloat();

      if (regd_no == -1)
        break;

      Node newnode = new Node(regd_no, mark);
      curr.next = newnode;
      curr = newnode;
    }
  }

  // Insertion
  // (i) At the beginning of the list
  public static Node InsBeg(Node start) {
    Scanner sc = new Scanner(System.in);

    if(start == null){
      System.out.println("The list is Empty");
      return start;
  }

    System.out.println("Enter Regd_No and Marks");
    int regd_no = sc.nextInt();
    float mark = sc.nextFloat();

    Node newNode = new Node(regd_no, mark);
    newNode.next = start.next;
    start.next = newNode;

    return start;
  }

  // (ii) At the end of the list
  public static Node InsEnd(Node start) {

    if(start == null){
      System.out.println("The list is Empty");
      return start;
  }
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter student registration number:");
    int regd_no = sc.nextInt();
    System.out.println("Enter mark secured in the subject:");
    float mark = sc.nextFloat();

    Node newnode = new Node(regd_no, mark);
    Node curr = start;

    while (curr.next != null) {
      curr = curr.next;
    }
    curr.next = newnode;

    return start;
  }

  // (iii) Any position
  public static Node InsAny(Node start) {

    if(start == null){
      System.out.println("The list is Empty");
      return start;
  }
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter student registration number:");
    int regd_no = sc.nextInt();
    System.out.println("Enter mark secured in the subject:");
    float mark = sc.nextFloat();
    System.out.println("Enter Position");
    int pos = sc.nextInt();

    Node newnode = new Node(regd_no, mark);
    Node curr = start;
    int i = 1;

    while (true) {
      if (i == pos) {
        newnode.next = curr.next;
        curr.next = newnode;
        break;
      }
      curr = curr.next;
      i++;
    }
    return start;
  }

  // Deletion
  // (i) From the beginning of the list
  public static Node DelBeg(Node start) {
    if (start.next == null) {
      System.out.println("The List is Empty");
      return start;
    }

    start.next = start.next.next;
    return start;
  }

  // (ii) From the end of the list
  public static Node DelEnd(Node start) {
    if (start.next == null) {
      System.out.println("The List is Empty");
      return start;
    }

    Node secondlastNode = start;
    Node lastNode = start.next;

    while (lastNode.next != null) {
      lastNode = lastNode.next;
      secondlastNode = secondlastNode.next;
    }
    secondlastNode.next = null;

    return start;
  }

  // (iii) From any position in the list
  public static Node DelAny(Node start) {

    if(start == null){
      System.out.println("The list is Empty");
      return start;
  }

    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Position");
    int pos = sc.nextInt();

    Node curr = start;
    int i = 0;

    while (true) {
      if (i == (pos - 1)) {
        curr.next = curr.next.next;
        break;
      }
      curr = curr.next;
      i++;
    }

    return start;
  }

  // (iv) Deleting a node based on student regd_no
  public static Node DelStudent(Node start) {

    if(start == null){
      System.out.println("The list is Empty");
      return start;
  }

    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Regd_No");
    int regd_no = sc.nextInt();

    Node curr = start;

    while (curr.next != null && curr.next.regd_no != regd_no) {
      curr = curr.next;
    }

    if (curr.next == null) {
      System.out.println("The Element is not Present in the List");
    } else {
      curr.next = curr.next.next;
    }

    return start;
  }

  public static void search(Node start) {
    Scanner sc = new Scanner(System.in);

    if(start == null){
      System.out.println("The list is Empty");
      return;
  }

    System.out.println("Enter Students Regd_NO : ");
    int regd_no = sc.nextInt();

    Node curr = start;
    while (curr != null && curr.regd_no != regd_no) {
      curr = curr.next;
    }

    if (curr == null) {
      System.out.println("The Element is not Present in the List");
    } else {
      System.out.println("Enter Students Marks to update : ");
      float marks = sc.nextFloat();

      curr.mark = marks;
      display(start);
    }
  }

  // (d) Sort the nodes of the linked list according to the mark secured by the student from
  // higher to lower.
  // Method Prototype: public static Node sort(Node start)
 public static Node sort(Node start) {
  if (start == null || start.next == null) {
    // Empty list or single node, no need to sort
    return start;
  }

  boolean swapped;
  Node last = null;

  do {
    swapped = false;
    Node curr = start;
    Node prev = null;

    while (curr.next!= last) {
      if (curr.mark < curr.next.mark) {
        // Swap the nodes
        Node nextNode = curr.next;
        
        if (prev == null) {
          // Updating start node
          start = nextNode;
        } else {
          prev.next = nextNode;
        }
        
        curr.next = nextNode.next;
        nextNode.next = curr;
        prev = nextNode;
        swapped = true;
      } else {
        prev = curr;
        curr = curr.next;
      }
    }
    
    last = curr;
  } while (swapped);

  return start;
}


  // (e) Count the number of nodes present in the linked list
  // Method Prototype: public static int count(Node start)
  public static int count(Node start) {
    int size = 1;
    Node curr = start;

    while (curr.next != null) {
      size++;
      curr = curr.next;
    }

    return size;
  }

  // (f) Reverse the linked list
  // Method Prototype: public static Node reverse(Node start)
  public static Node reverse(Node start) {
    Node prev = null;
    Node curr = start;
    Node next = null;

    while (curr != null) {
      next = curr.next;
      curr.next = prev;
      prev = curr;
      curr = next;
    }

    return prev;
  }

  // (g) Displaying all the nodes in the list
  // The prototype of the display function should be as follows.
  // public static void display(Node start)
  public static void display(Node start) {
    Node curr = start.next;

    while (curr != null) {
      System.out.println("Registration Number: " + curr.regd_no);
      System.out.println("Mark: " + curr.mark);
      System.out.println("--------------------------");
      curr = curr.next;
    }
  }
}

public class Q1{
  public static void main(String args[]) {
    Linkedlist list = new Linkedlist();
    Node start = new Node(0, 0);
    list.create(start);

    while (true) {
      System.out.println("\n*** MENU ***");
      System.out.println("1. Insertion");
      System.out.println("2. Deletion");
      System.out.println("3. Search and Update");
      System.out.println("4. Sort the List");
      System.out.println("5. Count the Number of Nodes");
      System.out.println("6. Reverse the List");
      System.out.println("7. Display the List");
      System.out.println("8. Exit");

      Scanner sc = new Scanner(System.in);
      System.out.println("Enter your choice:");
      int choice = sc.nextInt();

      switch (choice) {
        case 1:
          System.out.println("1. Insert at the Beginning");
          System.out.println("2. Insert at the End");
          System.out.println("3. Insert at any Position");
          System.out.println("Enter your choice:");
          int insChoice = sc.nextInt();
          switch (insChoice) {
            case 1:
              start = list.InsBeg(start);
              break;
            case 2:
              start = list.InsEnd(start);
              break;
            case 3:
              start = list.InsAny(start);
              break;
            default:
              System.out.println("Invalid choice!");
              break;
          }
          break;
        case 2:
          System.out.println("1. Delete from the Beginning");
          System.out.println("2. Delete from the End");
          System.out.println("3. Delete from any Position");
          System.out.println("4. Delete based on Regd_No");
          System.out.println("Enter your choice:");
          int delChoice = sc.nextInt();
          switch (delChoice) {
            case 1:
              start = list.DelBeg(start);
              break;
            case 2:
              start = list.DelEnd(start);
              break;
            case 3:
              start = list.DelAny(start);
              break;
            case 4:
              start = list.DelStudent(start);
              break;
            default:
              System.out.println("Invalid choice!");
              break;
          }
          break;
        case 3:
          list.search(start);
          break;
        case 4:
          start = list.sort(start);
          list.display(start);
          break;
        case 5:
          int size = list.count(start);
          System.out.println("Number of Nodes: " + size);
          break;
        case 6:
          start = list.reverse(start);
          list.display(start);
          break;
        case 7:
          list.display(start);
          break;
        case 8:
          System.exit(0);
          break;
        default:
          System.out.println("Invalid choice!");
          break;
      }
    }
  }
}

