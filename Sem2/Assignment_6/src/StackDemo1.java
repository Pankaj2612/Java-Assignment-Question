import java.util.Scanner;

public class StackDemo1 {

  public static final int max = 10;

  public static int push(int s[], int top) {
    if (isFull(top)) {
      System.out.println("The Stack is Full");
    } 
    else {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter Element");
      int item = sc.nextInt();

      s[++top] = item;
    }
    return top;
  }

  public static int pop(int s[] , int top) {

        int x = 0;
        if(isEmpty(top)){
            System.out.println("The List is Empty");
            return 0;
        }

            x = s[top];

        
        
    return x;
  }

  public static void display(int s[] , int top) {

    if(isEmpty(top)){
        System.out.println("The Stack is Empty");
        return;
    }

    System.out.println("***********");
    while (top != -1) {
        System.out.println(s[top--]);
        System.out.println("|");
    }
  }

  public static boolean isEmpty(int top) {
    if(top == -1)
    return true;

    else
    return false;
}

public static boolean isFull(int top) {
    if(top ==(max-1))
    return true;

    else
    return false;

}

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int stack[] = new int[max];
    int top = -1;

    while (true) {
      System.out.println("***MENU***");
      System.out.println("0: Exit");
      System.out.println("1: Push");
      System.out.println("2: Pop");
      System.out.println("3: Display");
      System.out.println("Enter your choice");
      int choice = sc.nextInt();
      switch (choice) {
        case 0:
          System.exit(0);
        case 1:
          top = push(stack, top);
          break;
        case 2:
            System.out.println(pop(stack, top));
            top--;
            break;
        case 3:
            display(stack, top);
            break;
        
        default :
        System.out.println("Enter Valid Choice");
      }
    }
  }
}
