// Define a class called Book with instance variables BName, BEdition, BPrice. Use constructor to
// initialize the instance variables of the class. Another instance method display ( ) to display the book
// information. A person purchase 5 different books. Display the book details which has the maximum
// price. 
import java.util.Scanner;
class Book{
    String BName;
    int BEdition;
    double BPrice;

    void Input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Book Name :");
        BName = sc.nextLine();
        System.out.println("Enter Book Edition :");
        BEdition = sc.nextInt();
        System.out.println("Enter Book Prices:");
        BPrice = sc.nextDouble();
    }

    void display(){
        System.out.println("Book Name : " + BName);
        System.out.println("Book Edition : " + BEdition);
        System.out.println("Book Price : " + BPrice);
    }

}


public class HomeAssignment_02 {
    public static void main(String[] args) {
        Book[] ob = new Book[5];

        double maxprice = 0.0;
        for (int i = 0; i < ob.length; i++) {
            ob[i] = new Book();
            ob[i].Input();
        }
        for (int i = 0; i < ob.length; i++) {
            ob[i].display();
            if(ob[i].BPrice > maxprice)
                maxprice = ob[i].BPrice;
        }
        System.out.println();
        System.out.println("Maximum Priced Book is ");
        for (int i = 0; i < ob.length; i++) {
            if(ob[i].BPrice == maxprice){
                ob[i].display();
            }
        }


    }
}
