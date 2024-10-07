// Create  a  class  Country  containing  members  for  name  and  population,  along  with  a 
// constructor and necessary methods. Additionally, create a class BNode with a member 'info' to 
// store a country object, 'left' to refer to the left child, and 'right' to refer to the right child. Provide 
// the required constructor. Finally, create another class BST with a member 'root', along with the 
// necessary constructor and a method to insert a node into the binary search tree


class Country {
    String name;
    int population;

    Country(String name, int population) {
        this.name = name;
        this.population = population;
    }

}

class BNode {
    Country info;
    BNode left;
    BNode right;

    BNode(Country country) {
        this.info = country;
        this.left = null;
        this.right = null;
    }
}

class BST {
    BNode root;

    BST() {
        this.root = null;
    }

    void insertNode(Country country) {
        this.root = insertNodeRecursive(this.root, country);
    }

    private BNode insertNodeRecursive(BNode root, Country country) {
        if (root == null) {
            return new BNode(country);
        }
        if (root.info.population > country.population) {
            root.left = insertNodeRecursive(root.left, country);
        } else if (root.info.population < country.population) {
            root.right = insertNodeRecursive(root.right, country);
        }
        return root;
    }
}

public class Q3{
    public static void main(String[] args) {
        Country c1 = new Country("India1", 211212);
        Country c2 = new Country("India2", 21122222);
        Country c3 = new Country("Indi3", 222);

        BNode root = new BNode(c1);
        
        BST b = new BST();
        b.root = root;
        b.insertNode(c3);
        b.insertNode(c2);
        System.out.println(root.info.name);
        System.out.println(root.left.info.name);
        System.out.println(root.right.info.name);
    }
}
